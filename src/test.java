public class test {
	public static void main(String args[]) {
		Snack sprite = new Snack(1);
		Snack coke = new Snack(2);
		Snack drPepper = new Snack(3);
		
		
		    System.out.println("Hi, welcome to the vending machine. We only accept $1 bills. Please insert the money by typing the amount!");
		    Scanner scanner = new Scanner(System.in);
		    int money = scanner.nextInt();
		    System.out.println("We have a variety of snacks such as coke, sprite, and dr pepper. Press 1 for coke, 2 for sprite, 3 for dr pepper");
		    int choice = scanner.nextInt();
		    if ((choice == 1) && (money < coke.getPrice())) {
		    	System.out.println("Money is not enough. Insert more money");
		    	int moreMoney = scanner.nextInt();
		    	money+= moreMoney;
		    }
		    else if ((choice == 2) && (money < sprite.getPrice())) {
		    	System.out.println("Money is not enough. Insert more money");
		    	int moreMoney = scanner.nextInt();
		    	money+= moreMoney;
		    }
		    else if ((choice == 3) && (money < drPepper.getPrice())) {
		    	System.out.println("Money is not enough. Insert more money");
		    	int moreMoney = scanner.nextInt();
		    	money+= moreMoney;
		    }
		    System.out.println("Press 1 for confirmation or 2 to cancel your order");
		    int confirmation = scanner.nextInt();
		    
		  
		    
		
	
		
		
		
		
		
	
	}

}
