package com.kevin;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) throws Exception {
        String json = "{\"foo\": {\"bar\": {\"baz\": [{\"one\": 1}, {\"two\": 2},{\"three\": 3}]}}}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        List<String> dotPaths = new ArrayList<>();
        convertToDotNotation(rootNode, "", dotPaths);

        for (String path : dotPaths) {
            System.out.println(path);
        }
    }

    private static void convertToDotNotation(JsonNode node, String currentPath, List<String> dotPaths) {
        if (node.isObject()) {
            node.fields().forEachRemaining(entry -> {
                String key = entry.getKey();
                JsonNode value = entry.getValue();
                String newPath = currentPath.isEmpty() ? key : currentPath + "." + key;
                convertToDotNotation(value, newPath, dotPaths);
            });
        } else if (node.isArray()) {
            int index = 0;
            for (JsonNode element : node) {
                String newPath = currentPath + "[" + index + "]";
                convertToDotNotation(element, newPath, dotPaths);
                index++;
            }
        } else {
            dotPaths.add(currentPath);
        }
    }
}
