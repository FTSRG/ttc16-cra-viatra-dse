package hu.bme.mit.viatra.ttc.dse.rules;

import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.base.DseIdPoolHelper;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import architectureCRA.ArchitectureCRAFactory;
import architectureCRA.Class;
import architectureCRA.ClassModel;
import architectureCRA.Feature;
import hu.bme.mit.viatra.ttc.dse.queries.AddFeatureMatch;
import hu.bme.mit.viatra.ttc.dse.queries.AddFeatureMatcher;
import hu.bme.mit.viatra.ttc.dse.queries.ClassModelMatch;
import hu.bme.mit.viatra.ttc.dse.queries.ClassModelMatcher;
import hu.bme.mit.viatra.ttc.dse.queries.CreateClassWithFeautreMatch;
import hu.bme.mit.viatra.ttc.dse.queries.CreateClassWithFeautreMatcher;
import hu.bme.mit.viatra.ttc.dse.queries.util.AddFeatureProcessor;
import hu.bme.mit.viatra.ttc.dse.queries.util.AddFeatureQuerySpecification;
import hu.bme.mit.viatra.ttc.dse.queries.util.ClassModelProcessor;
import hu.bme.mit.viatra.ttc.dse.queries.util.ClassModelQuerySpecification;
import hu.bme.mit.viatra.ttc.dse.queries.util.CreateClassWithFeautreProcessor;
import hu.bme.mit.viatra.ttc.dse.queries.util.CreateClassWithFeautreQuerySpecification;

public class CraDseRules {

    public DSETransformationRule<ClassModelMatch, ClassModelMatcher> createClassRule;
    public DSETransformationRule<CreateClassWithFeautreMatch, CreateClassWithFeautreMatcher> createClassWithFeatureRule;
    public DSETransformationRule<AddFeatureMatch, AddFeatureMatcher> addFeatureRule;
    
    public CraDseRules() {
        try {
            createClassRule = new DSETransformationRule<>("CreateClassRule",
                    ClassModelQuerySpecification.instance(),
                    new ClassModelProcessor() {
                        
                        @Override
                        public void process(ClassModel pCm) {
                            Class clazz = ArchitectureCRAFactory.eINSTANCE.createClass();
                            pCm.getClasses().add(clazz);
                            
                            int id = DseIdPoolHelper.INSTANCE.getId(createClassRule);
                            
                            clazz.setName("C" + id);
                        }
                    });
            
            addFeatureRule = new DSETransformationRule<>("AddFeatureRule",
                    AddFeatureQuerySpecification.instance(),
                    new AddFeatureProcessor() {
                        
                        @Override
                        public void process(Class pC, Feature pF) {
                            pC.getEncapsulates().add(pF);
                        }
                    });
            
            createClassWithFeatureRule = new DSETransformationRule<>("CreateClassWithFeature",
                    CreateClassWithFeautreQuerySpecification.instance(),
                    new CreateClassWithFeautreProcessor() {
                        @Override
                        public void process(ClassModel pCm, Feature pF) {
                            Class clazz = ArchitectureCRAFactory.eINSTANCE.createClass();
                            pCm.getClasses().add(clazz);
                            
                            int id = DseIdPoolHelper.INSTANCE.getId(createClassWithFeatureRule);
                            
                            clazz.setName("C" + id);
                            
                            clazz.getEncapsulates().add(pF);
                        }
                    });
        } catch (ViatraQueryException e) {
            throw new DSEException(e);
        }
    }
    
}