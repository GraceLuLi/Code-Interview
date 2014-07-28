import java.util.HashMap;

/*
 *  given a boolean expression consisting of the symbols 0, 1, &, |, and ^, and a desired boolean result
 *  value. implement a function to count the number of ways of parenthesizing the expression such that
 *  it evaluates to result
 */
public class ci5_9_11 {
	public int f(String exp, boolean result, int s, int e, HashMap<String, Integer> map){
		if(map.containsKey(exp)){
			return map.get(exp);
		}
		if(s == e){
			char c = exp.charAt(s);
			if(c == '1' && result){
				return 1;
			}
			else if(c == '0' && !result){
				return 1;
			}
			return 0;
		}
		int ways = 0;
		for(int i = s+1; i < e; i+=2){
			char operator = exp.charAt(i);
			if(result){
				if(operator == '|'){
					ways += f(exp, true, s, i-1,map)*f(exp, true, i+1, e,map);
					ways += f(exp, true, s, i-1,map)*f(exp, false, i+1, e,map);
					ways += f(exp, false, s, i-1,map)*f(exp, true, i+1, e,map);
				}
				else if(operator == '^'){
					ways += f(exp, false, s, i-1,map)*f(exp, true, i+1, e,map);
					ways += f(exp, true, s, i-1,map)*f(exp, false, i+1, e,map);
				}
				else if(operator == '&'){
					ways += f(exp, true, s, i-1,map)*f(exp, true, i+1, e,map);
				}
			}
			else{
				if(operator == '&'){
					ways += f(exp, false, s, i-1,map)*f(exp, false, i+1, e,map);
					ways += f(exp, true, s, i-1,map)*f(exp, false, i+1, e, map);
					ways += f(exp, false, s, i-1,map)*f(exp, true, i+1, e, map);
				}
				else if(operator == '^'){
					ways += f(exp, true, s, i-1,map)*f(exp, true, i+1, e, map);
					ways += f(exp, false, s, i-1,map)*f(exp, false, i+1, e,map);
				}
				else if(operator == '|'){
					ways += f(exp, false, s, i-1, map)*f(exp, false, i+1, e, map);
				}
			}
		}
		map.put(exp, ways);
		return ways;
	}

}
