import static org.codehaus.groovy.runtime.DefaultGroovyMethods.intdiv

class Numbers {	
	
	static def method(){
		Groovy_Numbers gn = new Groovy_Numbers()
		
		String type = gn.returnInstance(123456_123456789_48)
		println("Numeral type : " + type)
		
		// Power operator in Groovy is represented by **
		def cubeResult = gn.powerOperatorUsage(-8,3)
		println(cubeResult)
		
		def divisionResult = intdiv(64, 2)
		println("Default method intdiv result with 64 and 2: " + divisionResult)
	}

}
