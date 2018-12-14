import java.util.Arrays;

/**
 * @author Andrei Geadau
 *
 */
public class QucikSort {



	public static void Sort(int [] arr) {
		print(arr);
		
		//base case, nothing to be sorted
		if(arr.length <2) {
			return;
		}
		//DIVIDE
		int mid = arr.length /2;
		
		int [] arr1 = Arrays.copyOfRange(arr, 0, mid);
		int [] arr2 = Arrays.copyOfRange(arr, mid, arr1.length);
		
		//CONQUER
		Sort(arr1);
		Sort(arr2);
	
		//MERGE
		arr = merge(arr1, arr2);
		
	}
	

	
	
	
	

	
	 public static int[] merge(int[] arr1, int[] arr2) {
		    
		    if(arr1 == null && arr2 == null){
		      return null;
		    }
		    
		    if(arr1 == null){
		      return null;
		    }
		    
		    if(arr2 == null){
		    // return System.arraycopy(arr1, 0, new int [], 0, 1);
		    return null;
		    }
		    
		  int i = 0, j = 0, k = 0; 


		int [] arr3 = new int [arr1.length + arr2.length]; 

		while (i<arr1.length && j <arr2.length) 
		{ 
		if (arr1[i] < arr2[j]) 
		arr3[k++] = arr1[i++]; 
		else
		arr3[k++] = arr2[j++]; 
		} 

		// Store remaining elements of first array 
		while (i < arr1.length) 
		arr3[k++] = arr1[i++]; 

		// Store remaining elements of second array 
		while (j < arr2.length) 
		arr3[k++] = arr2[j++];
		
		return arr3; 
		} 
	 
		public static void print(int [] arr) {
			for(int i =0; i<arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
}
