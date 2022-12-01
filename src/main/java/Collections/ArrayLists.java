package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	
    	for(Integer i : list2) {
    		list1.add(i);
    	}
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	
    	int sum = 0;
    	for(Integer i : list1) {
    		sum += i.intValue();
    	}
    	
    	for(Integer i : list2) {
    		sum += i.intValue();
    	}
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
    	
    	original.remove(toRemove);
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
    	
    	
    	
        return false;
    }
}
