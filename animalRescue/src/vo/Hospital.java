package vo;

public class Hospital {
	private int hospitalnum;
	private String area;
	private String name;
	private String tel;
	private String adress;
	private String open;
	private double maplat;
	private double maplng;
	private String content;
	
	public Hospital() {}

	public Hospital(int hospitalnum, String area, String name, String tel, String adress, String open, double maplat,
			double maplng, String content) {
		super();
		this.hospitalnum = hospitalnum;
		this.area = area;
		this.name = name;
		this.tel = tel;
		this.adress = adress;
		this.open = open;
		this.maplat = maplat;
		this.maplng = maplng;
		this.content = content;
	}

	public int getHospitalnum() {
		return hospitalnum;
	}

	public void setHospitalnum(int hospitalnum) {
		this.hospitalnum = hospitalnum;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getMaplat() {
		return maplat;
	}

	public void setMaplat(double maplat) {
		this.maplat = maplat;
	}

	public double getMaplng() {
		return maplng;
	}

	public void setMaplng(double maplng) {
		this.maplng = maplng;
	}

	
}
