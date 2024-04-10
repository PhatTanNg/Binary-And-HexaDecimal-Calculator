import java.util.*;
public class decimaltohex
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String hex = "";
		int decimal;
		System.out.print("Enter decimal number: ");
		decimal = keyboard.nextInt();
		int remainder;
		int result;
		do
		{
		result = decimal/16;
		remainder = decimal%16;
		System.out.println(decimal + " / 16 = "+result);
		System.out.println("Remainder = " +remainder);
		decimal = result;
		String letternumber;
		if (decimal == 0)
			{
				System.out.println("In process: "+ remainder+"\n");
				letternumber = String.valueOf(remainder);
				hex = letternumber + hex;
			}

		else if(remainder < 10)
		{
			System.out.println("In process: "+ remainder+"\n");
				letternumber = String.valueOf(remainder);
			hex =  letternumber + hex;
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