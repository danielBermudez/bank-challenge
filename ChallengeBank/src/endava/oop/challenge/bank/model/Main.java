package endava.oop.challenge.bank.model;

public class Main {

	public static void main(String[] args) {

		Agent agent = new Supervisor(0, null, false);
		if (agent instanceof Cashier) {
			System.out.println("Hello THere");
		}
	}

}	
