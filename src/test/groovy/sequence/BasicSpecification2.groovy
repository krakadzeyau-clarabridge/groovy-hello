package sequence

/**
 * Another basic specification.
 */
class BasicSpecification2 extends BasicSpecification1 {

    void setupSpec() {
        println "2.  setupSpec"
    }

    void setup() {
        println "2.  setup"
    }

    void cleanup() {
        println "2.  cleanup"
    }

    void cleanupSpec() {
        println "2.  cleanupSpec"
    }

}
