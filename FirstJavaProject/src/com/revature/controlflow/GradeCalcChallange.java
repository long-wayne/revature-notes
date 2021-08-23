package com.revature.controlflow;

import java.util.Scanner;

public class GradeCalcChallange {

	public static void main(String[] args) {
		
		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		String F = "F";
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the total amount of possible points");
		
		double maxPoints = scanner.nextDouble();
		
		System.out.println("Please enter the total amount of points you got correct");
		
		double score = scanner.nextDouble();
		
		double finalScore = (score / maxPoints) * 100;
		
		if (finalScore >= 90) {
			System.out.println("The Student's Letter grade is: " + A + ". " + "That's " + (int) getFinalScore(score, maxPoints) + "% !");
		}		
		else if (finalScore >= 80) {
			System.out.println("The Student's Letter grade is: " + B + ". " + "That's " + (int) getFinalScore(score, maxPoints) + "% !");
		}		
		else if (finalScore >= 70) {
			System.out.println("The Student's Letter grade is: " + C + ". " + "That's " + (int) getFinalScore(score, maxPoints) + "% !");
		}		
		else if (finalScore >= 60) {
			System.out.println("The Student's Letter grade is: " + D + ". " + "That's " + (int) getFinalScore(score, maxPoints) + "% !");
		}		
		else if (finalScore >= 0) {
			System.out.println("The Student's Letter grade is: " + F + ". " + "That's " + (int) getFinalScore(score, maxPoints) + "% !");
		}		
		else {
			System.out.println("An error has occured");
		}		
	}
	
	public static double getFinalScore(double score, double maxPoints) {
		return (score / maxPoints) * 100;
	}		
}
