/**
 * Generated from platform:/resource/hu.bme.mit.viatra.ttc.dse/src/hu/bme/mit/viatra/ttc/dse/queries/queries.vql
 */
package hu.bme.mit.viatra.ttc.dse.queries.util;

import architectureCRA.Feature;
import hu.bme.mit.viatra.ttc.dse.queries.EncapsulatedMatch;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.viatra.ttc.dse.queries.encapsulated pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EncapsulatedProcessor implements IMatchProcessor<EncapsulatedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pC the value of pattern parameter c in the currently processed match
   * @param pF the value of pattern parameter f in the currently processed match
   * 
   */
  public abstract void process(final architectureCRA.Class pC, final Feature pF);
  
  @Override
  public void process(final EncapsulatedMatch match) {
    process(match.getC(), match.getF());
  }
}
