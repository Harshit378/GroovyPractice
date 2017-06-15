import groovy.util.logging.Log

import java.util.logging.Logger

/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
class Groovy_Strings {

    def singleQuotedString = 'Hello World'

    static def multiLineString = ''' Dear Mr John Doe,

    You're the winner of the lottery!

    Yours sincerely,

    Dave '''

    def doubleQuotedString = "John Doe"

    // String concatenation in Groovy
    static Object stringConcatenate(def a, def b) {
        return a + b
    }

    // String Interpolation in Groovy
    static def getInterpolated() {
        println("Example of string Interpolation in Groovy \n")
        def first = "Hello"
        def second = "${first} World"
        return second
    }

    // Hashcode comparison between java String and groovy GString
    static def compareHashcode(def a, java.lang.String b) {
        def hash1 = a.hashCode()
        def hash2 = b.hashCode()
        return (hash1 == hash2)

    }

    static def printTripleQuotedString() {
        println("************************************ \n Triple quoted strings are printed the way they are written " +
                "i.e. with same spacing and wrapping");
        println "\n" + multiLineString;

    }

    static slashyString(){
        def first = /This is slashy String/;
        if (first.contains('slashy')){
            println "Contains";
        }

        def second = /Example of interpolation in slashyString ${first}/
        if(second.contains(first)){
            println "Second string contains first string and Second string : " + second;
        }
    }

    static dollarSlashyString(){
        println("************************************");
        def name = 'Gulliver'
        def date = 'May, 4th'
        def dss = $/ Example of dollar slashy string
        which is multiline and can be interpolated.
        Name = ${name} 
        Date = ${date}. To escape dollar sign use another dollar sign like : $$
        $/ escaping forward slash       
                /$
        println(dss)
    }

    static defineChar(){
        println("************************************");
        println("Three ways to define char in groovy")
        char a = 'A'
        def b = (char) 'B'
        def c = 'C' as char
        println("Specifying 'char' type " + a)
        println(" using type coercion with the 'as' operator" + b)
        println("by casting to char " + c)

        FileIO fio = new FileIO();
        fio.log("Defined characters in three ways")

    }
}

