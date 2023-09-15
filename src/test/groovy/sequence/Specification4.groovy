package sequence

import spock.lang.Stepwise
import spock.lang.Unroll

/**
 * Use <code>@Stepwise</code> to execute feature methods sequentially in their declared order.
 * Use <code>@Unroll</code> to make feature examples visible as separate features in reports.
 */
@Stepwise
@Unroll
class Specification4 extends Specification3 {

    void setupSpec() {
        println "4.  setupSpec"
    }

    void setup() {
        println "4.  setup"
    }

    void cleanup() {
        println "4.  cleanup"
    }

    void cleanupSpec() {
        println "4.  cleanupSpec"
    }

    /**
     * Does not use BDD.
     */
    void featureMethod1() {
        expect:

        println "4.  feature 1"
        true
    }

    /**
     * Uses BDD.
     */
    void featureMethod2() {
        expect:

        println "4.  feature 2.  Case $x"
        x > 0

        /**
         * Two examples.
         */
        where:
        x << [1, 2]
    }

}
