/**
 * Generated from platform:/resource/hu.bme.mit.viatra.ttc.dse/src/hu/bme/mit/viatra/ttc/dse/queries/queries.vql
 */
package hu.bme.mit.viatra.ttc.dse.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.ttc.dse.queries.MmiPartialMatch;
import hu.bme.mit.viatra.ttc.dse.queries.MmiPartialMatcher;
import hu.bme.mit.viatra.ttc.dse.queries.util.DmmQuerySpecification;
import hu.bme.mit.viatra.ttc.dse.queries.util.EncapsulatedQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MmiPartialMatcher in a type-safe way.
 * 
 * @see MmiPartialMatcher
 * @see MmiPartialMatch
 * 
 */
@SuppressWarnings("all")
public final class MmiPartialQuerySpecification extends BaseGeneratedEMFQuerySpecification<MmiPartialMatcher> {
  private MmiPartialQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static MmiPartialQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MmiPartialMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MmiPartialMatcher.on(engine);
  }
  
  @Override
  public MmiPartialMatcher instantiate() throws ViatraQueryException {
    return MmiPartialMatcher.create();
  }
  
  @Override
  public MmiPartialMatch newEmptyMatch() {
    return MmiPartialMatch.newEmptyMatch();
  }
  
  @Override
  public MmiPartialMatch newMatch(final Object... parameters) {
    return MmiPartialMatch.newMatch((architectureCRA.Class) parameters[0], (architectureCRA.Class) parameters[1], (architectureCRA.Method) parameters[2], (architectureCRA.Method) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MmiPartialQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link MmiPartialQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MmiPartialQuerySpecification INSTANCE = new MmiPartialQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MmiPartialQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pC1 = new PParameter("c1", "architectureCRA.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pC2 = new PParameter("c2", "architectureCRA.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pM1 = new PParameter("m1", "architectureCRA.Method", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Method")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pM2 = new PParameter("m2", "architectureCRA.Method", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Method")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pC1, parameter_pC2, parameter_pM1, parameter_pM2);
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.viatra.ttc.dse.queries.mmiPartial";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("c1","c2","m1","m2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_c1 = body.getOrCreateVariableByName("c1");
      		PVariable var_c2 = body.getOrCreateVariableByName("c2");
      		PVariable var_m1 = body.getOrCreateVariableByName("m1");
      		PVariable var_m2 = body.getOrCreateVariableByName("m2");
      		new TypeConstraint(body, new FlatTuple(var_c1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Class")));
      		new TypeConstraint(body, new FlatTuple(var_c2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Class")));
      		new TypeConstraint(body, new FlatTuple(var_m1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Method")));
      		new TypeConstraint(body, new FlatTuple(var_m2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://momot.big.tuwien.ac.at/architectureCRA/1.0", "Method")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_c1, parameter_pC1),
      		   new ExportedParameter(body, var_c2, parameter_pC2),
      		   new ExportedParameter(body, var_m1, parameter_pM1),
      		   new ExportedParameter(body, var_m2, parameter_pM2)
      		));
      		//     find encapsulated(c1, m1)
      		new PositivePatternCall(body, new FlatTuple(var_c1, var_m1), EncapsulatedQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find encapsulated(c2, m2)
      		new PositivePatternCall(body, new FlatTuple(var_c2, var_m2), EncapsulatedQuerySpecification.instance().getInternalQueryRepresentation());
      		//     find dmm(m1,m2)
      		new PositivePatternCall(body, new FlatTuple(var_m1, var_m2), DmmQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
