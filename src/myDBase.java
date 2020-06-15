import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//tabele, wypełnianie i stosowanie
//https://docs.oracle.com/javase/tutorial/uiswing/components/table.html

public class myDBase {
	
	public static List<Sample> readBase(){
		List<Sample> lista = new ArrayList<Sample>();
		
		
		try {
			Connection con = myConnection();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT id_proba, nr_proby, nr_serii FROM proba");
			
			while (resultSet.next()) {
				Sample sample = new Sample();
				sample.idSample = resultSet.getLong(1);
				sample.nrProby = resultSet.getString(2);
				sample.nrSerii = resultSet.getString(3);
				lista.add(sample);
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for(Sample s : lista) System.out.println(s);
		return lista;
	}
	
	public static Connection myConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found: "+e);
		}
		
		String url="jdbc:mysql://localhost/s16600?useSSL=false";
		String user="test";
		String password="haslo";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Not connected.");
		}
		return con;
	}

}
