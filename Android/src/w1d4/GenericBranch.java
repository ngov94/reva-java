package w1d4;

public class GenericBranch<T extends Comparable<T>> implements Comparable<GenericBranch>{
	
	private GenericBranch<T> leftBranch;
	private GenericBranch<T> rightBranch;
	private T data;
	
	public GenericBranch(T data) {
		this.data = data;
	}

	public GenericBranch<T> getLeftBranch() {
		return leftBranch;
	}

	public void setLeftBranch(GenericBranch<T> leftBranch) {
		this.leftBranch = leftBranch;
	}

	public GenericBranch<T> getRightBranch() {
		return rightBranch;
	}

	public void setRightBranch(GenericBranch<T> rightBranch) {
		this.rightBranch = rightBranch;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public String toString() {
		return data.toString();
		/*methods like toString, equals, and hashcode are
		 * inherited from the object class
		 */
	}

	@Override
	public int compareTo(GenericBranch o) {
		return data.compareTo((T) o.data);
	}
	
}
