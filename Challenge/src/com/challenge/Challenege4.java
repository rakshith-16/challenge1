package com.challenge;

public class Challenege4 {
	
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 65));
		System.out.println(isCatPlaying(false, 40));
		System.out.println(isCatPlaying(true, 25));
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (temperature >= 25) && (temperature <= 45);
        } else {
            return (temperature >= 25) && (temperature <= 35);
        }
    }

}
