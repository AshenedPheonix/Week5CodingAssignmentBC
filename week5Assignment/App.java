package week5Assignment;

//Here is steps 9 through 11.
// I used 4 different strings to instantiate all four methods.


public class App {

	public static void main(String[] args) {
		
		AsteriskLogger classObj1 = new AsteriskLogger();
		String word1 = "Hello";
		String word2 = "Java";
		classObj1.Log(args, word1);
		classObj1.Error(args, word2);
		
		SpacedLogger classObj2 = new SpacedLogger();
		String word3 = "Interface";
		String word4 = "Alexandra";
		classObj2.Log(args, word3);
		classObj2.Error(args, word4);
		
	}
}
