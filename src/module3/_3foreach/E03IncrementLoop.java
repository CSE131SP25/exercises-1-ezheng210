package module3._3foreach;

public class E03IncrementLoop {
	//Exercise 3: After running this program and understanding how it
	//works (using the debugger, if necessary), modify it
	//to use an indexed style loop that adds one
	//to all of the values in the array
	public static void main(String[] args) {
		int[ ] values = {6, 2, 1, 7, 12, 5};
		// Can this loop increment the values?
		for (int val : values) {//does not increment values
			val++;
			System.out.println("New val: " + val);
		}
		// Print out array to see if they really changed
		System.out.println("Array after the loop: ");// fixed to increment values
		for (int i = 0; i < values.length; i++ ) {
			values[i]++;
			System.out.print(values[i] + " ");
		}
	}
}

