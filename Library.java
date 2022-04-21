package ProjetGestionBibliothèque;

public class Library {
	private int id;
	private String name;
	private String address;
	private int numtel;
	private Book [] tab1;
	private Rent [] tab2;
	




	public Library(int id, String name, String address, int numtel, Book[] tab1, Rent[] tab2) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.numtel = numtel;
		this.tab1 = tab1;
		this.tab2 = tab2;
	}


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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNumtel() {
		return numtel;
	}


	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}


	public Book[] getTab1() {
		return tab1;
	}


	public void setTab1(Book[] tab1) {
		this.tab1 = tab1;
	}


	public Rent[] getTab2() {
		return tab2;
	}


	public void setTab2(Rent[] tab2) {
		this.tab2 = tab2;
	}



	}
	
