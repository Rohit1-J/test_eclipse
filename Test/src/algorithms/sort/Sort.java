package algorithms.sort;

public abstract class Sort<T extends Comparable<T>> {

	public abstract void sort(T[] a);

	public boolean less(T[] a, int i, int j) {
		return a[i].compareTo(a[j]) < 0;
	}

	public void exch(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
