package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

//---	
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				pearls++;
			}
		}
		return pearls;
	}
	
//---
	
	public static double findTallest(List<Double> people) {
		double tallest = 0;
		for (int i = 0; i < people.size(); i++) {
			if(people.get(i) >= tallest) {
				tallest = people.get(i);
			}
		}
		return tallest;
	}
	
//---
	
	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
		
	}
	
//---	
	
	public static boolean containsSOS(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).equals(" ... --- ... ")) {
				return true; 
			}
		}
		return false; 
	}
	
//---

	public static List<Double> sortScores(List<Double> scores) {
		boolean done = false; 
		while(!done) {
			done = true;
			for (int i = 1; i < scores.size(); i++) {
				if(scores.get(i-1) >= scores.get(i)) {
					double temp; 
					temp = scores.get(i-1);
					scores.set(i-1, scores.get(i));
					scores.set(i, temp);
					done = false;
				}
			}
		}
		return scores;
	}

//---

	public static List<String> sortDNA(List<String> words) {
		boolean done = false; 
		while(!done) {
			done = true;
			for (int i = 1; i < words.size(); i++) {
				if(words.get(i-1).length() >= words.get(i).length()) {
					String temp; 
					temp = words.get(i-1);
					words.set(i-1, words.get(i));
					words.set(i, temp);
					done = false;
				}
			}
		}
		return words;
	}



	
	
//---	
	
}
