/*
 * check if a string is rotation of another one using method isSubstring
 */
public class ci5_1_8 {
	public boolean isRotation(String str1, String str2){
		//question: would str1 be empty? is two empty strings rotations of each other
		if(str1.length() != str2.length()){
			return false;
		}
		return isSubstring(str1, str2+str2);
	}
	public boolean isSubstring(String subStr, String str){
		return false;
	}
}
