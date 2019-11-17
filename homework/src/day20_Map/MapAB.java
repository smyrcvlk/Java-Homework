package day20_Map;


import java.util.HashMap;
import java.util.Map;

public class MapAB{
    public static void main(String[] args) {
        //    Modify and print the given map as follows:
//    for this problem the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together
//    and store the result under the key "ab".
//
//    {"a": "Hi", "b": "There"} → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    {"a": "Hi"} → {"a": "Hi"}
//    {"b": "There"} → {"b": "There"}

        HashMap<String, String> mapAB = new HashMap<>();
        mapAB.put("a","Hi");
        mapAB.put("b","There");

        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            mapAB.put("ab", mapAB.get("a") + mapAB.get("b"));

//
        }
        System.out.println(mapAB);
    }


}
