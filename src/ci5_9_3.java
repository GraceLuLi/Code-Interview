/*
 *  a magic index satisfy A[i] = i. given a sorted array of distinct integers, write a method 
 *  to find a magic index, if one exists , in array A
 *  FOLLOW UP
 *  what if the values are not distinct
 */
public class ci5_9_3 {
     public int magicIndex(int[] arr){
    	 return magicIndexHelper(arr, 0, arr.length-1);
     }
     /*
     public int magicIndexHelper(int[] arr, int start, int end){
    	 if(start > end){
    		 return -1;
    	 }
    	 int mid = (start+end)/2;
    	 if(mid == arr[mid]){
    		 return mid;
    	 }
    	 else if( mid < arr[mid]){
    		 return magicIndexHelper(arr, start, mid-1);
    	 }
    	 else{
    		 return magicIndexHelper(arr, mid+1, end);
    	 }
     }*/
     // FOLLOW UP
     public int magicIndexHelper(int[] arr, int start, int end){
    	 if(start > end){
    		 return -1;
    	 }
    	 int mid = (start+end)/2;
    	 if(mid == arr[mid]){
    		 return mid;
    	 }
    	 else if(arr[mid] > mid){
    		 int right = magicIndexHelper(arr, arr[mid], end);
    		 if(right != -1){
    			 return right;
    		 }
    		 return magicIndexHelper(arr, start, mid-1);
    	 }
    	 else{
    		 int left = magicIndexHelper(arr, start, arr[mid]);
    		 if(left != -1){
    			 return left;
    		 }
    		 return magicIndexHelper(arr, mid+1, end);
    	 }
     }
}
