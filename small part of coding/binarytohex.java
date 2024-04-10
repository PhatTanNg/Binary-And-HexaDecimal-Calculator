import java.util.*;
public class binarytohex
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double binary, decimal;
				System.out.print("Enter binary number: ");
				binary= keyboard.nextDouble();
				System.out.println("------------------------------------------------------------");
				System.out.println("|   Number of digit|   Value of digit|  2^n  |  value*(2^n)       |");
				int i = 0;
				double digit;
				double n;
			double Sum = 0;
			int m ;

				do
				{
					n = Math.pow(2,i);
					m = (int) n;

					i++;
					digit = binary%10;
				System.out.println("|   "+i+"            |    "+digit+"          |" +"  2^"+(i-1)+"|  "+digit*(m)+"                |");
				Sum =Sum + (digit*m);
					binary = (binary-digit)/10;
					}
				while(binary>0);
		System.out.println("Decimal number is: "+Sum);

		int sum = (int)Sum;
		String hex = "";
		int remainder;
		int result;
				do
				{
				result = sum/16;
				remainder = sum%16;
				System.out.println(sum + " / 16 = "+result);
				System.out.println("Remainder = " +remainder);
				sum = result;
				String letternumber;
			if (sum == 0 &&remainder <=9)
					{
						System.out.println("In process: "+ remainder+"\n");
						letternumber = String.valueOf(remainder);
						hex = letternumber + hex;
				}



				if(remainder == 10)
				{
					System.out.println("In process: "+  "A"+"\n");
					hex = 'A' + hex;
					}
				if(remainder == 11)
				{
					System.out.println("In process: "+ "B"+"\n");
					hex =  'B' + hex;
					}
				if(remainder == 12)
				{
					System.out.println("In process: "+ "C"+"\n");
					hex = 'C'+ hex;
					}
				if(remainder == 13)
				{
					System.out.println("In process: "+ "D"+"\n");
					hex = 'D'+ hex;
					}
				if(remainder == 14)
				{
					System.out.println("In process: "+ "E"+"\n");
					hex = 'E'+ hex;
					}
				if(remainder == 15)
				{
					System.out.println("In process: "+ "F"+"\n");
					hex = 'F'+hex;
					}


				}while (result !=0);
		System.out.println("Complete hex: "+ hex);
		}
	}