package module2._03elseif;

public class E02IfDebug {

	//Exercise 2: Use the debugger to see why this code isn't working
	//Fix the code by using else/if statements
	public static void main(String[] args) {
		int score = 88;
		String grade = "";

		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}

		System.out.println(grade);
	}
}
