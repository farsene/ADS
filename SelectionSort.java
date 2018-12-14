/**
 * 
 */

/**
 * @author andrei
 *
 */
public class SelectionSort {

	
	public static void Sort(int []arr) {
		if(arr == null || arr.length <=1) {
			return;
		}
		
		int n = arr.length;
		
		for(int i=0; i<n-1;i++) {
			int min = i;
			for(int j =i+1; j<n;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			//interchange
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
