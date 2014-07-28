/* 
 * implement an algorithm to determine if a string has all unique characters. 
 * what if you cannot use additional data structures?
 */
public class ci5_1_1 {
	/* // with additional data structures
      public static boolean isUnique(String str){
          if(str.length() > 256){
               return false;
          }
    	  boolean[] checker = new boolean[256];
    	  for(int i = 0; i < str.length(); ++i){
    		  char c = str.charAt(i);
    		  if(checker[c] == true){
    			  return false;
    		  }
    		  checker[c] = true;
    	  }
    	  return true;
      }
      */
	// without additional data structures
	public static boolean isUnique(String str){
		if(str.length() > 256){
			return false;
		}
		int checker = 0;
		for(int i = 0 ; i < str.length(); ++i){
			int c = str.charAt(i) - 'a';
			if((checker & (1<<c)) != 0){
				return false;
			}
			checker |= (1<<c);
		}
		return true;
	}
      public static void main(String[] args){
    	  boolean re = isUnique("abca");
    	  System.out.println(re);
      }
}
