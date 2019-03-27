package com;

public class Main {
	public static String s(String name) {
		boolean flag1 = false;
		/*
		 * 
		 */
		boolean flag2 = true;
		while(flag1 && flag2) {
			System.out.println("flag is true");
		}
		
		if (name != null) {
            return name;
        }
        return null;     
	}

	public static void main(String[] args) {
		s("str");
	}

}
