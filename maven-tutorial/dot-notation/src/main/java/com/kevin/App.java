package com.kevin;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.acl.NotOwnerException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args) throws Exception {
        Car myCar = new Car("honda", 10);
        // myCar.name = "honda"; error The field is not visible
        // myCar.age = 10;
        // System.out.println(myCar.getMyCarAge());
        // System.out.println(myCar.getMyCarName());

        String example = "{\"foo\": {\"bar\": [{\"baz\": 42,\"baz1\":43}]}}";
        String json = new String(Files.readAllBytes(Paths
                .get("/Users/kevinnguyen/Coding/maven-tutorial/dot-notation/src/main/java/com/kevin/json-file.json")));
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        /*
         * [] TODO : traverse json tree
         * Check if Json node is array
         * There are 3 types node in json 'array', 'value' and 'object'
         */

        // [] TODO: traverse json tree
        ArrayList<String> dotPath = new ArrayList<>();
        traverseJsonTree1(rootNode, "", dotPath);
        for (String priv : dotPath) {
            System.out.println("privilege: " + priv);
        }

    }

    public static int sum(int[] intList) {
        if (intList.length == 0)
            return 0;
        if (intList.length == 1)
            return intList[0];
        return sum(intList);
    }

    public static void traverseJsonTree1(JsonNode node, String path, ArrayList<String> dotPath) {

        for (JsonNode n : node) {
            Iterator<Entry<String, JsonNode>> iter = n.fields();
            String newPath = path;
            while (iter.hasNext()) {
                Entry<String, JsonNode> iterNode = iter.next();
                String key = iterNode.getKey();
                JsonNode value = iterNode.getValue();
                if (key.equals("id")) {
                    newPath = path.isEmpty() ? value.asText() : path + "." + value.asText();
                }
                if (key.equals("children")) {
                    traverseJsonTree1(value, newPath, dotPath);
                }
            }
            if(!n.has("children")){

                dotPath.add(newPath);
            }

        }

    }

    public static ArrayList<String> traverseJsonTree(JsonNode rootNode, String path) {
        /*
         * if(rootNode.isArray()){
         * System.out.println("Array Node ....");
         * 
         * }
         * 
         * if(rootNode.isObject()){
         * System.out.println("object node....");
         * 
         * }
         * 
         * if(rootNode.isValueNode()){
         * System.out.println("ALADIN....." + rootNode);
         * }
         */

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> childNodePriv = new ArrayList<>();
        for (JsonNode node : rootNode) {
            Iterator<Entry<String, JsonNode>> iter = node.fields();
            String newPath = "";
            while (iter.hasNext()) {
                Entry<String, JsonNode> iterNode = iter.next();
                String key = iterNode.getKey();
                JsonNode value = iterNode.getValue();
                if (key.equals("id")) {
                    newPath = path.isEmpty() ? value.asText() : path + "." + value.asText();
                }
                if (key.equals("children")) {
                    childNodePriv = processChildrenNode(value, newPath);
                }
            }
            if (childNodePriv.size() != 0) {
                for (String str : childNodePriv) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;

    }

    public static ArrayList<String> processChildrenNode(JsonNode json, String path) {
        ArrayList<String> privs = new ArrayList<>();

        for (JsonNode jsonNode : json) {
            Iterator<Entry<String, JsonNode>> iter = jsonNode.fields();
            String newPath = "";
            while (iter.hasNext()) {
                Entry<String, JsonNode> iterNode = iter.next();
                String key = iterNode.getKey();
                JsonNode value = iterNode.getValue();
                if (key.equals("id")) {

                    newPath = path.isEmpty() ? key : path + "." + value.asText();
                }
                if (key.equals("children")) {
                    processChildrenNode(value, newPath);
                }
            }
            privs.add(newPath);
        }

        return privs;
    }

    private static void printList(ArrayList<String> arr) {
        for (String element : arr) {
            System.out.println("privilege : " + element);
        }
    }
}
