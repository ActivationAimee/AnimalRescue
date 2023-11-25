package vo;

public class Member {
	private String id;
	private String idnumber;
	private String pass;
	private String name;
	private String phone;
	private int age;
	private int admin;
	
	public Member() {}
	
	public Member(String id, String idnumber, String pass, String name, String phone, int age, int admin) {
		super();
		this.id = id;
		this.idnumber = idnumber;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.admin = admin;
		
	}
	
	public Member(String id, String pass, String name, String phone, int age) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.age = age;
		
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	

	public String getIdnumber() {
		return idnumber;
	}
	

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	

}
