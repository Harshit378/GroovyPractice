/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
class Groovy_Arrays {

    // Declaring array using 'as'
    static def gArray = [1, 2, 3, 4, 5] as int[]

    // Declaring array using new keyword
    static def intArray = new int[10]


    static addValuesIntoArray() {
        for (int i = 0; i < intArray.size(); i++) {
            intArray[i] = i;
        }
        int j = 0;
        while (j < gArray.size()) {
            gArray[j] = intArray[j]
            j++
        }

        for (int values : gArray) {
            println("gArray" + values)
        }
        for (int values : intArray) {
            println("intArray" + values)
        }
    }

    static printPyramid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }


}
