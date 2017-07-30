/* @author Matthew J. McKay
 * @studentNumber T00057652
 * @university Thompson Rivers University
 */

import java.util.Scanner;
public class ShellArray<T> implements ShellArrayADT<T>
{
	static Scanner scan = new Scanner(System.in);
	public static boolean swapflag;
	public int i;
	public static int count;
	private static int gap;
	public int[] myArray;
	public static String passX;
//-----------------------------------------------------------------
//  Creates and populates a ShellArray object with an int[] array
//-----------------------------------------------------------------
	
public ShellArray(int arrayLength)
{
	final int length = arrayLength;		
	myArray = new int[length];
	populateArray(myArray);
}
//-----------------------------------------------------------------
// This method populates our array with random integers
//-----------------------------------------------------------------
	public void populateArray(int[] data)
	{
		
		for(i=0;i<data.length;i++)
		{
			data[i] =((int)(Math.random()*100));
		}
	}
//-----------------------------------------------------------------
// This is our shellSort method that we use to sort our array.
// The pseudo-code is slightly altered to allow the user to see
// each pass of the algorithm.
//-----------------------------------------------------------------
	public static <T extends Comparable<T>> 
	void shellSort(int[] myArray)
	{
		int size = myArray.length;
		gap = size/2;
		do
		{	
			swapflag=true;
			do
			{
				for(int s = 0;s < size-gap ;s++)
				{
					if(myArray[s]>myArray[(s+gap)])
					{
						swap(myArray, s, (s+gap));
						swapflag=true;
					}
					else
					{
						swapflag=false;
					}
					System.out.print(myArray[s] + " " );
				}
				System.out.print("\n");
			}while(swapflag != false);
			gap = gap/2;
		}while(gap>0);
	}	
//-----------------------------------------------------------------
//  This is our swap method used for sorting our array indexes 
//-----------------------------------------------------------------	
	
	private static <T extends Comparable<T>> 
	void swap(int[] myArray, int index1, int index2)
	{
	int temp = myArray[index1];
	myArray[index1] = myArray[index2];
	myArray[index2] = temp;
	}
//-----------------------------------------------------------------
//  Creates a string representation of our ShellArray's int array
//-----------------------------------------------------------------	
	
	public String toString()   
	{
	      String result = "";

	      for (int i=0; i< myArray.length ; i++)
	      { 
	    	  result += myArray[i] + " ";
	      }
	      return result;
	   }	
}

