package Graphs;

import java.util.*;

class Program {
  // Do not edit the class below except
  // for the breadthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      List<String> ans = new ArrayList<String>();
      Queue<Node> q = new LinkedList<Node>();
      ans.add(name);
      bfs(name, ans, children, q);
      return ans;
    }

    public void bfs(String name, List<String> ans, List<Node> children, Queue<Node> q) {
      System.out.println(ans);
      
      for(Node x: children) {
        q.add(x);
        ans.add(x.name);
      }

      while(!q.isEmpty()) {
        Node temp = q.poll();
        bfs(temp.name, ans, temp.children, q);
      }
      return;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
