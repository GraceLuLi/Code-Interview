/*
 *  given a sorted array of n integers that has been rotated an unknown number of times
 *  write code to find an element in the array
 */
public class ci5_11_3 {
	public int findRotatedArray(int[] arr, int val){
		return findVal(arr, val, 0, arr.length-1);
	}
    public int findVal(int[] arr, int val, int start, int end){
    	if(start > end){
    		return -1;
    	}
    	int mid = (start + end)/2;
    	if(val == arr[mid]){
    		return mid;
    	}
    	if(arr[start] > arr[mid]){
    		if(val >= arr[mid] && val <= arr[end]){
    			return findVal(arr, val, mid+1, end);
    		}
    	    else return findVal(arr,val, start, mid-1);  		
    	}
    	else if(arr[start] < arr[mid]){
    		if(arr[start] <= val && val <= arr[mid]){
    			return findVal(arr, val, start, mid-1);
    		}
    		else return findVal(arr, val, mid+1, end);   		
    	}
    	else { //if(arr[start] == arr[mid])
    		if(arr[end] != arr[mid]){
    			return findVal(arr, val, mid+1, end);
    		}
    		else{
    			int re = findVal(arr,val,start, mid-1);
    			if(re != -1){
    				return re;
    			}
    			else return findVal(arr, val, mid+1, end);
    		}
    	}
    }
}
