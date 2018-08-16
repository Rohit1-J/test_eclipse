import java.util.LinkedList;
import java.util.Queue;

class Solution {

	private LinkedList<Integer>[] adjList;

	public int[] sumOfDistancesInTree(int N, int[][] edges) {
		adjList = new LinkedList[N];
		for (int i = 0; i < N; i++) {
			adjList[i] = new LinkedList<>();
		}

		for (int i = 0; i < N; i++) {
			connect(edges[i][0], edges[i][1]);
			connect(edges[i][1], edges[i][0]);
		}

		return null;
	}

	private void connect(int u, int v) {
		adjList[u].add(v);
	}

	private int[] distance;
	private boolean[] visited;

	private void bfs(int u) {
		visited = new boolean[adjList.length];

		Queue<Integer> q = new LinkedList<>();
		q.offer(u);
		visited[u] = true;

		while (!q.isEmpty()) {
			int temp = q.poll();
			for (int i : adjList[temp]) {
				if (!visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}

	}
}