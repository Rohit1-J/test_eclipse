import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int V; // number of vertices
	private LinkedList<Integer>[] adjList; // Adjacency List

	@SuppressWarnings("unchecked")
	public Graph(int N) {
		this.V = N;
		adjList = (LinkedList<Integer>[]) new LinkedList[N];

		for (int i = 0; i < adjList.length; i++) {
			adjList[i] = new LinkedList<>();
		}
	}

	public void connect(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	public int V() {
		return V;
	}

	public Iterator<Integer> adjList(int u) {
		return adjList[u].iterator();
	}

}
