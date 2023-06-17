package Graphs;

import java.util.*;

class Program {
  // Do not edit the class below except
  // for the depthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      List<String> ans = new ArrayList<String>();
      preHelper(name, ans, children);
      return ans;
    }

    public void preHelper(String root, List<String> pre, List<Node> children) {
        pre.add(root);
        for(Node x: children)
          preHelper(x.name, pre, x.children);
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
