


public class Loan{

	 public String TestMessage(){

	       return "Personal Loan";

	 };

	}

//If you try to execute this using javac Loan.java, it will produce NoSuchMethodError.If any "method is not found" in the class and if the object of the class try to call it, it produce "NoSuchMethodError". It will not provide any compilation error as this will be thrown only at the "run time".
In the above example, "Java" always need "main()" and main() is the first function which is called automatically. Here, main() is not found so, it throws "NoSuchMethodError".//

