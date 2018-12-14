import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void test() {
		int [] arr = {1,2,3,4};
		int [] res = {1,2,3,4};
		
		InsertionSort.Sort(arr);
		for(int i=0; i<arr.length; i++) {
			assertEquals(res[i], arr[i]);
		}
	}
	
	@Test
	void test1() {
		int [] arr = {1,4,3};
		int [] res = {1,3,4};
		
		InsertionSort.Sort(arr);
		for(int i=0; i<arr.length; i++) {
			assertEquals(res[i], arr[i]);
		}
	}
	
	@Test
	void test2() {
		int [] arr = {1,2,0,1,69,100,0};
		int [] res = {0,0,1,1,2,69,100};
		
		InsertionSort.Sort(arr);
		for(int i=0; i<arr.length; i++) {
			assertEquals(res[i], arr[i]);
		}
	}
	
	@Test
	void test3() {
		int [] arr = null;
		InsertionSort.Sort(arr);
		assertEquals(null, arr);
	}
	
	@Test
	void test4() {
		int [] arr = {-1,20,100,0};
		int [] res = {-1,0,20,100};
		
		InsertionSort.Sort(arr);
		for(int i=0; i<arr.length; i++) {
			assertEquals(res[i], arr[i]);
		}
	}

}
