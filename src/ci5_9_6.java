/*
 * print all valid combination of n-pairs of parenthese
 */
public class ci5_9_6 {
    public static void printParenthese(int n){
    	int left = 0;
    	int right = 0; 
    	printParentheseHelper(left, right, n, "");
    }
    public static void printParentheseHelper(int left, int right, int n, String str){
    	if(left < right){
    		return;
    	}
    	if(left == n){
    		while(right != n){
    			str += ")";
    			right++;
    		}
    		System.out.print(" " + str);
    		return;
    	}
    	printParentheseHelper(left+1, right, n, str+"(");
    	printParentheseHelper(left, right +1, n, str+")");
    }
    public static void main(String[] args){
    	printParenthese(3);
    }
}
