/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
Groovy_List gl = new Groovy_List()
FileIO fio = new FileIO()

def size = gl.getListSize()
fio.log(size)

// Adding into list
def addList = gl.addInNumList(50)
fio.log("************************************************")
fio.log("List after adding the element is :" + addList)

gl.listManipulationUsingSquareBrackets()

// Delete from List
def deleteList = gl.deleteInNumList(2)
fio.log("************************************************")
printf("Removed %d from the list \n", deleteList)
fio.log("Current elements in the list are :" + gl.numList)

// Looping in list
fio.log("********************LOOPING IN LIST****************************")
gl.loopInList()

gl.listLoopingBenchmark()
fio.log("********************Check the speed of various methods to retrieve data from list****************************")