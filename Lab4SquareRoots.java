/**
*
* Name: AltheaBriggs
* Teacher:Mr.Hardman
* Assignment #4, Program # 
* Date Last Modified:Nov.17
*
*/

import java.util.Scanner;

/**
 * 
 */

/**
 * @author A.briggs
 *
 */
public class SquareRoots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		double squareRoot;
		double userNumber;
		
		do{
		
			System.out.println("Please choose a positive number only");
			userNumber = userInput.nextDouble();
			
			if(userNumber<0){
			System.out.println("Error, you need a positive number!");
			}
			
			
			} while(userNumber<0);
			
			squareRoot = Math.sqrt(userNumber);
			
			System.out.println(" The square root of " + userNumber + " is equal to " + squareRoot);
			
				userInput.close();
		}
		
		
	}


