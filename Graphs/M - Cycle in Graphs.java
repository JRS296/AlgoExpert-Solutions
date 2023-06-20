package Graphs;

//Simple DFS + Visited state
import java.util.*;

class Program {

  public boolean cycleInGraph(int[][] edges) {
    for(int i=0; i<edges.length; i++) {
      if(dfs(edges, i, new HashSet<Integer>())) return true;
    }
    return false;
  }

  public boolean dfs(int[][] graph, int vertex, HashSet<Integer> visited) {
    if(!visited.add(vertex)) return true;

    for(int i: graph[vertex]) {
      System.out.println(i);
      if(dfs(graph, i, visited)) return true;
    }

    visited.remove(vertex);

    return false;
  }
}
