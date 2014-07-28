import java.util.ArrayList;
import java.util.Arrays;

/*
 * write a method to compute all permutations of a string
 */
public class ci5_9_5 {
	 // Method 1, suppose all the characters in str are distinct
	/*
      public ArrayList<String> getPermutations(String str){
    	  if(str == null){
    		  return null;
    	  }
    	  ArrayList<String> result = new ArrayList<String>();
    	  result.add("");
    	  if(str.length() == 0){
    		  return result;
    	  }
    	  getPermutations(str, 0, result);
    	  return result;
      }
      public void getPermutations(String str, int index, ArrayList<String> pre){
    	  if(index >= str.length()){
    		  return;
    	  }
    	  ArrayList<String> curr = new ArrayList<String>();
    	  String c = str.substring(index, index+1);
    	  String tmp;
    	  for(String prePerm : pre){
    		  for(int i = 0; i <= prePerm.length(); i++){
    			  tmp = prePerm.substring(0, i) + c + prePerm.substring(i);
    			  curr.add(tmp);
    		  }
    	  }
    	  pre = curr;
    	  getPermutations(str, index+1, pre);
      }
      public static void main(String[] args){
    	  System.out.println("abc".substring(0,0)+"d"+"abc".substring(0,3));
      }*/
	// Method 2, str has duplicate characters
    public ArrayList<String> getPermutations(String str){
  	  if(str == null){
  		  return null;
  	  }
  	  ArrayList<String> result = new ArrayList<String>();
  	  result.add("");
  	  if(str.length() == 0){
  	  	  result.add("");
  		  return result;
  	  }
  	  char[] strArr = str.toCharArray();
  	  Arrays.sort(strArr);
  	  str = new String(strArr);
  	  getPermHelper(str, 0, result);	
  	  return result;
    }
    public void getPermHelper(String str, int index, ArrayList<String> pre){
    	if(index >= str.length()){
    		return;
    	}
    	String c = str.substring(index, index+1);
    	int count = 0;
    	while(c.equals(str.substring(index,index+1))){
    		++count;
    		++index;
    	}
    	ArrayList<String> curr = new ArrayList<String>();
    	for(String prePerm : pre){
    		insertString(prePerm, c, count, curr);
    	}
    }
    public void insertString(String destStr, String c, int count, ArrayList<String> result){
    	if(count == 0){
    		return;
    	}
    	if(destStr.length() == 0){
    		result.add()
    	}
    	for(int i=0; i <=destStr.length(); ++i){
    		String tmp = destStr.substring(0, i) + c+ destStr.substring(i);
    		String remainder = destStr.substring(i);
    		insertString(remainder, c, count-1, result);
    	}
    }
}
