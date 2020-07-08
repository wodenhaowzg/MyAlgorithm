package com.example.myalgorithm;

import com.example.myalgorithm.tree.BinaryTree;
import com.example.myalgorithm.tree.BinaryTreeNode;

class MainClass {

    public static void main(String[] args){
        //        testDijkstraAlgorithm()

        /**
         *                  a
         *             b         c
         *         #      d    #    #
         *             #     #
         *  # 代表空结点
         */
//        String[] strs = new String[]{"a", "b", "#", "d", "#", "#", "c", "#", "#"};
        String[] strs = new String[]{"1", "2", "4", "5", "3", "6", "7"};
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.rootBinaryTreeNode = new BinaryTreeNode();
        binaryTree.rootBinaryTreeNode = binaryTree.createBinaryTree(strs);
        binaryTree.preOrderTraverse(binaryTree.rootBinaryTreeNode);

//        /**
//         *                  a
//         *             b         c
//         *         #      d    #    #
//         *             #     #
//         *  # 代表空结点
//         */
//        String[] inOrderStrs = new String[]{"#", "b", "#", "d", "#", "a", "#", "c", "#"};
//        BinaryTree inorderBinaryTree = new BinaryTree();
//        inorderBinaryTree.rootBinaryTreeNode = new BinaryTreeNode();
//        inorderBinaryTree.rootBinaryTreeNode = inorderBinaryTree.createInorderBinaryTree(inOrderStrs);

//        binaryTree.preOrderTraverse(binaryTree.rootBinaryTreeNode);
    }

    // 测试狄克斯特拉算法，图解算法中的练习题7.1
//    private fun testDijkstraAlgorithm() {
//        val costs = mutableMapOf<String, Int>()
//        costs["A"] = 5
//        costs["B"] = 2
//        costs["C"] = Int.MAX_VALUE // 上边右侧点
//        costs["D"] = Int.MAX_VALUE // 下边右侧点
//        costs["End"] = Int.MAX_VALUE
//
//        val graph = mutableMapOf<String, Map<String, Int>>()
//
//        val startGraph = mutableMapOf<String, Int>()
//        startGraph["A"] = 5
//        startGraph["B"] = 2
//        graph["Start"] = startGraph
//
//        val aGraph = mutableMapOf<String, Int>()
//        aGraph["C"] = 4
//        aGraph["D"] = 2
//        graph["A"] = aGraph
//
//        val bGraph = mutableMapOf<String, Int>()
//        bGraph["A"] = 8
//        bGraph["D"] = 7
//        graph["B"] = bGraph
//
//        val cGraph = mutableMapOf<String, Int>()
//        cGraph["D"] = 6
//        cGraph["End"] = 3
//        graph["C"] = cGraph
//
//        val dGraph = mutableMapOf<String, Int>()
//        dGraph["End"] = 1
//        graph["D"] = dGraph
//
//        // 不用添加终点End，终点没有邻居节点
//
//        val parent = mutableMapOf<String, String>()
//        parent["A"] = "Start"
//        parent["B"] = "Start"
//        parent["C"] = ""
//        parent["D"] = ""
//        parent["End"] = ""
//
//        val processed = arrayListOf<String>()
//
//        dijkstraAlgorithm(costs, graph, parent, processed)
//
//        Log.d("wzgtest", costs.toString())
//        Log.d("wzgtest", parent.toString())
//    }
//
//    private fun dijkstraAlgorithm(
//        costs: MutableMap<String, Int>,
//        graph: MutableMap<String, Map<String, Int>>,
//        parent: MutableMap<String, String>,
//        processed: ArrayList<String>
//    ) {
//        // 首先找到从起点出发，花费最少的节点，并且未处理过。
//        var lowestCostNode: String? = findLowestCostNode(costs, processed)
//        // 如果没找到，说明所有节点已处理过
//        while (lowestCostNode != null) {
//            // 从起点到当前开销最低的节点值，该节点暂叫A
//            val cost = costs[lowestCostNode]
//            // 查找该节点A的邻居
//            val nodeGraph = graph[lowestCostNode]
//            nodeGraph?.forEach {
//                // 节点A到该邻居节点的开销
//                val graphNodeName = it.key
//                val graphNodeCost = it.value
//                // 起点到节点A到开销，再加到该邻居节点到开销
//                val newCost = cost?.plus(graphNodeCost)
//                // 从起点开始到该邻居节点到开销
//                val oriCost = costs[graphNodeName]
//                // 如果新的开销小于原本的开销
//                if (newCost!! < oriCost!!) {
//                    // 更新该邻居节点的父节点
//                    parent[graphNodeName] = lowestCostNode!!
//                    // 更新起点到该邻居节点到开销
//                    costs.put(graphNodeName, newCost)
//                }
//            }
//            // 所有邻居节点都遍历完后，将节点A标记为已处理
//            processed.add(lowestCostNode)
//            // 接着处理下一个节点
//            lowestCostNode = findLowestCostNode(costs, processed)
//        }
//    }
//
//    // 获取离起点最近的节点
//    fun findLowestCostNode(costs: MutableMap<String, Int>, processed: ArrayList<String>): String? {
//        var lowestNode: String? = null
//        var lowestCost = Int.MAX_VALUE
//        costs.forEach() {
//            val nodeName = it.key
//            val nodeCost = it.value
//            if (nodeCost < lowestCost && !processed.contains(nodeName)) {
//                lowestCost = nodeCost
//                lowestNode = nodeName;
//            }
//        }
//        return lowestNode;
//    }


}
