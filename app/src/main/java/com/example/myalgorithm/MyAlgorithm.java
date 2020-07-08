package com.example.myalgorithm;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyAlgorithm {

    public static int findLowestPathByDijkstra(HashMap<String, Integer> cost, HashMap<String, HashMap<String, Integer>> graph,
                                               HashMap<String, String> parent,
                                               ArrayList<String> processed, String endName) {
        if (cost == null || TextUtils.isEmpty(endName))
            return 0;

        String nodeName = findLowestNode(cost, processed);
        while (nodeName != null) {
            Integer lowestNodeCost = cost.get(nodeName);
            if (lowestNodeCost == null) {
                throw new RuntimeException("Cost has empty value! " + nodeName);
            }
            HashMap<String, Integer> graphNodes = graph.get(nodeName);
            if (graphNodes != null) {
                for (Map.Entry<String, Integer> entry : graphNodes.entrySet()) {
                    String grapNodeName = entry.getKey();
                    int graphNodeCost = entry.getValue();
                    Integer grapNodeSrcCost = cost.get(grapNodeName);
                    if (grapNodeSrcCost == null) {
                        throw new RuntimeException("Cost has empty value! " + grapNodeName);
                    }

                    int graphNodeNewCost = graphNodeCost + lowestNodeCost;
                    if (grapNodeSrcCost > graphNodeCost + lowestNodeCost) {
                        parent.put(grapNodeName, nodeName);
                        cost.put(grapNodeName, graphNodeNewCost);
                    }
                }
            }
            processed.add(nodeName);
            nodeName = findLowestNode(cost, processed);
        }

        Integer result = cost.get(endName);
        return result == null ? 0 : result;
    }

    private static String findLowestNode(HashMap<String, Integer> cost, ArrayList<String> processed) {
        String lowestNodeName = null;
        int lowestNodeCost = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : cost.entrySet()) {
            String nodeName = entry.getKey();
            int nodeCost = entry.getValue();
            if (nodeCost < lowestNodeCost && !processed.contains(nodeName)) {
                lowestNodeCost = nodeCost;
                lowestNodeName = nodeName;
            }
        }
        return lowestNodeName;
    }

}
