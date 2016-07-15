package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;



public class Try {
	@Test
	public void ccc(){
		try{
            Class.forName("com.mysql.jdbc.Driver") ;
            String url ="jdbc:mysql://118.193.205.238:3306/demo" ;
            Connection conn = DriverManager.getConnection(url,"root","qscqsc42") ;
            PreparedStatement pstmt = conn.prepareStatement("select * from car");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
            	System.out.println("success..."+rs.getInt(1)+rs.getString(2)) ;

            	
            }
                    }catch(Exception e){
            System.out.println("failure!!!") ;
            e.printStackTrace();
        }
		
		
	}
}
