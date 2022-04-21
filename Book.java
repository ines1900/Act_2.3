package ProjetGestionBibliothèque;

public class Book {
	private int id;
	private String title;
	private String author;
	private String editor;
	private int pageNB;
	private String summary;
	private String library;
	
	public Book(int id, String title, String author, String editor, int pageNB, String summary, String library) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pageNB = pageNB;
		this.summary = summary;
		this.library = library;
		this.editor = editor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageNB() {
		return pageNB;
	}

	public void setPageNB(int pageNB) {
		this.pageNB = pageNB;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLibrary() {
		return library;
	}

	public void setLibrary(String library) {
		this.library = library;
	}
    
	public Book(String editor) {
		super();
		this.editor = editor;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", editor=" + editor + ", pageNB="
				+ pageNB + ", summary=" + summary + ", library=" + library + "]";
	}

	public void afficher_livre () {
	System.out.println(toString());
	}
	public boolean comparerbook(Book book1,Book book2) {
		boolean testComparateur = true;
		testComparateur = book1.getId()==(book2.getId());
		testComparateur = testComparateur && book1.getTitle().equals(book2.getTitle());
		testComparateur = testComparateur && book1.getAuthor().equals(book2.getAuthor());
		testComparateur = testComparateur && book1.getPageNB()==(book2.getPageNB());
		testComparateur = testComparateur && book1.getSummary().equals(book2.getSummary());
		testComparateur = testComparateur && book1.getLibrary().equals(book2.getLibrary());
		return testComparateur;
	}



}
