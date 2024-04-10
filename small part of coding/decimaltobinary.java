import java.util.*;
public class decimaltobinary
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double decimal, result, remainder;
		char a ='1';
		char b ='0';
		String binary = "";
		System.out.print("Enter decimal number: ");
		decimal = keyboard.nextDouble();

		do
		{
			result = decimal/2;
			remainder = decimal%2;
			System.out.println(decimal +" / 2 = "+result);
			if(remainder ==1)
			{
				System.out.println("Remainder =  "+remainder+"\n");
				binary = a + binary;
				decimal = result - 0.5;
			}
			else if(remainder ==0)
			{
				System.out.println("Remainder =  "+remainder+"\n");
				binary = b+ binary;
				decimal = result;
			}

		}
		while(decimal != 0);
		System.out.println("Binary number is: "+binary);
		}
	}