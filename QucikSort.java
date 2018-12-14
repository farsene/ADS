import java.util.Arrays;

/**
 * @author andrei
 *
 */
public class QucikSort {

	public static void Sort(int [] arr) {
		
		int n = arr.length;
		
		//BASE CASE
		if(n<2) {
			return;
		}
		
		//DIVIDE
		int mid = n/2;
		int [] arr1 = Arrays.copyOfRange(arr, 0, mid);
		int [] arr2 = Arrays.copyOfRange(arr, mid, n);
		
		//CONQUER
		Sort(arr1);
		Sort(arr2);
		
		//MERGE
		int i=0, j=0;
		
		while(i< arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[i+j] = arr1[i++];
			}else {
				arr[i+j] = arr2[j++];
			}
		}
		
		//copy the remaining el, if any
		while(i<arr1.length) {arr[i+j] = arr[i++];}
		while(j<arr2.length) {arr[i+j] = arr[j++];}
	}
	
	 //useful method for viewing the recursive calls
		public static void print(int [] arr) {
			for(int i =0; i<arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
}
