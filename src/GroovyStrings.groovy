/*Groovy_Strings gs = new Groovy_Strings()
def interpolatedString = gs.getInterpolated()
println("String interpolation in Groovy : \n" + interpolatedString)

String javaString = "StylinProfilin"
int len = javaString.length()
System.out.printf("Length of the word %s is %d \n", javaString, len)

def a = "Hello"
def b = "${a} World"
def comparisonResult = gs.compareHashcode(b, "Hello World")
println("Hascode comparison for GString with interpolation and Java String : " + comparisonResult)

gs.printTripleQuotedString()

gs.slashyString()

gs.dollarSlashyString()

gs.defineChar()

*//**********************************************************************************************************************/

def gArray = [1, 1, 2, 3 ,5] as int[]
println(gArray[-2])



