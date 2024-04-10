import java.util.*;
public class binarytodecimal
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double binary, decimal;
		System.out.print("Enter binary number: ");
		binary= keyboard.nextDouble();
		System.out.println("------------------------------------------------------------");
		System.out.println("|   Number of digit|   Value of digit|  2^n  |  value*(2^n)       |");
		double i = 0;
		double digit;
		double n;
		double sum = 0;
		do
		{
			n = Math.pow(2,i);
			i++;
			digit = binary%10;
			System.out.println("|   "+i+"            |    "+digit+"          |" +"  2^"+(i-1)+"|  "+digit*(n)+"                |");
			sum =sum + (digit*n);
			binary = (binary-digit)/10;
			}
		while(binary>0);
		System.out.println("Decimal number is: "+sum);
	}


	}