/*
 *  given a real number between 0 and 1 (e.g., 0.72), print the binary representation
 *  if number cannot be represented accurately in binary with at most 32 characters, print "ERROR"
 */
public class ci5_5_2 {
    public String binaryPresent(double num){
    	if(num >= 1 || num < 0){
    		return "ERROR";
    	}
    	StringBuilder str = new StringBuilder();
    	str.append(".");
    	while(num > 0){
    		if(str.length() >= 32){
    			return "ERROR";
    		}
    		num *= 2;
    		if(num >= 1){
    			str.append("1");
    			num -= 1;
    		}
    		else{
    			str.append("0");
    		}
    		
    	}
    	return str.toString();
    }
}
