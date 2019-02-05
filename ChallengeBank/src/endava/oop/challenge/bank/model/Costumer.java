package endava.oop.challenge.bank.model;

public class Costumer {
	
	private int id;
	private String name;
	private int phone;
	private String email;
	private Account account;
	
	
	//Costumer Constructor
	
	public Costumer(int idCostumer, String nameCostumer, int phoneCostumer, String emailCostumer, Account accountCostumer) {
		
		this.id = idCostumer;
		this.name = nameCostumer;
		this.phone = phoneCostumer;
		this.email = emailCostumer;
		this.account = accountCostumer;
		
	}

	
	
	//Setters and Getters for each attribute

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
