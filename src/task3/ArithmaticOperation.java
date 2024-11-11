package task3;

//this class is for arithmatic operation with exception handling concept
public class ArithmaticOperation {
	int c;
	
	//in methods exception concept used in which try contains logic if it given exception then catch block catch that exception

	void Addition(Integer a, int b) {
		try {
			c = a + b;
			System.out.println("Addition of " + a + " and " + b + " is= " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Catch NullPointerException: " + e.getMessage());
		} catch (Exception e) {
			e.getMessage();
		}
	}

	void Substraction(int a, int b) {
		try {
			c = a - b;
			System.out.println("Substraction of " + a + " and " + b + " is= " + c);

		} catch (ArithmeticException e) {  //this is arithmatic exception 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) { //this is null pointer exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.getMessage();
		}
	}

	void Multiplication(int a, int b) {
		try {
			c = a * b;
			System.out.println("Multiplication of " + a + " and " + b + " is= " + c);
		} catch (ArithmeticException e) {  //this is arithmatic exception 
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {  //this is null pointer exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.getMessage();
		}
	}

	void Division(int a, int b) throws CustomException {  //this throws exception to custom exception class
		try {
			if (a < 0 || b < 0) {  //if values are negative then custom exception occurs
				throw new CustomException("Negative Numbers Not allowed in Division");
			} else {

				c = a / b;
				System.out.println("Division of " + a + " and " + b + " is= " + c);
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.getMessage();

		}

	}

	public static void main(String[] args) throws CustomException {
		ArithmaticOperation aritmetic_Operations = new ArithmaticOperation();
		aritmetic_Operations.Addition((Integer) null, 45);
		aritmetic_Operations.Substraction(56, 42);
		aritmetic_Operations.Multiplication(25, 5);
		aritmetic_Operations.Division(-1, 0);
	}
}
