import java.util.Scanner; 
//Katherine Andrade, 9/18/25, period 6, converter for binary to decimal and vice versa
public class HelloWorld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nHello. This is a conversion program!");
		System.out.print("\nHere are your options:");
		System.out.print("\n1. Binary to Decimal");
		System.out.print("\n2. Decimal to Binary");
		System.out.print("\nWhich conversion would you like? Choose 1 or 2: ");
		int selection = input.nextInt();
		input.nextLine(); 

		//input
		if(selection == 1){
			System.out.print("\nWhat is the binary number? ");
			String binaryNum = input.nextLine();
		}
		else if(selection ==2){
			System.out.print("\nWhat is the decimal number? ");
			int decimalNum = input.nextInt();
			convertToBinary(decimalNum);
			System.out.print("\nThe binary equivalent is: " + convertToBinary(decimalNum));
		}
		else
			System.out.print("Which conversion would you like? Choose 1 or 2: ");
			selection = input.nextInt();
	}//end main

	//fix this method later - binary is backwards
	public static String convertToBinary(int n){
		String convertedDecimal = "";
		while(n>0){
			int remainder = n % 2;
			n /=2;
			convertedDecimal += remainder;
	
			}//end while loop
		return convertedDecimal;
	}//end convertToBinary


	public static String convertToDecimal(String b){
		int d;
	}//end convertToDecimal
}//end class


