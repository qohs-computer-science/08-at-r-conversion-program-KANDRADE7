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

			//binary TO decimal
		}
		else if(selection ==2){
			System.out.print("\nWhat is the decimal number? ");
			int decimalNum = input.nextInt();
			//decimal TO binary
			String convertedDecimal = "";

			while(decimalNum>0){
				int remainder = decimalNum / 2;
				System.out.print(remainder);
				convertedDecimal += remainder;
			}//end while loop
		}
		else{
			System.out.print("Which conversion would you like? Choose 1 or 2: ");
			selection = input.nextInt();
		}





	}//end main
}//end class
