/*
 *  sort an array of string so that all the anagrams are next to each other
 */
import java.util.*;

public class ci5_11_2 {
	
	public void anagramSort(String[] arr, HashMap<String, ArrayList<String>> map){
		for(int i = 0; i < arr.length; ++i){
			String str = arr[i];
			char[] strCharArr = str.toCharArray();
			Arrays.sort(strCharArr);
			str = new String(strCharArr);
			if(map.containsKey(str)){
				ArrayList<String> list = map.get(str);
				list.add(arr[i]);
			}
			else{
				ArrayList<String> list = new ArrayList<String>();
				list.add(arr[i]);
				map.put(str, list);
			}
		}
		int i = 0;
		while(i < arr.length){
			for(String key : map.keySet()){
				ArrayList<String> list = map.get(key);
				for(String s : list){
					arr[i] = s;
					++i;
				}
			}
		}
	}

}
