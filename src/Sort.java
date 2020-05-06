// Given a two dimensional array, 
// sort each row then 
// sort the rows by element 0
public class Sort {
	public static void sort2D(int[][] A) {
		for(int i=0; i<A.length; i++) {
		  sort1D(A[i]);
		}
	  // sort rows by bubble sort
		
		// n times
		for(int i=0; i<A.length; i++) {
  		// pass over whole array
  		for(int j=0; j<A.length-1-i; j++) {
  		  // swap adjacent elements if out of order
  		  if(A[j][0] > A[j+1][0]) {
  		    // swap j and j+1
  		    int[] temp = A[j];
  		    A[j] = A[j+1];
  		    A[j+1] = temp;
  		  }
  		}
		}
	  
	}
	
	// sort using insertion sort
	public static void sort1D(int[] B) {
	  quicksort(B,0,B.length-1);
		/*for(int i=0; i<B.length; i++) {
			int j=i;
			while(j > 0 && B[j] < B[j-1]) {
				int temp = B[j];
				B[j] = B[j-1];
				B[j-1] = temp;
				j--;
			}
		}*/
	}
	
	public static void quicksort(int[] C, int start, int end) {
	  // base case
	  if(end <= start) return;
	  
	  int middle = start + (end-start)/2;
	  int pivot = C[middle];
	 
	  boolean done = false;
	  int l = start;
	  int h = end;
	  while(!done) {
	    while(C[l] < pivot) l++;
	    while(pivot < C[h]) h--;
	    
	    if(l >= h) {
	      done = true;
	    }else {
	      int temp = C[l];
	      C[l] = C[h];
	      C[h] = temp;
	    }
	  }
	  
	  quicksort(C, start, h);
	  quicksort(C, h+1, end);
	}
	
	
}
