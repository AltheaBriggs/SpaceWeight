/**
*
* Name: AltheaBriggs 
* Teacher:Mr.Hardman
* Assignment #4, Program # 
* Date Last Modified:Nov.15
*
*/


import java.util.Scanner;
/**
 * @author A.briggs
 *
 */
public class SpaceWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Space weight");
		
		double Weight;
		double spaceWeight = 0;
		String Body;
		
		
		System.out.println("Weight:");
		Weight = userInput.nextDouble();
		
		System.out.println("Celestial Body");
		Body = userInput.next();
		
		
	    if (Body.equalsIgnoreCase("Mercury")){
	    	spaceWeight = Weight * (0.38);
		
	    }
		
		if (Body.equalsIgnoreCase("Venus")){
			spaceWeight = Weight * (0.91);
			
		}
	
		if (Body.equalsIgnoreCase("Earth")){
			spaceWeight = Weight * (1);
			
		}
		
		if (Body.equalsIgnoreCase("Moon")){
			spaceWeight = Weight * (0.165);
			
		}		
		
		if (Body.equalsIgnoreCase("Mars")){
			spaceWeight = Weight * (0.38);
		
		}
		
		if (Body.equalsIgnoreCase("Jupiter")){
			 spaceWeight = Weight * (2.34);
		
		}
		
		if (Body.equalsIgnoreCase("Saturn")){
			spaceWeight = Weight * (1.06);

		}
		
		if (Body.equalsIgnoreCase("Uranus")){
			spaceWeight = Weight * (0.92);

			
		}
		
		if (Body.equalsIgnoreCase("Neptune")){
			spaceWeight = Weight * (1.19);

			
		}
		
		if (Body.equalsIgnoreCase("Pluto")){
			spaceWeight = Weight * (0.06);
		
		}
		
		
		
		
		System.out.println("Your weight on " + Body + " is " + spaceWeight);
		
		userInput.close();
		

	}
}



	
		
		
	
	
	
	

	