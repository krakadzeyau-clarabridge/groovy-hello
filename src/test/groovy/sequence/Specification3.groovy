package sequence

import spock.lang.Stepwise
import spock.lang.Unroll

/**
 * Use <code>@Stepwise</code> to execute feature methods sequentially in their declared order.
 * Use <code>@Unroll</code> to make feature examples visible as separate features in reports.
 */
@Stepwise
@Unroll
class Specification3 extends BasicSpecification2 {

    void setupSpec() {
        println "3.  setupSpec"
    }

    void setup() {
        println "3.  setup"
    }

    void cleanup() {
        println "3.  cleanup"
    }

    void cleanupSpec() {
        println "3.  cleanupSpec"
    }

    /**
     * Does not use BDD.
     */
    void featureMethod1() {
        expect:

        println "3.  feature 1"
        true
    }

    /**
     * Uses BDD.
     */
    void featureMethod2() {
        expect:

        println "3.  feature 2.  Case $x"
        x > 0

        /**
         * Two examples.
         */
        where:
        x << [1, 2]
    }

}
