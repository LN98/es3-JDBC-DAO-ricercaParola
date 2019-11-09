package ricerca.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ricarca.model.Parola;

public class ParolaDAO {

	public static int nParole(String st) {
		String sql = "select count(nome) as n\n" + 
				"from parola\n" + 
				"where nome like ?";
		int n=0;
		try {
			Connection conn=ConnectionDB.getConnectionDB();
			
			PreparedStatement s=conn.prepareStatement(sql);
			s.setString(1, st+"%");
			ResultSet r= s.executeQuery();
			r.next();
			
			n= r.getInt("n");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return n;
	}
	
	public static int nParoleList(String st) {
		ArrayList<Parola> p=new ArrayList<Parola>();
		String sql = "select id,nome\n" + 
				"from parola\n" + 
				"where nome like ?";
		int n=0;
		try {
			Connection conn=ConnectionDB.getConnectionDB();
			PreparedStatement s=conn.prepareStatement(sql);
			s.setString(1, (st+"%"));
			ResultSet r=s.executeQuery();
			
			while(r.next()) {
				Parola pa=new Parola();
				pa.setId(r.getInt("id"));
				pa.setNome(r.getString("nome"));
				p.add(pa);
			}
			n=p.size();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return n;
	}

}
