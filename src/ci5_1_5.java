/* implement a method to perform basic string compression using the counts of repeated characters
 * e.g. aabcccccaaa --> a2b1c5a3
 * if "compressed" string would not become smaller than original string, return original string
 */
public class ci5_1_5 {
	public static String compressString(String str){
		int len = str.length();
		if(len <= 1){
			return str;
		}
		StringBuffer buffer = new StringBuffer();
		int i = 0;
		while(i < len){
			char currChar = str.charAt(i);
			int count = 1;
			while(++i < len &&  str.charAt(i) == currChar){
				count++;
			}
            buffer.append(currChar);
            buffer.append(count);
		}
		String result =  buffer.toString();
		if(result.length() > str.length()){
			result = str;
		}
		return result;
	}
    public static void main(String[] args){
    	System.out.println(compressString("aaaaa"));
    }
}
