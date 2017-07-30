/* @author Matthew J. McKay
 * @studentNumber T00057652
 * @university Thompson Rivers University
 */
import java.util.Scanner;

public class Driver {

	@SuppressWarnings({ "rawtypes", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pass = 1;				//	Resets the pass int to 1
		ShellArray newArray0 = new ShellArray(25);		// Creates new ShellArray object, capacity is in the constructor and is populated with random integers
		System.out.println(newArray0.toString()+"\n");	// Prints the array to the console
		// This do-while loop allows the user to control how many time the shellSort algorithm runs.
		// Type 0 to end the loop and shellSort the new array
		do
		{
			ShellArray.shellSort(newArray0.myArray);	
			System.out.println("\n" + "This is pass number:"  + pass + "\n" + newArray0.toString()+"\n");
			pass++;
		}while((scan.nextInt()) != 0); 
		pass = 1;				//	Resets the pass int to 1
		ShellArray newArray1 = new ShellArray(50);		// Creates new ShellArray object, capacity is in the constructor and is populated with random integers
		System.out.println(newArray1.toString()+"\n");	// Prints the array to the console
		// This do-while loop allows the user to control how many time the shellSort algorithm runs.
		// 
		do
		{
			ShellArray.shellSort(newArray1.myArray);	
			System.out.println("\n" + "This is pass number:"  + pass + "\n" + newArray1.toString()+"\n");
			pass++;
		}while((scan.nextInt()) != 0);
		pass = 1;				//	Resets the pass int to 1
		ShellArray newArray2 = new ShellArray(75);		// Creates new ShellArray object, capacity is in the constructor and is populated with random integers
		System.out.println(newArray2.toString()+"\n");	// Prints the array to the console
		// This do-while loop allows the user to control how many time the shellSort algorithm runs.
		// 
		do
		{
			ShellArray.shellSort(newArray2.myArray);	
			System.out.println("\n" + "This is pass number:"  + pass + "\n" + newArray2.toString()+"\n");
			pass++;
		}while((scan.nextInt()) != 0);
		pass = 1;				//	Resets the pass int to 1
		ShellArray newArray3 = new ShellArray(100);		// Creates new ShellArray object, capacity is in the constructor and is populated with random integers
		System.out.println(newArray3.toString()+"\n");	// Prints the array to the console
		// This do-while loop allows the user to control how many time the shellSort algorithm runs.
		// 
		do
		{
			ShellArray.shellSort(newArray3.myArray);	
			System.out.println("\n" + "This is pass number:"  + pass + "\n" + newArray3.toString()+"\n");
			pass++;
		}while((scan.nextInt()) != 0);
	}


}

