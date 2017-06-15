//import com.eviware.soapui.config.TestCaseConfig
import com.eviware.soapui.impl.wsdl.WsdlProject
import com.eviware.soapui.impl.wsdl.WsdlTestSuite
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestRunContext
import com.eviware.soapui.model.testsuite.TestCaseRunContext
import com.eviware.soapui.model.testsuite.TestCaseRunner


/**
 * Created by Harshit_Tiwari on 5/12/2017.
 */

FileIO fio = new FileIO()
fio.init();

fio.log('Started execution of Tests')

fio.log("Execution started at " + new Date(System.currentTimeMillis()))

Groovy_Strings gs = new Groovy_Strings();
gs.defineChar();

//JSONObject jobj = new JSONObject();
//jobj.put("name", "John");
//jobj.put("age", "33");
//jobj.put("class", "XII");
//String response = jobj.toString();

File jsonFile = new File("C:\\Users\\Harshit_Tiwari\\Desktop\\test.json")
def json = jsonFile.text

fio.log("The .json response received from the rest is");
fio.printJson(json)

File xmlFile = new File("C:\\Users\\Harshit_Tiwari\\Desktop\\test.txt");
def xml = xmlFile.text

fio.log("The xml response from the server is");
fio.printXml(xml);




WsdlProject project = null;
WsdlTestSuite testSuite = new WsdlTestSuite(project, null);
//TestCaseConfig config ;
boolean forLoadTest;
WsdlTestCase testCase = new WsdlTestCase(testSuite, config, forLoadTest);

TestCaseRunner testRunner = new WsdlTestCaseRunner(testCase, null);
testRunner.gotoStep(3);
testRunner.testCase.setPropertyValue("Harshit", "HarshitPropertyValue");

TestCaseRunContext context = new WsdlTestRunContext();
println (context.expand('${#TestCase#Harshit}'));
fio.log(context.expand('${#TestCase#Harshit}'));
