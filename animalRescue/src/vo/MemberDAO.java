package vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

public class MemberDAO {
	String myDriver="oracle.jdbc.driver.OracleDriver";
	String myURL="jdbc:oracle:thin:@localhost:1521:orcl";
	String myID="jsp_31";
	String myPass="1234";
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public void insertMember(Member dto) {
		String sql="insert into member values(?,?,?,?,?,?,?)";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getIdnumber());
			pstmt.setString(3, dto.getPass());
			pstmt.setString(4, dto.getName());
			pstmt.setString(5, dto.getPhone());
			pstmt.setInt(6, dto.getAge());
			pstmt.setInt(7, dto.getAdmin());
			pstmt.executeUpdate();	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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

	public Member memberLoginCheck(String id, String pass) {
		String sql="select * from member where id=? and pass=?";
		Member dto=null;
	
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Member(rs.getString("id"),rs.getString("idnumber"), rs.getString("pass"),rs.getString("name"),rs.getString("phone"),rs.getInt("age"),rs.getInt("admin"));
			}
		} catch(Exception e) {
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
		return dto;	
	}
	
	public ArrayList<Member> selectAllMember(int start, int last){
		ArrayList<Member> list=new ArrayList<Member>();
		String sql="select * from(select rownum rnum, data.* from(select * from member where admin = 0)data) where rnum >= ? and rnum <= ?";
		Member dto=null;
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, last);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto=new Member(rs.getString("id"),rs.getString("pass"),rs.getString("name"),rs.getString("phone"),rs.getInt("age"));
				list.add(dto);
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
	
	public int checkId(String id) {
		String sql="select id from member where id=?";
		int res = 0;
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				res = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
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
		return res;
	}
	
	public int serchContent() {
		int content = 0;
		String sql = "select * from(select rownum rnum from(select * from member where admin = 0))";
		
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
	
	public void updateMember(Member dto) {
		int res=0;
		String sql="update member set name=?, pass=?, phone=?, age=? where id = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getPhone());
			pstmt.setInt(4, dto.getAge());
			pstmt.setString(5, dto.getId());
			pstmt.executeUpdate();
			res=pstmt.executeUpdate();
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

	public int removeMember(String id) {
		int res=0;
		String sql="delete from member where id = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			res=pstmt.executeUpdate();
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
		return res;
	}
	
	public Member memberSearchId(String idnumber) {
		String sql="select * from member where idnumber = ?";
		Member dto=null;
	
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, idnumber);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Member(rs.getString("id"),rs.getString("idnumber"), rs.getString("pass"),rs.getString("name"),rs.getString("phone"),rs.getInt("age"),rs.getInt("admin"));
			}
		} catch(Exception e) {
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
		return dto;	
	} 
	
	public Member memberSearchPass(String id) {
		String sql="select * from member where id = ?";
		Member dto=null;
	
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Member(rs.getString("id"),rs.getString("idnumber"), rs.getString("pass"),rs.getString("name"),rs.getString("phone"),rs.getInt("age"),rs.getInt("admin"));
			}
		} catch(Exception e) {
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
		return dto;	
	} 
	
	public void deleteUser(String id) {
		String sql="delete from member where id = ?";
		
		try {
			conn = DriverManager.getConnection(myURL, myID, myPass);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
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
