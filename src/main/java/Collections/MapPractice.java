package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

	public Object findValueOf(Map<String, String> map, Object key) {

		return map.get(key);
	}

	public Object[] findKeysOf(Map<String, String> map, Object value) {
		List<String> result = new ArrayList<String>();
		int i = 0;
		for (Map.Entry<String, String> temp : map.entrySet()) {
			if (temp.getValue().equals(value)) {
				result.add(temp.getKey());
			}
		}

		Object[] temp = result.toArray();

		return temp;
	}

	public Map<Integer, Integer> fibonacciTree(int size) {

		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		if (size > 0) {
			result.put(1, 1);
		}
		if (size > 1) {
			result.put(2, 1);
		}

		for (int i = 3; i <= size; i++) {
			result.put(i, (result.get(i - 2).intValue() + result.get(i - 1).intValue()));
		}
		return result;
	}

	public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {

		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		if (size > 0) {
			result.put(1, first);
		}
		if (size > 1) {
			result.put(2, second);
		}

		for (int i = 3; i <= size.intValue(); i++) {
			result.put(i, (result.get(i - 2).intValue() + result.get(i - 1).intValue()));
		}
		return result;
	}
}
