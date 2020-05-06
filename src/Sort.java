
public class Sort {
	public static void sort2D(int[][] A) {
		for(int i=0; i<A.length; i++) {
			sort1D(A[i]);
		}
		
		// sort by first element using bubble sort
		for(int j=A.length-1; j>=0; j--) {
			for(int i=0; i<j; i++) {
				if(A[i][0] > A[i+1][0]) {
					int[] temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}
	}
	
	// sort using insertion sort
	public static void sort1D(int[] B) {
		for(int i=0; i<B.length; i++) {
			int j=i;
			while(j > 0 && B[j] < B[j-1]) {
				int temp = B[j];
				B[j] = B[j-1];
				B[j-1] = temp;
				j--;
			}
		}
	}
}
