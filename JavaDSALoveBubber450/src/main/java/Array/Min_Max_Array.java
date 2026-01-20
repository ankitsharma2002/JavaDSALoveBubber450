package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Min_Max_Array {
	public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> sortedArray=new ArrayList<>();
        for (int n:arr){
            sortedArray.add(n);
        }
        
        Collections.sort(sortedArray);
        
        ArrayList<Integer> result=new ArrayList<>();
        result.add(sortedArray.get(0));
       result.add(sortedArray.get(sortedArray.size()-1));
 
        return result;
    }
	public static void main(String[] args) {
		 int[] arr = {3, 5, 4, 1, 9};
	        ArrayList<Integer> result = getMinMax(arr);
	        System.out.println(result.get(0) + " " + result.get(1));
			 
		 
	}
}
