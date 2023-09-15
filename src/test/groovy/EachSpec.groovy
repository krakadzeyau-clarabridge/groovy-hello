import spock.lang.Specification

class EachSpec extends Specification {

    void featureMethod() {
        expect:

        [1, 100].each {
            assert it < 10
        }
    }

}
