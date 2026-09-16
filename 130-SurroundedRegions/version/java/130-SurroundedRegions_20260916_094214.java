// Last updated: 9/16/2026, 9:42:14 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if (node == null) {
24            return null;
25        }
26        
27        Map<Node, Node> visited = new HashMap<>();
28        return cloneGraphHelper(node, visited);
29    }
30    
31    private Node cloneGraphHelper(Node node, Map<Node, Node> visited) {
32        Node copy = new Node(node.val);
33        visited.put(node, copy);
34        for (Node neighbor : node.neighbors) {
35            if (visited.containsKey(neighbor)) {
36                copy.neighbors.add(visited.get(neighbor));
37            } else {
38                Node neighborCopy = cloneGraphHelper(neighbor, visited);
39                copy.neighbors.add(neighborCopy);
40            }
41        }
42        return copy;
43    }
44}