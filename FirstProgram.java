//Brayden Foreman  Test Project

package testing2;
import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;

public class FirstProgram {
	public static void problemOne(Scanner kb) {
		kb.reset();
		out.println("Starting problem 1...");
		String sent;
		String upper = "";
		int counter = 0;
		char firstChar = ' ';
		
		while(true) {
			out.print("Give me a sentence.");
			
			sent = kb.nextLine();
			if(sent.length() == 0) {
				out.print("Try again!");
				continue;
			}
			break;
		}
		for(int i = 0; i < sent.length(); i++) {
			upper += sent.charAt(i);
			if(i == 0)
				firstChar = sent.charAt(i);
			counter += 1;
		}
		out.println("There are "+counter+" characters in the sentence: ");
		out.println("Sentence uppercased: "+upper.toUpperCase());
		out.println("First Char: "+firstChar);		
	}
	public static void problemTwo(Scanner kb) {
		out.println("Starting problem 2...");
		double sugPer = 1.5 / 48 ;
		double buttPer = 1.0 / 48;
		double flourPer = 2.75/48;
		int num = 0;

		while(true) {
			try {
				out.print("Enter how many cookies you want to make (no decimal): ");
				num = kb.nextInt();
			}catch(Exception e) {
				out.println("Failed to convert! Did you input a wrong value?");
				kb.nextLine();
				continue;
			}
			break;
		}
		out.println("You will need "+(sugPer*num)+" cups of sugar for "+num+" cookies.");
		out.println("You will need "+(buttPer*num)+" cups of butter for "+num+" cookies.");
		out.println("You will need "+(flourPer*num)+" cups of flour for "+num+" cookies.");
	}
	public static void problemThree(Scanner kb) {
		kb.reset();
		int q = -1;
		int d = -1;
		int n = -1;
		int p = -1;
		int total = 0;
		out.println("Starting problem 3...");
		while(true) {
			try {
				out.println("How many quarters do you have?");
				q = kb.nextInt();
				out.println("How many dimes do you have?");
				d = kb.nextInt();
				out.println("How many nickels do you have?");
				n = kb.nextInt();
				out.println("How many pennies do you have?");
				p = kb.nextInt();
			}catch(Exception e) {
				out.println("Failed to handle value! Only enter whole integers in inputs");
				kb.nextLine();
				continue;
			}
			if(q < 0 || d < 0 || n < 0 || p < 0){
				out.println("Vals cannot be less than 0!");
				continue;
			}
			break;
		}
		total += q * 25;
		total += d * 10;
		total += n * 5;
		total += p * 1;
		float v = total;
		out.println("You have "+ v/100+" in change");
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(in);
		problemOne(kb);
		problemTwo(kb);
		problemThree(kb);
		kb.close();
	}
}
