import java.lang.Math;
public class FindMax {
	/*
	* finds the max value in an array of positive values only using Try Catch blocks
	*/
	public static int findMax(int i, int[] arr, int max) {
		try {
			int x = arr[i];
			try {
				int k = max - x;
				int y = Math.abs(k);
				y = y/k;
				y = y+1;
				y = 1/y;
			} catch(ArithmeticException e) {
				max = arr[i];
			}
			return findMax(i-1,arr, max);
		} catch(ArrayIndexOutOfBoundsException e) {
			return max;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,1,1,9803456,9,8,7,6,5,4,2};
		System.out.println(findMax(arr.length-1,arr,0));
	}

}
		
		
