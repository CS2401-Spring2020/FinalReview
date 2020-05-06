
public class Driver{
	
	public static void main(String[] args) {
	  /*
     * 2D Sorting Tests
     */
	  System.out.println("2D Sorting:");
	  int[][] A = {{7},
					 {5,6,7,8}, 
					 {4,3,2,1}
					};
		print2DArr(A);
		Sort.sort2D(A);
		print2DArr(A);
		
		/*
     * Balanced Binary Tree Tests
     */
    System.out.println("\nBalanced Tree:");
		myBinarySearchTreeNode T1 = new myBinarySearchTreeNode(new int[] {10,5,15,14, 13, 12,11});
		T1.print();

		myBinarySearchTreeNode T2 = new myBinarySearchTreeNode(new int[] {10,5,15,14, 13, 12,11}, true);
		T2.print();
		
		/*
		 * Queue using Stack Tests
		 */
    System.out.println("\nQueue Test:");
		SimulateQueue q = new SimulateQueue();
		for(int i=0; i<5; i++) q.enqueue(i);
		while(!q.isEmpty()) System.out.print(q.dequeue() + " ");
		System.out.println();
		
		for(int i=0; i<5; i++) q.enqueue(i);
		q.reverse();
		while(!q.isEmpty()) System.out.print(q.dequeue() + " ");
		System.out.println();
	}
	
	public static void print2DArr(int[][] A) {
		System.out.println("{");
		for(int i=0; i<A.length;i++) {
			print1DArr(A[i],"  ");
		}
		System.out.println("}");
	}
	
	public static void print1DArr(int[] A) { print1DArr(A,""); }
	
	public static void print1DArr(int[] A, String pre) {
		System.out.print(pre + "{");
		for(int j=0; j<A.length; j++) System.out.print(((j==0)?" ":",") + " " + A[j]);
		System.out.println(" }");
	}
}
