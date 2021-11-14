import java.io.Console;

class InputlessCal{

	public static void main(String[] args){
		int a, b, c, d;
		a = 2;
		b = 5;
		c = 100;
		d = 30; //this is a comment
		String name = "Jackson";
		int age = 15;
		String hobbies = "programming, running, and buliding drones.";

		System.out.println("The Varuables are: a:" + a + " b:" + b + " c:" + c + " d:" + d + "\n");

		System.out.println("a + b is: " + (a + b));
		System.out.println("c / a is: " + (c / a));
		System.out.println("c ** b is: " + (c ^ b));
		System.out.println("a + b + c + d is: " + (a + b + c + d));
		
		System.out.println("\n");
		System.out.println("About me");
		System.out.println("age: " + age);
		System.out.println("hobbies: " + hobbies);


		// Input Calulator via scanner libary
		Console input = System.console();

		System.out.println("Enter your math problem: Ex. 5 * 11");
		String equation = input.readLine();
		String[] parts = equation.split(" ");
		int numberOne = Integer.parseInt(parts[0]);
		int numberTwo = Integer.parseInt(parts[2]);
		String opperator = parts[1];
		
		switch (opperator){
			case "+":
				System.out.println(numberOne+numberTwo);
				break;
			case "-":
				System.out.println(numberOne-numberTwo);
				break;
			case "*":
				System.out.println(numberOne*numberTwo);
				break;
			case "/":
				System.out.println(numberOne/numberTwo);
				break;
			case "^":
				System.out.println(numberOne^numberTwo);
				break;

		}

	}

}
