package ProjetGestionBibliothèque;

import java.sql.Date;

public class Rent {
	private int id;
	private String User;
	private String Book;
	private Date DatePret;
	private Date DateFin;
	
	public Rent(int id, String user, String book, Date datePret, Date dateFin) {
		super();
		this.id = id;
		User = user;
		Book = book;
		DatePret = datePret;
		DateFin = dateFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getBook() {
		return Book;
	}

	public void setBook(String book) {
		Book = book;
	}

	
	
	public Date getDatePret() {
		return DatePret;
	}

	public void setDatePret(Date datePret) {
		DatePret = datePret;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public String toString() {
		return "Rent [ID=" + id + ", Nom du User=" + User + ", Book=" + Book + ""
				+ ",La Date de Pret=" + DatePret+", La Date de Fin= "+ DateFin+" ]";
	}


	public void afficherRent () { 
	 	System.out.println(toString());
	}


	public Boolean Verifier(Rent R1, Rent R2) {
		Boolean verif = false;
	if (R1.getId()==(R2.getId()) & R1.getUser().equals(R2.getUser())
		& R1.getBook().equals(R2.getBook()));
	{	 
	verif = true; 
		 System.out.println("les deux book sont égaux");
	}
	return verif;
	}
}
