package hu.bme.mit.viatra.ttc.dse.queries;

import hu.bme.mit.viatra.ttc.dse.queries.ClassPairMatch;
import hu.bme.mit.viatra.ttc.dse.queries.util.ClassPairQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.viatra.ttc.dse.queries.classPair pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ClassPairMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classPair(c1 : Class, c2 : Class) {
 *     Class(c1);
 *     Class(c2);
 *     c1 != c2;
 * }
 * </pre></code>
 * 
 * @see ClassPairMatch
 * @see ClassPairProcessor
 * @see ClassPairQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ClassPairMatcher extends BaseMatcher<ClassPairMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ClassPairMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ClassPairMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ClassPairMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_C1 = 0;
  
  private final static int POSITION_C2 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ClassPairMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ClassPairMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @return matches represented as a ClassPairMatch object.
   * 
   */
  public Collection<ClassPairMatch> getAllMatches(final architectureCRA.Class pC1, final architectureCRA.Class pC2) {
    return rawGetAllMatches(new Object[]{pC1, pC2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @return a match represented as a ClassPairMatch object, or null if no match is found.
   * 
   */
  public ClassPairMatch getOneArbitraryMatch(final architectureCRA.Class pC1, final architectureCRA.Class pC2) {
    return rawGetOneArbitraryMatch(new Object[]{pC1, pC2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final architectureCRA.Class pC1, final architectureCRA.Class pC2) {
    return rawHasMatch(new Object[]{pC1, pC2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final architectureCRA.Class pC1, final architectureCRA.Class pC2) {
    return rawCountMatches(new Object[]{pC1, pC2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final architectureCRA.Class pC1, final architectureCRA.Class pC2, final IMatchProcessor<? super ClassPairMatch> processor) {
    rawForEachMatch(new Object[]{pC1, pC2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final architectureCRA.Class pC1, final architectureCRA.Class pC2, final IMatchProcessor<? super ClassPairMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pC1, pC2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
   * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassPairMatch newMatch(final architectureCRA.Class pC1, final architectureCRA.Class pC2) {
    return ClassPairMatch.newMatch(pC1, pC2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for c1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<architectureCRA.Class> rawAccumulateAllValuesOfc1(final Object[] parameters) {
    Set<architectureCRA.Class> results = new HashSet<architectureCRA.Class>();
    rawAccumulateAllValues(POSITION_C1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for c1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<architectureCRA.Class> getAllValuesOfc1() {
    return rawAccumulateAllValuesOfc1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for c1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<architectureCRA.Class> getAllValuesOfc1(final ClassPairMatch partialMatch) {
    return rawAccumulateAllValuesOfc1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for c1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<architectureCRA.Class> getAllValuesOfc1(final architectureCRA.Class pC2) {
    return rawAccumulateAllValuesOfc1(new Object[]{
    null, 
    pC2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for c2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<architectureCRA.Class> rawAccumulateAllValuesOfc2(final Object[] parameters) {
    Set<architectureCRA.Class> results = new HashSet<architectureCRA.Class>();
    rawAccumulateAllValues(POSITION_C2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for c2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<architectureCRA.Class> getAllValuesOfc2() {
    return rawAccumulateAllValuesOfc2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for c2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<architectureCRA.Class> getAllValuesOfc2(final ClassPairMatch partialMatch) {
    return rawAccumulateAllValuesOfc2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for c2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<architectureCRA.Class> getAllValuesOfc2(final architectureCRA.Class pC1) {
    return rawAccumulateAllValuesOfc2(new Object[]{
    pC1, 
    null
    });
  }
  
  @Override
  protected ClassPairMatch tupleToMatch(final Tuple t) {
    try {
    	return ClassPairMatch.newMatch((architectureCRA.Class) t.get(POSITION_C1), (architectureCRA.Class) t.get(POSITION_C2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassPairMatch arrayToMatch(final Object[] match) {
    try {
    	return ClassPairMatch.newMatch((architectureCRA.Class) match[POSITION_C1], (architectureCRA.Class) match[POSITION_C2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassPairMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ClassPairMatch.newMutableMatch((architectureCRA.Class) match[POSITION_C1], (architectureCRA.Class) match[POSITION_C2]);
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
  public static IQuerySpecification<ClassPairMatcher> querySpecification() throws ViatraQueryException {
    return ClassPairQuerySpecification.instance();
  }
}
