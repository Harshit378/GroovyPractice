import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.swing.SwingBuilder

import javax.swing.*
import java.awt.*

/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
class JsonParser {

    static JsonParser jsonParser = new JsonParser()

    static def File jsonFile

    static storeJsonData() {
        jsonFile = new File("C:\\Users\\Harshit_Tiwari\\Desktop\\test.json")
        def json = jsonFile.text

        def slurper = new JsonSlurper();
        def jObj = slurper.parseText(json)

        def windowMap = jObj.widget.window;
        println("****************************************************************************************")
        for (Map.Entry<String, String> ent : windowMap.entrySet()) {
            printf("Value for the key %s is %s \n", ent.getKey(), ent.getValue())
        }

        def imageMap = jObj.widget.image;
        println("****************************************************************************************")
        for (Map.Entry<String, String> ent : imageMap.entrySet()) {
            printf("Value for the key %s is %s \n", ent.getKey(), ent.getValue())
        }

        def textMap = jObj.widget.text;
        println("****************************************************************************************")
        for (Map.Entry<String, String> ent : textMap.entrySet()) {
            printf("Value for the key %s is %s \n", ent.getKey(), ent.getValue())
        }

    }

    static def getInstance() {
        return jsonParser;
    }

    static def swin() {

// Create a builder
        def myapp = new SwingBuilder()

// Compose the builder
        def myframe = myapp.frame(title: 'Tutorials Point', location: [200, 200],
                size: [400, 300], defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE) {
            panel(layout: new GridLayout(3, 2, 5, 5)) {
                label(text: 'Student Name:', horizontalAlignment: JLabel.RIGHT)
                textField(text: '', columns: 10)

                label(text: 'Subject Name:', horizontalAlignment: JLabel.RIGHT)
                textField(text: '', columns: 10)

                label(text: 'School Name:', horizontalAlignment: JLabel.RIGHT)
                textField(text: '', columns: 10)
            }
        }

// The following  statement is used for displaying the form
        myframe.setVisible(true)
    }

    def convertToJson() {
        def mp = Groovy_Maps.gMap;

        println("**************************************************************************************** \nPrinting keys and values present in the map \n")
        for(Map.Entry<String, String> e : mp.entrySet()){
            printf("Key = [%s] and corresponding Value = [%s] \n", e.getKey(), e.getValue())
        }

        def jOp = JsonOutput.toJson(mp)
        println(jOp)
    }

}
