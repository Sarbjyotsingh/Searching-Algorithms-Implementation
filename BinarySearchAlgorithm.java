
public class binarysearch {
/*
 * Given a random integer array A and an element x. 
 * Function will search this element x in the given array using linear search.
 * If match found, return its index, and if not return -1.
 */

/*
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array.
 * If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 * Otherwise narrow it to the upper half.
 * Repeatedly check until the value is found or the interval is empty.
 */

	public static int binary(int input[], int elem) {
		int start = 0;
		int end = input.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(input[mid]==elem) {
				return mid;
			}else if(elem>input[mid]) {
				start = mid+1;
			}else {
				end= mid-1;
			}
		}
		return -1;
	} 



}
