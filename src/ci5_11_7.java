/*
 * a circus is designing a tower routine consisting of people standing atop one another's shoulder
 * each person must be both shorter and lighter than person below him. write a method to compute 
 * the largest possible number of people in such a tower
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ci5_11_7 {
    void createCircus(ArrayList<HtWt> persons){
    	Collections.sort(persons, WtComparator);
    }
    class WtComparator implements Comparator<HtWt>{
    	public int compare(HtWt p1, HtWt p2){
    		return p1.Wt - p2.Wt;
    	}
    }
}
