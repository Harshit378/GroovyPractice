import groovy.json.JsonOutput

import java.text.SimpleDateFormat
import groovy.xml.XmlUtil;

/**
 * Created by Harshit_Tiwari on 5/12/2017.
 */
class FileIO {


    public static def logFile = null;
    static def logFilePath = "C:\\Users\\Harshit_Tiwari\\Desktop\\";

    static void init() {

        def timeMillis = System.currentTimeMillis();
        println("Date is " + timeMillis);
        def logFileName = "script_" + timeMillis + ".log";

        logFile = new File(logFileName);
    }

    static def log(def stringToWrite) {
        Date dt = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy HH:mm:ss")
        String time = sdf.format(dt);
        logFile.append("\n" + "["+time+"]"+ stringToWrite);
    }

    static def printJson(def jsonToPrint){
        JsonOutput jo = new JsonOutput();
        logFile.append("\n" + jo.prettyPrint("\n" + jsonToPrint ));
    }

    static def printXml(String xmlToPrint){
        String serializedString;
        try {serializedString = XmlUtil.serialize(xmlToPrint);
            String name = null;
            int size = name.length();

        }
        catch (Exception ex){
            logFile.append("\n Exception occurred while serializing the xml " + ex);
        }
        finally {
            logFile.append("\n" + serializedString);
        }

    }

}
