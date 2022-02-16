
public class App {

	public static void main(String[] args) {
		

	}
	
	public static void invertBinaryTree(BinaryTree tree) {
		
		if(tree == null)
			return;
		
		swap(tree);
		invertBinaryTree(tree.left);
		invertBinaryTree(tree.right);
	}
	
	public static void swap(BinaryTree tree) {
		
		BinaryTree left = tree.left;
		tree.left = tree.right;
		tree.right = left;
	}
	
	public static void printDFS(BinaryTree tree) {
		
		if(tree.left != null) 
			printDFS(tree.left);
		
		System.out.print(tree.value + " ");
		
		if(tree.right != null)
			printDFS(tree.right);
	}

}
