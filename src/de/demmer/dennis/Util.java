package de.demmer.dennis;

public class Util {
	
	public static void countTo(int bis) {
		for (int i = 1; i <= bis; i++) {
			System.out.println(i);
		}
	}
	
	
	public static int sumOf(int x) {
		int sum = 0;
		for (int i = 1; i <= x ; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	
	public static void printField(int breite, int höhe) {
		
		for (int i = 0; i < höhe; i++) {
			
			for (int j = 0; j < breite; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	

}
