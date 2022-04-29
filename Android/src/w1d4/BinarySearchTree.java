package w1d4;

public class BinarySearchTree<T extends Comparable<T>> {

	GenericBranch<T> head;
	
	public boolean add(T data) throws AlreadyExistsInTreeException {
		
		if(head == null) {
			head = new GenericBranch<T>(data);
		}else {
			GenericBranch<T> current = head;
			while(true) {//while true b/c don't know how far to go down the tree...just return to stop
				if(current.getData().compareTo(data) > 0) {
					System.out.println("Current word is "+current+ ", Branching left");
					if(current.getLeftBranch() == null) {
						//what if the left branch is not taken?
						current.setLeftBranch(new GenericBranch<>(data));
						System.out.println("Added word "+data);
						return true;
					}else {
						//what if the left branch is already taken?
						current = current.getLeftBranch();
					}
				}
				else if (current.getData().compareTo(data) < 0) {
					System.out.println("Current word is "+current+ ", Branching right");
					if(current.getRightBranch() == null) {
						//what if the right branch is not taken?
						current.setRightBranch(new GenericBranch<>(data));
						System.out.println("Added word "+data);
						return true;
					}else {
						//what if the right branch is already taken?
						current = current.getRightBranch();
					}
				}else {
					System.out.println("Word "+data+" already exists");
					throw new AlreadyExistsInTreeException("Word "+data+" already exists", new Exception());
					
				}
			}
				
		}
		return false;
		
	}
}
