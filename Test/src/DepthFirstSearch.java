
public class DepthFirstSearch {

	private Graph G;
	private boolean[] visited;
	private int[] edgeTo;

	public DepthFirstSearch(Graph G, int v) {
		this.G = G;

	}

	private void dfs(int v) {
		visited[v] = true;
		G.adjList(v).forEachRemaining(u -> {
			edgeTo[u] = v;
			dfs(u);
		});
	}

}
