import java.util.Scanner; 
//Katherine Andrade, 9/18/25, period 6, converter for binary to decimal and vice versa
public class HelloWorld {
	public static void main(String[] args) {
		System.out.print("\nHello. This is a conversion program!");

		boolean test = true;
		while(test){
			Scanner input = new Scanner(System.in);
			
			System.out.print("\nHere are your options:");
			System.out.print("\n1. Binary to Decimal");
			System.out.print("\n2. Decimal to Binary");
			System.out.print("\nWhich conversion would you like? Choose 1 or 2: ");
			int selection = input.nextInt();
			input.nextLine(); 

			while(selection !=1 && selection !=2){
				System.out.print("Which conversion would you like? Choose 1 or 2: ");
				selection = input.nextInt();
				input.nextLine();
			}//end while

			if(selection == 1){
				System.out.print("\nWhat is the binary number? ");
				String binaryNum = input.nextLine();
				System.out.println("The decimal equivalent is: " + convertToDecimal(binaryNum));
			}//end if
			else if(selection ==2){
				System.out.print("What is the decimal number? ");
				int decimalNum = input.nextInt();
				input.nextLine();
				System.out.println("The binary equivalent is: " + convertToBinary(decimalNum));
			}//end else if

			System.out.print("\nDo you want to continue? ");
			String placer = input.nextLine();	
			placer= placer.toLowerCase();
			if(placer.equals("no")){
				test = false;
				System.out.println("Bye!");
			}//end if 
		}//end while loop
	}//end main

	public static String convertToBinary(int n){
		String convertedDecimal = "";
		while(n>0){
			int remainder = n % 2;
			n /=2;
			convertedDecimal = remainder + convertedDecimal;
			}//end while loop
		return convertedDecimal;
	}//end convertToBinary

	public static int convertToDecimal(String b){
		int decimal=0;
		int one = 49;
		int zero = 48;

		for(int i=0; i< b.length(); i++){
			int base =0;
			int ascii = (int) b.charAt(i) ;
			if(ascii == one){
				base=1;
			}//end if
			else if (ascii == zero){
				base=0;
			}//end else if
			decimal = decimal * 2 + base;
		}//end for loop
		return decimal;
	}//end convertToDecimal
}//end class


