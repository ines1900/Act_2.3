package ProjetGestionBiblioth�que;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryManager {
	
	public static void main(String[] args) {
		
		lireEnBase();
		insertionlivre("impeccable", "victor", "konooz", 150, "fghsrhrs", "Noor");
		recherchelivre_parID(1);
		recherchelivre_parauteur("Pushkin");
	}
	public static void insertionlivre(String title, String author, String editor, int pageNB, String summary, String Library ) {

		String url = "jdbc:mysql://localhost/gestionbibliotheque";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "INSERT INTO `book` (title, author, editor, pageNB, summary, library) VALUES ('"+title+"','"+author+"', '"+editor+"', "+pageNB+",'"+summary+"','"+Library+"')";


			// Etape 4 : ex�cution requ�te
			st.executeUpdate(sql);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : lib�rer ressources de la m�moire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void lireEnBase() {

		String url = "jdbc:mysql://localhost/gestionbibliotheque";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null;

		try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		cn = DriverManager.getConnection(url, login, passwd);
		st = cn.createStatement();
		String sql = "SELECT * FROM Book";
		rs = st.executeQuery(sql);
		while (rs.next()) {
		System.out.println(rs.getString("title"));
		System.out.println(rs.getString("author"));
		System.out.println(rs.getString("pageNb"));
		System.out.println(rs.getString("summary"));
		System.out.println(rs.getString("Library"));
		}
		} catch (SQLException e) {
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} finally {
		try {
		cn.close();
		st.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		}
	
	public static void recherchelivre_parID(int id) {
		String url = "jdbc:mysql://localhost/gestionbibliotheque";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			ResultSet rs;
			String sql = ("SELECT * FROM `Book` WHERE`id`= "+id+"");
			System.out.println("le livre recherch� par ID est:");
			rs = st.executeQuery(sql);
			while (rs.next()) {
			System.out.println(rs.getString("title"));
			System.out.println(rs.getString("author"));
			System.out.println(rs.getString("editor"));
			System.out.println(rs.getString("pageNb"));
			System.out.println(rs.getString("summary"));
			System.out.println(rs.getString("Library"));

		} 	} catch (SQLException e) {
			e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} finally {
			try {
			cn.close();
			st.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
		}
	public static void recherchelivre_parauteur(String author) {
		String url = "jdbc:mysql://localhost/gestionbibliotheque";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			ResultSet rs;
			String sql = ("SELECT * FROM `Book` WHERE `author`= "+author+"");
			System.out.println("le livre recherch� par auteur est:");
			rs = st.executeQuery(sql);
			while (rs.next()) {
			System.out.println(rs.getString("title"));
			System.out.println(rs.getString("author"));
			System.out.println(rs.getString("editor"));
			System.out.println(rs.getString("pageNb"));
			System.out.println(rs.getString("summary"));
			System.out.println(rs.getString("Library"));

		} 	} catch (SQLException e) {
			e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} finally {
			try {
			cn.close();
			st.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
		}
	public static void recherchelivre_parauteur(String author) {
		String url = "jdbc:mysql://localhost/gestionbibliotheque";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			ResultSet rs;
			String sql = ("SELECT * FROM `Book` WHERE `author`= "+author+"");
			System.out.println("le livre recherch� par auteur est:");
			rs = st.executeQuery(sql);
			while (rs.next()) {
			System.out.println(rs.getString("title"));
			System.out.println(rs.getString("author"));
			System.out.println(rs.getString("editor"));
			System.out.println(rs.getString("pageNb"));
			System.out.println(rs.getString("summary"));
			System.out.println(rs.getString("Library"));

		} 	} catch (SQLException e) {
			e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} finally {
			try {
			cn.close();
			st.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
		}
	
	}

