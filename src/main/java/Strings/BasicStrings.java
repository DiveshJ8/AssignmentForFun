package Strings;

public class BasicStrings {

	public String flipConcat(String string1, String string2) {

		String result = string2.concat(string1);

		return result;
	}

	public char getChar(String string, int index) {
		char result = string.charAt(index);
		return result;
	}

	public String iCantSee(String string) {

		char[] tempArray = string.toCharArray();

		for (char ch : tempArray) {
			string = string.replace(ch, ' ');
		}

		return string;
	}

	public String loudAndClear(String string) {
		
		string = string.toUpperCase();
		return string;
	}

	public String reverseCase(String string) {

		if (string == null || string.equals("")) {
			return string;
		}
		
		String[] temp = string.split("");

		String result = new String();
		for (String t : temp) {
			if (Character.isUpperCase(t.charAt(0))) {
				t = t.toLowerCase();
				result += t;
			} else if (Character.isLowerCase(t.charAt(0))) {
				t = t.toUpperCase();
				result += t;
			} else {
				result += t;
			}
		}

		return result;
	}

	public String oneAtATime(String string1, String string2) {

		char[] temp1 = string1.toCharArray();
		char[] temp2 = string2.toCharArray();

		char[] mergedTemp = new char[temp1.length + temp2.length];

		int j = 0, k = 0;
		for (int i = 0; i < mergedTemp.length;) {
			if (j < temp1.length)
				mergedTemp[i++] = temp1[j++];
			if (k < temp2.length)
				mergedTemp[i++] = temp2[k++];
		}

		return String.valueOf(mergedTemp);
	}
}
