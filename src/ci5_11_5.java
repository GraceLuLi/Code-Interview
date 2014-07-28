/*
 *  given a sorted array of strings which is interspersed with empty strings, find 
 *  the location of given string
 */
public class ci5_11_5 {
    public int findString(String[] arr, String str){
    	if(arr == null || str == null || str == ""){
    		return -1;
    	}
    	return findStringHelper(arr, str, 0, arr.length-1);
    }
    public int findStringHelper(String[] arr, String str, int start, int end){
    	if(start > end){
    		return -1;
    	}
    	int mid = (start + end)/2;

    	if(arr[mid].isEmpty()){
        	int left = mid-1;
        	int right = mid+1;
        	while(true){
    		if(left < start && right > end){
    			return -1;
    		}
    	    else if(left >= start && arr[left].isEmpty()){
    			mid = left;
    			break;
    		}
    		else if(right <= end && arr[right].isEmpty()){
    			mid = right;
    			break;
    		}
    		left--;
    		right++;
    	}
    	}
    	if(arr[mid].equals(str)){
    		return mid;
    	}
    	else if(arr[mid].compareTo(str) > 0){
        	return findStringHelper(arr, str, start, mid-1);
    	}
    	else{
        	return findStringHelper(arr, str, mid+1, end);
    	}

    }
}
