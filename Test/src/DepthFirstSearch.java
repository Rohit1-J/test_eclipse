import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DepthFirstSearch {

	private Graph G;
	private boolean[] visited;
	private int[] edgeTo;

	public DepthFirstSearch(Graph G, int v) {
		this.G = G;
		visited = new boolean[G.V()];
		edgeTo = new int[G.V()];
		dfs(v);
	}

	private void dfs(int v) {
		visited[v] = true;
		Iterator<Integer> itr = G.adjList(v);
		while (itr.hasNext()) {
			Integer u = (Integer) itr.next();
			if (!visited[u]) {
				edgeTo[u] = v;
				dfs(u);
			}
		}
	}

	public boolean hasPathTo(int v) {
		return visited[v];
	}

	public Iterator<Integer> pathTo(int v) {
		List<Integer> pathList = new ArrayList<>();
		if (hasPathTo(v)) {
			int i = v;
			while (edgeTo[i] != i) {
				pathList.add(i);
				i = edgeTo[i];
			}
		}
		return pathList.iterator();
	}

}
