package vo;

public class Support {
	private int snum;
	private String id;
	private String name;
	private String image;
	private String phone;
	private String account;
	private int money;
	private String subject;
	private String content;
	private String date;
	
	public Support() {}
	
	public Support(int snum, String id, String name, String image, String phone, String account, int money,
			String subject, String content, String date) {
		super();
		this.snum = snum;
		this.id = id;
		this.name = name;
		this.image = image;
		this.phone = phone;
		this.account = account;
		this.money = money;
		this.subject = subject;
		this.content = content;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Support [snum=" + snum + ", id=" + id + ", name=" + name + ", image=" + image + ", phone=" + phone
				+ ", account=" + account + ", money=" + money + ", subject=" + subject + ", content=" + content
				+ ", date=" + date + "]";
	}
	
	
}
