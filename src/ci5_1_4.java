/*
 * write a method to replace all spaces in a stirng with '%20'
 * assume that the string has sufficient space at the end of the string
 * use a character array so that you can perform this operation in place
 */
public class ci5_1_4 {
	public void replaceSpaces(char[] str, int len){
		int spaceNum = 0;
		for(int i = 0; i < len; ++i){
			if(str[i] == ' '){
				++spaceNum;
			}
		}
		int j = len + 2*spaceNum;
		for(int i = len-1; i >= 0; --i){
			char c = str[i];
			if(c != ' '){
				str[--j] = c;
			}
			else{
				str[--j] = '0';
				str[--j] = '2';
				str[--j] = '%';
			}
		}
	}
}
