package week5Assignment;

//Step 3a.

public class AsteriskLogger implements Logger {

	//Step 4, super simple.
	public void Log(String[] arges, String word) {
		
		System.out.println("***"+word+"***");
	}

	
	//Step 5, Still simple, but extra code to ensure that the box of
	//Asterisks is always even. Regardless of String length.
	public void Error(String[] arges, String word) {
		
		String concat = "";
		
		for ( int i = 0; i < word.length(); i++ ) {
		    concat += "*";
		}	
		
		System.out.println("***"+concat+"***");
		System.out.println("***"+word+"***");
		System.out.println("***"+concat+"***");
	}
	
}
