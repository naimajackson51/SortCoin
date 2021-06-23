
import java.util.Scanner;

public class SortCoinDemo
{

	public static void main(String[] args) 
	{
	    int length;
	    Scanner cn = new Scanner(System.in);
	    System.out.println("How many coins will you enter?: ");
		length = cn.nextInt();//sets length of array
		double[] coin = new double[length];//creation of coin array
		for(int i = 0; i < length; i++)
		{
			System.out.println("Enter your coins: ");
			double value = cn.nextDouble();//user inputs coin values
			 if(value == 0.25 || value == 0.05 || value == 0.10 || value == 0.01 || value == 1.00 )
			 {
					coin[i] = value;
			 }
			 else
			 {
			 System.out.println("Not a coin, Try Again!!");
			 }//end of if
		} //end of for
		
		SelectionSorter.sort(coin); //call to sort method
		for(int i = 0; i < length; i++)
		{
			System.out.println(coin[i] + "\n"); //output sorted array
			
		}
		System.out.println("Sorted!!!");
		cn.close();
		}
	
	
		
		
		
		
		
		
				
	} //end of main




