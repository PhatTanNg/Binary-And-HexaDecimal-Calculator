import java.util.*;
public class hextodecimal
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String inputHex;
		System.out.print("Put in the Hex number: ");
		inputHex = keyboard.nextLine();
		int i = inputHex.length();
		int length = inputHex.length();
		int a = 0;
		double n;
		double decimal = 0;


			do
			{
				n = Math.pow(16,a);
				a++;

				switch(inputHex.substring(i-1,i))
				{

					case "A":
					case "a":
						decimal = decimal + (10*n);
					break;

					case "B":
					case "b":
						decimal = decimal + (11*n);
					break;

					case "C":
					case "c":
						decimal = decimal + (12*n);
					break;

					case "D":
					case "d":
						decimal = decimal + (13*n);
					break;

					case "E":
					case "e":
						decimal = decimal + (14*n);
					break;

					case "F":
					case "f":
						decimal = decimal + (15*n);
					break;

					case "0":
						decimal = decimal + (0*n);
					break;

					case "1":
						decimal = decimal + (1*n);
					break;

					case "2":
						decimal = decimal + (2*n);
					break;

					case "3":
						decimal = decimal + (3*n);
					break;

					case "4":
						decimal = decimal + (4*n);
					break;

					case "5":
						decimal = decimal + (5*n);
					break;

					case "6":
						decimal = decimal + (6*n);
					break;

					case "7":
						decimal = decimal + (7*n);
					break;

					case "8":
						decimal = decimal + (8*n);
					break;

					case "9":
						decimal = decimal + (9*n);
					break;

					default:
						System.out.println("Error!");
					break;
				}
				i--;
			}while(i>=1);

		System.out.println(decimal);


}
	}