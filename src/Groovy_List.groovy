/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
class Groovy_List {

    static def numList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

    static def heterogeneousList = [11, 'Hello', true]


    Groovy_List() {
        FileIO fio = new FileIO();
        fio.init()
    }

    static def getListSize() {
        def size = heterogeneousList.size()
        printf("heterogeneous list contains %d elements \n", size)
        return numList.size()
    }

    static def addInNumList(int i) {
        numList.add(i);
        numList.add(10, "Exception")
        return numList
    }

    static def listManipulationUsingSquareBrackets() {
        def letters = ['a', 'b', 'c', 'd']

        println(letters[0] + " " + letters[1])
        println(letters[-1] + " " + letters[-2])
        letters[2] = 'C'
        println(letters[2])
        letters << 'e'
        println(letters[4] + " " + letters[-1])
        println(letters[1, 3] + " " + letters[2..4])
    }

    static def deleteInNumList(int i) {
        return numList.remove(i)
    }

    static loopInList() {
        Iterator it = numList.iterator()
        int i = 0
        println("********************LOOPING IN LIST USING WHILE LOOP WITH ITERATOR****************************")
        while (it.hasNext()) {
            println("Element at position [" + i + "] " + "is [" + it.next() + "]")
            i++
        }
        println("********************LOOPING IN LIST USING FOR LOOP****************************")
        for (int j = 0; j < numList.size(); j++) {
            println("Element at position [" + j + "] " + "is [" + numList.get(j) + "]")
        }

        println("********************LOOPING IN LIST USING ADVANCED FOR LOOP****************************")
        for (String temp : numList) {
            println(temp)
        }
    }

    static def listLoopingBenchmark() {
        def alist = [0]
        def start, end
        for (int i = 0; i < 10000000; i++) {
            alist.add(String.valueOf(i))
        }

        ListIterator<String> itr = alist.listIterator()
        start = System.currentTimeMillis()
        while (itr.hasNext()) {
            String s = itr.next()
        }
        end = System.currentTimeMillis()
        println("Iterator start: " + start + ", end: " + end + ", delta: " + (end - start))
        start = System.currentTimeMillis()
        int ixx = 0
        for (int i = 0; i < 10000000; i++) {
            String s = alist.get(i)
        }
        System.out.println(ixx)
        end = System.currentTimeMillis()
        println("for loop start: " + start + ", end: " + end + ", delta: " + (end - start))

        start = System.currentTimeMillis()
        for (def items : alist) {
            def aa = items
        }
        end = System.currentTimeMillis()
        println("Advanced for loop start: " + start + ", end: " + end + ", delta: " + (end - start))
    }
}
