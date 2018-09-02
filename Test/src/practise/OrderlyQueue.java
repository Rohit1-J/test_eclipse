package practise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class OrderlyQueue {

	public static void main(String[] args) {
		OrderlyQueue queue = new OrderlyQueue();
		System.out.println(queue.orderlyQueue("baaca", 3));
	}

	public String orderlyQueue(String S, int K) {
		char[] c = S.toCharArray();

		char[] temp = c.clone();
		Arrays.sort(temp);

		char[] smallestChars = new char[K];
		for (int i = 0; i < K; i++) {
			smallestChars[i] = temp[i];
		}

		temp = null;

		Queue<Character> tailQueue = new LinkedList<>();
		temp = new char[K];

		for (int i = 0; i < S.length(); i++) {
			if (i < K)
				temp[i] = S.charAt(i);
			else
				tailQueue.offer(S.charAt(i));
		}

		Arrays.sort(temp);
		while (!Arrays.equals(smallestChars, temp) && !tailQueue.isEmpty()) {
			char t = tailQueue.poll();
			tailQueue.offer(temp[K - 1]);
			temp[K - 1] = t;
			Arrays.sort(temp);
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < K; i++) {
			sb.append(temp[i]);
		}

		while (!tailQueue.isEmpty()) {
			sb.append(tailQueue.poll());
		}

		return sb.toString();
	}
}
