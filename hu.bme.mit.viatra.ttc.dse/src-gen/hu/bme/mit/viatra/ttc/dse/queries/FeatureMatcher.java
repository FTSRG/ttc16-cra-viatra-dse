/**
 * Generated from platform:/resource/hu.bme.mit.viatra.ttc.dse/src/hu/bme/mit/viatra/ttc/dse/queries/queries.vql
 */
package hu.bme.mit.viatra.ttc.dse.queries;

import architectureCRA.Feature;
import hu.bme.mit.viatra.ttc.dse.queries.FeatureMatch;
import hu.bme.mit.viatra.ttc.dse.queries.util.FeatureQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.viatra.ttc.dse.queries.feature pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link FeatureMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //import "http://www.eclipse.org/emf/2002/Ecore"
 * 
 * pattern feature(f : Feature) {
 *     Feature(f);
 * }
 * </pre></code>
 * 
 * @see FeatureMatch
 * @see FeatureProcessor
 * @see FeatureQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class FeatureMatcher extends BaseMatcher<FeatureMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static FeatureMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    FeatureMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (FeatureMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static FeatureMatcher create() throws ViatraQueryException {
    return new FeatureMatcher();
  }
  
  private final static int POSITION_F = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FeatureMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private FeatureMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @return matches represented as a FeatureMatch object.
   * 
   */
  public Collection<FeatureMatch> getAllMatches(final Feature pF) {
    return rawGetAllMatches(new Object[]{pF});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @return a match represented as a FeatureMatch object, or null if no match is found.
   * 
   */
  public FeatureMatch getOneArbitraryMatch(final Feature pF) {
    return rawGetOneArbitraryMatch(new Object[]{pF});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Feature pF) {
    return rawHasMatch(new Object[]{pF});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Feature pF) {
    return rawCountMatches(new Object[]{pF});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Feature pF, final IMatchProcessor<? super FeatureMatch> processor) {
    rawForEachMatch(new Object[]{pF}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Feature pF, final IMatchProcessor<? super FeatureMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pF}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pF the fixed value of pattern parameter f, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public FeatureMatch newMatch(final Feature pF) {
    return FeatureMatch.newMatch(pF);
  }
  
  /**
   * Retrieve the set of values that occur in matches for f.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Feature> rawAccumulateAllValuesOff(final Object[] parameters) {
    Set<Feature> results = new HashSet<Feature>();
    rawAccumulateAllValues(POSITION_F, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for f.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Feature> getAllValuesOff() {
    return rawAccumulateAllValuesOff(emptyArray());
  }
  
  @Override
  protected FeatureMatch tupleToMatch(final Tuple t) {
    try {
    	return FeatureMatch.newMatch((Feature) t.get(POSITION_F));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected FeatureMatch arrayToMatch(final Object[] match) {
    try {
    	return FeatureMatch.newMatch((Feature) match[POSITION_F]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected FeatureMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return FeatureMatch.newMutableMatch((Feature) match[POSITION_F]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<FeatureMatcher> querySpecification() throws ViatraQueryException {
    return FeatureQuerySpecification.instance();
  }
}
