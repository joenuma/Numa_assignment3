import java.util.Scanner;
import java.util.Random;
public class CAI1 {
	public static void main(String[] args) {
		QandA();
	
	}
public static void QandA() {
	Random rand = new Random();
	
	int num1 = rand.nextInt(10);
	int num2 = rand.nextInt(10);
	
	while(true) {
		int ans1 = askQuestion(num1,num2);
		int ans2 = readResponse();
		if(ans1 == ans2) {
			displayCorrectResponse();
			break;
		}
		displayIncorrectResponse();
	}
	}
	public static int readResponse() {
	       Scanner choice = new Scanner(System.in);
	       int val = choice.nextInt();
	       return val;
	   }
  
	public static int askQuestion(int num1, int num2) {
		System.out.println("How much is "+num1+" times "+num2 +"");
		return num1*num2;
	}
	public static boolean IsAnswerCorrect(int ans1,int ans2) {
		if(ans1 == ans2) {
			return true;
		}
		return false;
	}
	 public static void displayCorrectResponse() {
	       System.out.println("Very Good");
	   }

	   public static void displayIncorrectResponse() {
	       System.out.println("No. Please try again.");
}
}



