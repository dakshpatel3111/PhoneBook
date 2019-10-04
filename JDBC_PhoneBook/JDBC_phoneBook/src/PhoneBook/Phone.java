package PhoneBook;

public class Phone {
	private int id;
	private int number;
	private String name;
	
	public Phone() {
		super();
	}
	public Phone(int number , String name) {
		super();
		
		this.number= number;
		this.name = name;
	}
	public int getNumber() {
		
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}

