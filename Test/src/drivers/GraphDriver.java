package drivers;

import java.util.Iterator;

import datastructures.DepthFirstSearch;
import datastructures.Graph;

public class GraphDriver {
	public static void main(String[] args) {
		Graph graph = new Graph(10);
		graph.connect(0, 1);
		graph.connect(0, 2);
		graph.connect(0, 3);
		graph.connect(1, 4);
		graph.connect(2, 5);
		graph.connect(3, 6);
		graph.connect(1, 7);
		graph.connect(7, 8);
		graph.connect(8, 9);

		DepthFirstSearch s = new DepthFirstSearch(graph, 0);
		Iterator<Integer> it = s.pathTo(6);
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.print(integer + "<- ");
		}
		System.out.println(0);
	}
}
