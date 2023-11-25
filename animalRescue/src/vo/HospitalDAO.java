package vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HospitalDAO {
	String myDriver="oracle.jdbc.driver.OracleDriver";
	String myURL="jdbc:oracle:thin:@localhost:1521:orcl";
	String myID="jsp_31";
	String myPass="1234";
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public HospitalDAO(){//생성자
		try{
			Class.forName(myDriver);			
		}catch(ClassNotFoundException ce){
			System.out.print("드라이버 로딩 에러");
		}
	}
	public ArrayList<Hospital> selectAllHospital(){
		ArrayList<Hospital> list = new ArrayList<Hospital>();
		Hospital hp = null;
		String sql = "select * from hospital";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				hp = new Hospital();
				hp.setHospitalnum(rs.getInt("hospitalnum"));
				hp.setArea(rs.getString("area"));
				hp.setName(rs.getString("name"));
				hp.setTel(rs.getString("tel"));
				hp.setAdress(rs.getString("adress"));
				hp.setOpen(rs.getString("open"));
				hp.setMaplat(rs.getDouble("maplat"));
				hp.setMaplng(rs.getDouble("maplng"));
				hp.setContent(rs.getString("content"));
				
				list.add(hp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return list;
	}
	
	public ArrayList<Hospital> selectHospital(int start, int last){
		ArrayList<Hospital> list = new ArrayList<Hospital>();
		Hospital hp = null;
		String sql = "select * from(select rownum rnum, data.* from(select * from hospital order by hospitalnum desc)data) where rnum >= ? and rnum <= ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, last);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				hp = new Hospital();
				hp.setHospitalnum(rs.getInt("hospitalnum"));
				hp.setArea(rs.getString("area"));
				hp.setName(rs.getString("name"));
				hp.setTel(rs.getString("tel"));
				hp.setAdress(rs.getString("adress"));
				hp.setOpen(rs.getString("open"));
				hp.setMaplat(rs.getDouble("maplat"));
				hp.setMaplng(rs.getDouble("maplng"));
				hp.setContent(rs.getString("content"));
				
				list.add(hp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return list;
	}
	
	public Hospital selectHospitalNum(int hospitalnum){
		Hospital hp = null;
		String sql = "select * from hospital where hospitalnum = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, hospitalnum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				hp = new Hospital();
				hp.setHospitalnum(rs.getInt("hospitalnum"));
				hp.setArea(rs.getString("area"));
				hp.setName(rs.getString("name"));
				hp.setTel(rs.getString("tel"));
				hp.setAdress(rs.getString("adress"));
				hp.setOpen(rs.getString("open"));
				hp.setMaplat(rs.getDouble("maplat"));
				hp.setMaplng(rs.getDouble("maplng"));
				hp.setContent(rs.getString("content"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return hp;
	}
	
	public ArrayList<Hospital> selectHospitalArea(String area){
		ArrayList<Hospital> list = new ArrayList<Hospital>();
		Hospital hp = null;
		String sql = "select * from hospital where area = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, area);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				hp = new Hospital();
				hp.setHospitalnum(rs.getInt("hospitalnum"));
				hp.setArea(rs.getString("area"));
				hp.setName(rs.getString("name"));
				hp.setTel(rs.getString("tel"));
				hp.setAdress(rs.getString("adress"));
				hp.setOpen(rs.getString("open"));
				hp.setMaplat(rs.getDouble("maplat"));
				hp.setMaplng(rs.getDouble("maplng"));
				hp.setContent(rs.getString("content"));
				
				list.add(hp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return list;
	}
	
	public ArrayList<Hospital> selectHospitalName(String name){
		ArrayList<Hospital> list = new ArrayList<Hospital>();
		Hospital hp = null;
		String sql = "select * from hospital where name like ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				hp = new Hospital();
				hp.setHospitalnum(rs.getInt("hospitalnum"));
				hp.setArea(rs.getString("area"));
				hp.setName(rs.getString("name"));
				hp.setTel(rs.getString("tel"));
				hp.setAdress(rs.getString("adress"));
				hp.setOpen(rs.getString("open"));
				hp.setMaplat(rs.getDouble("maplat"));
				hp.setMaplng(rs.getDouble("maplng"));
				hp.setContent(rs.getString("content"));
				
				list.add(hp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return list;
	}
	
	public void insertHospital(int hospitalnum, String area, String name, String tel, String adress, String open, double maplat, double maplng, String content) {
		String sql = "insert into hospital values(?,?,?,?,?,?,?,?,?)";
			
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, hospitalnum);
			pstmt.setString(2, area);
			pstmt.setString(3, name);
			pstmt.setString(4, tel);
			pstmt.setString(5, adress);
			pstmt.setString(6, open);
			pstmt.setDouble(7, maplat);
			pstmt.setDouble(8, maplng);
			pstmt.setString(9, content);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
	}
	
	public int searchHospitalnum() {
		int hospitalnum = 0;
		String sql = "select hospitalnum from hospital";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				hospitalnum = rs.getInt("hospitalnum");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return hospitalnum;
	}
	
	public int serchContent() {
		int content = 0;
		String sql = "select * from(select rownum rnum from(select * from hospital))";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				content = rs.getInt("rnum");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
		
		return content;
	}
	
	public void updateHospital(String area, String name, String tel, String adress, String open, double maplat, double maplng, String content, int hospitalnum) {
		String sql = "update hospital set area = ?, name = ?, tel = ?, adress = ?, open = ?, maplat = ?, maplng = ?, content = ? where hospitalnum = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, area);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, adress);
			pstmt.setString(5, open);
			pstmt.setDouble(6, maplat);
			pstmt.setDouble(7, maplng);
			pstmt.setString(8, content);
			pstmt.setInt(9, hospitalnum);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
	}
	
	public void deleteHospital(int hospitalnum) {
		String sql = "delete from hospital where hospitalnum = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, hospitalnum);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try{rs.close();}catch(SQLException e){}
			}
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e){}
			}
			if(conn!=null) {
				try{conn.close();}catch(SQLException e){}
			}
		}
	}
	
}
