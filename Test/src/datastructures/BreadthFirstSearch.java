
package datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	private Graph G;
	private boolean[] visited;
	private int[] edgeTo;
	private int[] distanceMap;

	public BreadthFirstSearch(Graph G, int v) {
		this.G = G;
		this.visited = new boolean[G.V()];
		this.edgeTo = new int[G.V()];
		this.distanceMap = new int[G.V()];

	}

	private void bfs(Graph G, int v) {

		Queue<Integer> q = new LinkedList<>();
		q.offer(v);

		while (!q.isEmpty()) {
			int temp = q.poll();
			Iterator<Integer> itr = G.adjList(temp);
			while (itr.hasNext()) {
				Integer u = (Integer) itr.next();
				q.offer(u);
			}
		}

	}

}
