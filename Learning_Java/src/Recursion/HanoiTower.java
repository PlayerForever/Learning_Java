package Recursion;

public class HanoiTower {
	
	// move the dishes
	// topN: the # of dishes to be moved
	// from/inter: the tower 
	public static void doTower(int topN, char from, char inter, char to) { 
		if(topN == 1) {
			System.out.println("Dish 1, from " + from + " Tower to " + to + " Tower");
		} else {
			doTower(topN -1, from, to, inter);
			System.out.println("Dish " + topN + ", from " + from + " Tower to " + to +" Tower");
			doTower(topN -1, inter, from, to);
		}
		
	}
}
