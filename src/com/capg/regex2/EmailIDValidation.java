package com.capg.regex2;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an email: ");
		String email = sc.nextLine();
		Pattern pattern =Pattern.compile("^abc@bridgelabz.co");
		Matcher matcher = pattern.matcher(email);
		boolean matchfound = matcher.find();
		if(matchfound) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}
	}
}