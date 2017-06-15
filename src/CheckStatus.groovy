import org.apache.log4j.Logger

public class CheckStatus {



	static Logger logger = Logger.getLogger(CheckStatus.class.getName());



	public static def returnStatus(def code) {


		logger.info("hhhklhl");

		logger.info("********************* Inside check status code method ******************************")
		def successRegex = ~/.* 2.. .*/
		def errorRegex = ~/.* [4-5].. .*/
		def redirectedRegex = ~/.* 3.. .*/

		def statusMessage = null;

		if (code ==~ successRegex) {
			statusMessage = "Status from server : Success"
			logger.info("Code contains 2xx")
		} else if (code ==~ errorRegex) {
			println('Code contains 4xx or 5xx')
			statusMessage = "Status from server : Error"
			throw new Exception(statusMessage)
		} else if (code ==~ redirectedRegex) {
			statusMessage = "Status from server : Redirected"
			logger.info("Code contains 3xx")
			throw new Exception(statusMessage)
		}
		logger.info("********************* Exiting check status code method ******************************")
		return statusMessage;
	}
}

