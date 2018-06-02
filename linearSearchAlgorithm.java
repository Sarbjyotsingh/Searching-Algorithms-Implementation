
public class linearSearchAlgorithm {
/*
 * Given a random integer array A and an element x. 
 * Function will search this element x in the given array using linear search.
 * If match found, return its index, and if not return -1.
 */
	
/*
 * Linear search means, we need to compare elements from the array A one by one with the element x,
 *  till we found the match or we reach the end of array.
 * If match found, return its index, and if not return -1.	
 */
	public static int linearSearch(int[] arr, int num){
		  int size = arr.length;
		  for(int i = 0;i<size;i++) {
		     	if(arr[i]==num) {
			         	return i;
		  	       }
		     }
		  return -1;
		
	}
}
