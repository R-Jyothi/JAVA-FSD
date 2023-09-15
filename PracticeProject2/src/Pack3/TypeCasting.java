package Pack3;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit typecasting conversion
		int intVal=100;
		double doubleVal=intVal;
		System.out.println("Implicit Typecasting - int to double:"+ doubleVal);
		
		//explicit Typecasting conversion
		double doubleVal1=122.456;
		int intVal1=(int)doubleVal1;
		System.out.println("Explicit Typecasting - double to int:"+ intVal1);
		
		
	}

}
