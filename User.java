package ProjetGestionBibliothèque;

import java.util.Arrays;

public class User {
	private int id;
	private String name;
	private String prenom;
	private String adress;
	private int numtel;
	private String mail;
	private Rent [] tab2;
	
	public User(int id, String name, String prenom, String adress, int numtel, String mail, Rent[] tab2) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.adress = adress;
		this.numtel = numtel;
		this.mail = mail;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumtel() {
		return numtel;
	}

	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Rent[] getTab2() {
		return tab2;
	}

	public void setTab2(Rent[] tab2) {
		this.tab2 = tab2;
	}
	
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", prenom=" + prenom + ", adress=" + adress + ", numtel=" + numtel
				+ ", mail=" + mail + ", tab2=" + Arrays.toString(tab2) + "]";
	}

	public void afficherUser () { 
	 	System.out.println(toString());
	}


	public Boolean Verifier(User U1, User U2) {
		Boolean verif = false;
	if (U1.getId()==(U2.getId()) & U1.getPrenom().equals(U2.getPrenom())
		& U1.getName().equals(U2.getName()) & U1.getAdress().equals(U2.getAdress()));
	{	 
	verif = true; 
		 System.out.println("les deux User sont égaux");
	}
	return verif;
	}
}

