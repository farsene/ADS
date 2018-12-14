/**
 * 
 */

/**
 * @author andrei
 *
 */
public class InsertionSort {

	
	
	public static void Sort(int [] arr) {
		
		if(arr == null || arr.length <=1) {
			return;
		}
		
		int n= arr.length;
		
		for(int i=1; i<n;i++) {
			int j =i-1;;
			int key = arr[i];
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
