package week5Assignment;

//Step 3b.

public class SpacedLogger implements Logger {

	//Step 6/7. Used a concat method to make step 8 easier and keep the
	//code uniform. Otherwise I would have used a maybe simpler method here.
	public void Log(String[] arges, String word) {

		String concat = " ";
		
		for ( int i = 0; i < word.length(); i++ ) {
		    concat += word.charAt(i)+" ";
		}	
		System.out.println(concat);
		
	}

	//Step 8. Using the above concat code, all I had to do was add "ERROR" and a " " at the beginning.
	public void Error(String[] arges, String word) {

		String concat = " ";
		
		for ( int i = 0; i < word.length(); i++ ) {
		    concat += word.charAt(i)+" ";
		}	
		System.out.println("ERROR:"+concat);
		
	}


}
