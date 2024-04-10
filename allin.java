import java.util.*;
public class allin
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("----------------ASCII, BINARY AND HEXADECIMAL CALCULATOR---------------");
		System.out.println("");
		String Option;
		do
		{
		System.out.print("Here your calculate options:\n 1. Decimal to Binary.\n 2. Binary to Decimal.\n 3. Decimal to Hexadecimal.\n 4. Hexadecimal to decimal.\n 5. Binary to Hexadecimal.\n 6. Hexadecimal to Binary.\n\n\n");
		System.out.print("Choose your option from 1 to 6: ");
		int option = keyboard.nextInt();
		double result, remainder;
		System.out.println("");
		switch(option)
		{
			case 1:
				System.out.println("Changing from DECIMAL to BINARY: ");
				System.out.print("Enter your number: ");
				double number = keyboard.nextDouble();
				char a ='1';
				char b ='0';
				String binary = "";
				do
						{
							result = number/2;
							remainder = number%2;
							System.out.println(number+" / 2 = "+result);
							if(remainder ==1)
							{
								System.out.println("Remainder =  "+remainder+"\n");
								binary = a + binary;
								number = result - 0.5;
							}
							else if(remainder ==0)
							{
								System.out.println("Remainder =  "+remainder+"\n");
								binary = b+ binary;
								number = result;
							}

						}
						while(number != 0);
				System.out.println("Binary number is: "+binary);
			break;

			case 2:
				System.out.println("Changing from BINARY to DECIMAL:");
				System.out.print("Enter your number: ");
				number = keyboard.nextDouble();
				System.out.println("------------------------------------------------------------");
				System.out.println("|   Number of digit|   Value of digit|  2^n  |  value*(2^n)       ");
				double i = 0;
				double digit;
				double n;
				double sum = 0;
				do
						{
							n = Math.pow(2,i);
							i++;
							digit = number%10;
						System.out.println("|   "+i+"            |    "+digit+"          |" +"  2^"+(i-1)+"|  "+digit*(n)+"                ");
						sum =sum + (digit*n);
							number = (number-digit)/10;
							}
						while(number>0);
				System.out.println("Decimal number is: "+sum);
			break;

			case 3:
				System.out.println("Changing from DECIMAL to HEXADECIMAL: ");
				System.out.print("Enter your number: ");
				number = keyboard.nextDouble();
				int NUMBER = (int)number;
				String hex = "";
				int REMAINDER;
				int RESULT;
						do
						{
						RESULT = NUMBER/16;
						REMAINDER = NUMBER%16;
						System.out.println(NUMBER + " / 16 = "+RESULT);
						System.out.println("Remainder = " +REMAINDER);
						NUMBER = RESULT;
						String letternumber;
						if (number == 0)
							{
								System.out.println("In process: "+ REMAINDER+"\n");
								letternumber = String.valueOf(REMAINDER);
								hex = letternumber + hex;
							}

						else if(REMAINDER < 10)
						{
							System.out.println("In process: "+ REMAINDER+"\n");
								letternumber = String.valueOf(REMAINDER);
							hex =  letternumber + hex;
							}

						if(REMAINDER == 10)
						{
							System.out.println("In process: "+  "A"+"\n");
							hex = 'A' + hex;
							}
						if( REMAINDER== 11)
						{
							System.out.println("In process: "+ "B"+"\n");
							hex =  'B' + hex;
							}
						if(REMAINDER == 12)
						{
							System.out.println("In process: "+ "C"+"\n");
							hex = 'C'+ hex;
							}
						if(REMAINDER == 13)
						{
							System.out.println("In process: "+ "D"+"\n");
							hex = 'D'+ hex;
							}
						if(REMAINDER == 14)
						{
							System.out.println("In process: "+ "E"+"\n");
							hex = 'E'+ hex;
							}
						if(REMAINDER == 15)
						{
							System.out.println("In process: "+ "F"+"\n");
							hex = 'F'+hex;
							}


						}while (RESULT !=0);
		System.out.println("Complete hex: "+ hex);
			break;

			case 4:
				System.out.println("Changing from HEXADECIMAL to DECIMAL:");
				keyboard.nextLine();
				System.out.print("Enter your number: ");
				String numbe = keyboard.nextLine();

				int u = numbe.length();
				int length = numbe.length();
				int q = 0;
				double m;
				double decimal = 0;


							do
							{
								m = Math.pow(16,q);
								q++;

								switch(numbe.substring(u-1,u))
								{

									case "A":
									case "a":
										System.out.println("Digit number "+q+" is: A which is 10 in denary.");
										System.out.println("10*(16^"+q+") ="+10*m+"\n");
										decimal = decimal + (10*m);
									break;

									case "B":
									case "b":
										System.out.println("Digit number "+q+" is: A which is 11 in denary.");
										System.out.println("11*(16^"+q+") ="+11*m+"\n");
										decimal = decimal + (11*m);
									break;

									case "C":
									case "c":
										System.out.println("Digit number "+q+" is: C which is 12 in denary.");
										System.out.println("12*(16^"+q+") ="+12*m+"\n");
										decimal = decimal + (12*m);
									break;

									case "D":
									case "d":
										System.out.println("Digit number "+q+" is: D which is 13 in denary.");
										System.out.println("13*(16^"+q+") ="+13*m+"\n");
										decimal = decimal + (13*m);
									break;

									case "E":
									case "e":
										System.out.println("Digit number "+q+" is: E which is 14 in denary.");
										System.out.println("14*(16^"+q+") ="+14*m+"\n");
										decimal = decimal + (14*m);
									break;

									case "F":
									case "f":
										System.out.println("Digit number "+q+" is: F which is 15 in denary.");
										System.out.println("15*(16^"+q+") ="+15*m+"\n");
										decimal = decimal + (15*m);
									break;

									case "0":
										System.out.println("Digit number"+q+"is 0");
										System.out.println("0*(16^"+q+")= "+(0*m)+"\n");
										decimal = decimal + (0*m);
									break;

									case "1":
									System.out.println("Digit number "+q+" is 1");
										System.out.println("1*(16^"+q+")= "+(1*m)+"\n");
										decimal = decimal + (1*m);
									break;

									case "2":
									System.out.println("Digit number "+q+" is 2");
										System.out.println("2*(16^"+q+")= "+(2*m)+"\n");
										decimal = decimal + (2*m);
									break;

									case "3":
									System.out.println("Digit number "+q+" is 3");
										System.out.println("3*(16^"+q+")= "+(3*m)+"\n");
										decimal = decimal + (3*m);
									break;

									case "4":
									System.out.println("Digit number "+q+" is 4");
										System.out.println("4*(16^"+q+")= "+(4*m)+"\n");
										decimal = decimal + (4*m);
									break;

									case "5":
									System.out.println("Digit number "+q+" is 5");
										System.out.println("5*(16^"+q+")= "+(5*m)+"\n");
										decimal = decimal + (5*m);
									break;

									case "6":
									System.out.println("Digit number "+q+" is 6");
										System.out.println("6*(16^"+q+")= "+(6*m)+"\n");
										decimal = decimal + (6*m);
									break;

									case "7":
									System.out.println("Digit number "+q+" is 7");
										System.out.println("7*(16^"+q+")= "+(7*m)+"\n");
										decimal = decimal + (7*m);
									break;

									case "8":
									System.out.println("Digit number "+q+" is 8");
										System.out.println("8*(16^"+q+")= "+(8*m)+"\n");
										decimal = decimal + (8*m);
									break;

									case "9":
									System.out.println("Digit number "+q+" is 9");
										System.out.println("9*(16^"+q+")= "+(9*m)+"\n");
										decimal = decimal + (9*m);
									break;

									default:
										System.out.println("Error!");
									break;
								}
								u--;
							}while(u>=1);

		System.out.println("Decimal number: "+decimal);
			break;

			case 5:
				System.out.println("Changing from BINARY to HEXADECIMAL: ");
				System.out.print("Enter your number: ");
				number = keyboard.nextDouble();
				REMAINDER = 0;
				System.out.println("------------------------------------------------------------");
				int v = 0;
				sum = 0;
								System.out.println("|   Number of digit|   Value of digit|  2^n  |  value*(2^n)       ");
								do
								{
									n = Math.pow(2,v);
									m = (int) n;

									v++;
									digit = number%10;
								System.out.println("|   "+v+"            |    "+digit+"          |" +"  2^"+(v-1)+"|  "+digit*(m)+"                ");
								sum =sum + (digit*m);
									number = (number-digit)/10;
									}
								while(number>0);
						System.out.println("Decimal number is: "+sum);

						NUMBER = (int)sum;
						String hexa = "";
										do
														{
														RESULT =NUMBER/16;
														REMAINDER = NUMBER%16;
														System.out.println(NUMBER + " / 16 = "+RESULT);
														System.out.println("Remainder = " +REMAINDER);
														NUMBER = RESULT;
														String letternumber;
														if (REMAINDER <=9)
															{
																System.out.println("In process: "+ REMAINDER+"\n");
																letternumber = String.valueOf(REMAINDER);
																hexa = letternumber + hexa;
															}


														if(REMAINDER == 10)
														{
															System.out.println("In process: "+  "A"+"\n");
															hexa = 'A' + hexa;
															}
														if( REMAINDER== 11)
														{
															System.out.println("In process: "+ "B"+"\n");
															hexa =  'B' + hexa;
															}
														if(REMAINDER == 12)
														{
															System.out.println("In process: "+ "C"+"\n");
															hexa = 'C'+ hexa;
															}
														if(REMAINDER == 13)
														{
															System.out.println("In process: "+ "D"+"\n");
															hexa = 'D'+ hexa;
															}
														if(REMAINDER == 14)
														{
															System.out.println("In process: "+ "E"+"\n");
															hexa = 'E'+ hexa;
															}
														if(REMAINDER == 15)
														{
															System.out.println("In process: "+ "F"+"\n");
															hexa = 'F'+hexa;
															}


														}while (RESULT !=0);
		System.out.println("Complete hex: "+ hexa);
		break;

		case 6:
			System.out.println("Changing from HEXADECIMAL TO BINARY:");
			keyboard.nextLine();
			System.out.print("Enter your number: ");
			String HEX = keyboard.nextLine();
			int w = HEX.length();
			int Length = HEX.length();
			int t = 0;
			double g;
							double dEcimal = 0;


								do
								{
									g = Math.pow(16,t);
									t++;

									switch(HEX.substring(w-1,w))
									{

										case "A":
										case "a":
											dEcimal = dEcimal + (10*g);
										break;

										case "B":
										case "b":
											dEcimal = dEcimal + (11*g);
										break;

										case "C":
										case "c":
											dEcimal = dEcimal + (12*g);
										break;

										case "D":
										case "d":
											dEcimal = dEcimal + (13*g);
										break;

										case "E":
										case "e":
											dEcimal = dEcimal + (14*g);
										break;

										case "F":
										case "f":
											dEcimal = dEcimal + (15*g);
										break;

										case "0":
											dEcimal = dEcimal + (0*g);
										break;

										case "1":
											dEcimal = dEcimal + (1*g);
										break;

										case "2":
											dEcimal = dEcimal + (2*g);
										break;

										case "3":
											dEcimal = dEcimal + (3*g);
										break;

										case "4":
											dEcimal = dEcimal + (4*g);
										break;

										case "5":
											dEcimal = dEcimal + (5*g);
										break;

										case "6":
											dEcimal = dEcimal + (6*g);
										break;

										case "7":
											dEcimal = dEcimal + (7*g);
										break;

										case "8":
											dEcimal = dEcimal + (8*g);
										break;

										case "9":
											dEcimal = dEcimal + (9*g);
										break;

										default:
											System.out.println("Error!");
										break;
									}
									w--;
								}while(w>=1);

							System.out.println("Hex to decimal: "+dEcimal);


							result = 0;
							remainder= 0;
							char k ='1';
							char l ='0';
							String BInary = "";
							do
							{
								result = dEcimal/2;
								remainder = dEcimal%2;
								System.out.println(dEcimal +" / 2 = "+result);
								if(remainder ==1)
								{
									System.out.println("Remainder =  "+remainder+"\n");
									BInary = k + BInary;
									dEcimal = result - 0.5;
								}
								else if(remainder ==0)
								{
									System.out.println("Remainder =  "+remainder+"\n");
									BInary = l+ BInary;
									dEcimal = result;
								}

							}
							while(dEcimal != 0);
		System.out.println("Decimal to binary number is: "+BInary);
		break;

		default:
			System.out.println("Erorr");
		break;
			}
			keyboard.nextLine();
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.print("Do you want to use the table again?(Y/N): ");
		   Option = keyboard.nextLine();
		   System.out.println(" \n\n");
			}while(Option.equalsIgnoreCase("Y"));
			System.out.println("Thank you!!!");
	}
}

