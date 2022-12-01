package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

	public static double operation(Double input1, Double input2, String operator) {

		switch (operator) {
		case "add":
			return input1 + input2;
		case "sub":
			return input1 - input2;
		case "mul":
			return input1 * input2;
		case "div":
			return input1 / input2;
		default:
			return 0;
		}

	}

	public Integer dilemmaOfTwo(Double input1, Double input2) {

		Set<Double> result = new HashSet<Double>();

		String[] operator = { "add", "sub", "mul", "div" };

//		Double[] inputs = { input1, input2 };

		for (int i = 0; i < operator.length; i++) {

			result.add(operation(input1, input2, operator[i]));
			result.add(operation(input2, input1, operator[i]));

		}
		result.remove(0d / 0d);

		return result.size();
	}

	public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {

		Set<Double> result = new HashSet<Double>();

		String[] operator = { "add", "sub", "mul", "div" };

		Double[] inputs = { input1, input2, input3 };

		for (int i = 0; i < operator.length; i++) {

			for (int j = 0; j < inputs.length; j++) {
				for (int k = j + 1; k < inputs.length; k++) {
					result.add(operation(inputs[j], inputs[k], operator[i]));
					result.add(operation(inputs[k], inputs[j], operator[i]));
				}
			}
		}
		result.remove(0d / 0d);

		return result.size();
	}

	public Integer dilemmaOfN(Double... args) {

		Set<Double> result = new HashSet<Double>();

		String[] operator = { "add", "sub", "mul", "div" };

		for (int i = 0; i < operator.length; i++) {

			for (int j = 0; j < args.length; j++) {
				for (int k = j + 1; k < args.length; k++) {
					result.add(operation(args[j], args[k], operator[i]));
					result.add(operation(args[k], args[j], operator[i]));
				}
			}
		}
		
		result.remove(0d / 0d);

		return result.size();
	}
}
