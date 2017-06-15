/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
class Groovy_Numbers {

    // primitive types
    byte b = 1
    char c = 2
    short s = 3
    int i = 4
    long l = 5

    // infinite precision
    BigInteger bi = 6

    static def returnInstance(def a) {
        def numeralType = null
        if (a instanceof Integer) {
            numeralType = 'Integer'
        } else if (a instanceof Long) {
            numeralType = 'long'
        } else if (a instanceof Byte) {
            numeralType = 'Byte'
        } else if (a instanceof Short) {
            numeralType = 'short'
        } else if (a instanceof Character) {
            numeralType = 'char'
        }
        def c = 0b1001
        def b = 0b1100
        def d = a + b
        long lng = 123456_123456789_48
        println(lng)
        return numeralType
    }

    // Usage or power operator
    static def powerOperatorUsage(def a, def b){
        return a ** b;
    }



}
