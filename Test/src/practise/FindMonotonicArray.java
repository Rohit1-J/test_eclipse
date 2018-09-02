package practise;

public class FindMonotonicArray {

	public boolean isMonotonic(int[] A) {
		if (A.length <= 2)
			return true;

		for (int i = 2; i < A.length; i++) {

			int left = A[i] - A[i - 1];
			int right = A[i - 1] - A[i - 2];

			if (left == 0 || right == 0) {
				left = A[i] < 0 ? -1 : 1;
				right = A[i - 1] < 0 ? -1 : 1;
			}
			if (left * right < 0)
				return false;

		}

		return true;

	}

}
