package Collections;

import java.util.ArrayList;

public class ArrayLists {

	public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		for (Integer i : list2) {
			list1.add(i);
		}
		return list1;
	}

	public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		int sum = 0;
		for (Integer i : list1) {
			sum += i.intValue();
		}

		for (Integer i : list2) {
			sum += i.intValue();
		}
		return sum;
	}

	public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {

		original.remove(toRemove);
		return original;
	}

	public boolean happyList(ArrayList<String> original) {

		if (original.size() <= 1) {
			return true;
		}

		boolean flag = false;

		for (int i = 0; i < original.size() - 1; i++) {
			flag = false;
			String temp = original.get(i);
			for (int j = 0; j < temp.length(); j++) {
				if (original.get(i + 1).indexOf(temp.charAt(j)) != -1) {
					flag = true;
					break;
				}
			}
			if (!flag)
				break;
		}

		return flag;
	}
}
