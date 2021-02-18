import java.util.Scanner;

public class vending {
	
	public static void main(String[] args) {
		int snack = runMenu();
		int cost = retrievePrice(snack);
		int change = moneyInserted(cost);
	}

	public static int runMenu() {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		System.out.println("\n\nPlease enter your selection:" + "\n1: Pepsi \t 25" + "\n2: Coke \t 30"
				+ "\n3: Sprite \t 50" + "\n4: Root Beer \t 85" + "\n5: Exit ");
		choice = keyboard.nextInt();
		return choice;
	}

	public static int retrievePrice(int menuChoice) {
		if (menuChoice == 1)
			return 25;
		if (menuChoice == 2)
			return 30;
		if (menuChoice == 3)
			return 50;
		if (menuChoice == 4)
			return 85;
		else
			return 0;
	}

	public static int moneyInserted(int cost) {
		Scanner keyboard = new Scanner(System.in);
		int money = 0;
		System.out.println("Your item costs: " + Cost + " Please enter the amount of money:");
		money = keyboard.nextInt();
		while (money < Cost) {
			System.out.println("Please insert sufficient funds");
			money = money + keyboard.nextInt();
		}
		return money - Cost;
	}
}