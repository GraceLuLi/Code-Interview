import java.util.Arrays;

// given two strings, write a method to decide if one is a permutation of the other
public class ci5_1_3 {
	// Method 1
    /* public static boolean isPermutation(String str1, String str2){
    	 if(str1.length() != str2.length()){
    		 return false;
    	 }
    	 int[] checker = new int[256];
    	 for(int i = 0; i < str1.length(); ++i){
    		 checker[str1.charAt(i)]++;
    	 }
    	 for(int i = 0; i < str2.length(); ++i){
    		 char c = str2.charAt(i);
    		 if(checker[c] <= 0){
    			 return false;
    		 }
    		 checker[c]--;
    	 }
    	 return true;
     }*/
	// Method2
	 public static boolean isPermutation(String str1, String str2){
    	 if(str1.length() != str2.length()){
    		 return false;
    	 }
    	 return sortString(str1).equals(sortString(str2));
	 }
	 public static String sortString(String str){
		 char[] charArray = str.toCharArray();
		 Arrays.sort(charArray);
		 System.out.println(charArray.toString());// print a memory address
		 System.out.println(Arrays.toString(charArray));// print string
		 System.out.println(new String(charArray));// print string
		 // return charArray.toString() // wrong, return memory address
		 //return Arrays.toString(charArray);// correct
		 //return new String(charArray);//correct
		 return String.valueOf(charArray);// correct
	 }
	 public static void main(String[] args){
		 boolean re = isPermutation("abcd", "dabc");
		 System.out.print("output:" +re);
	 }
}
