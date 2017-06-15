/**
 * Created by Harshit_Tiwari on 5/8/2017.
 */
class Groovy_Maps {

    // Define maps the groovy way
    static def gMap = [name: "John", age: "20", hobby: "Guitar"]

    static getValuesFromMap() {
        boolean result;
        result = gMap.name == gMap['name']
        println("gMap.name == gMap['name'] result is : " + result)
    }

    static keyCheck() {

        if (gMap.containsKey('name')) {
            println("name key is present in the map. Associated value is " + gMap.name)
        } else {
            println("name key is not present")
        }
    }

    static loopInMaps() {

        println("*********************Iterating over entries using For-Each loop***************************")
        for (Map.Entry<Integer, Integer> entry : gMap.entrySet()) {
            println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        println("*********************Iterating over keys or values using For-Each loop***************************")
        //iterating over keys only
        for (String key : gMap.keySet()) {
            System.out.println("Key = " + key);
        }

        //iterating over values only
        for (String value : gMap.values()) {
            System.out.println("Value = " + value);
        }

        println("******************Iterating using Iterator******************************")
        Iterator itr = gMap.entrySet().iterator()
        try {
            while (itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next()
                String key = entry.getKey()
                String value = entry.getValue()
                printf("Value for the key %s is %s \n", key, value)
            }
        } catch (Exception e) {
            println("Exception has occurred" + e.getMessage())
        }
    }

}
