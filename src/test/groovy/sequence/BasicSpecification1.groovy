package sequence

import spock.lang.Specification

/**
 * A very basic specification (not considering a built-in one).
 *
 * You can use four fixture (setup and cleanup methods) in each specification.
 * Two of them (<code>*Spec()</code>) work on the specification level and are static by their nature.
 * Other two "wrap" each test case (a test + a data set).
 * If a feature (a test method) does not use DDT (no <code>where</code> block with multiple data sets),
 * then it contains a single example (a test case). Otherwise it contains multiple examples.
 */
class BasicSpecification1 extends Specification {

    void setupSpec() {
        println "1.  setupSpec"
    }

    void setup() {
        println "1.  setup"
    }

    void cleanup() {
        println "1.  cleanup"
    }

    void cleanupSpec() {
        println "1.  cleanupSpec"
    }

}
