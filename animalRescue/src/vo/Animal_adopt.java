package vo;

import java.sql.Date;

public class Animal_adopt {
	/** 입양신청 */
	private int ani_no; // 글번호
	private int ani_w; // 원하는 동물의 글번호 animal_w에서의 ani_no 값
	private String ani_subject; // 글제목
	private String ani_content; // 글내용
	private String ani_name; // 신청자 이름
	private String ani_tel; // 신청자 연락처
	private String ani_date; // 입양 희망일
	private String ani_dday; // 신청 날짜
	private String ani_pass; // 글 비밀번호

	public Animal_adopt() {
	}

	public Animal_adopt(int ani_no, int ani_w, String ani_subject, String ani_content, String ani_name, String ani_tel,
			String ani_date, String ani_dday, String ani_pass) {
		super();
		this.ani_no = ani_no;
		this.ani_w = ani_w;
		this.ani_subject = ani_subject;
		this.ani_content = ani_content;
		this.ani_name = ani_name;
		this.ani_tel = ani_tel;
		this.ani_date = ani_date;
		this.ani_dday = ani_dday;
		this.ani_pass = ani_pass;
	}

	public int getAni_w() {
		return ani_w;
	}

	public void setAni_w(int ani_w) {
		this.ani_w = ani_w;
	}

	public int getAni_no() {
		return ani_no;
	}

	public void setAni_no(int ani_no) {
		this.ani_no = ani_no;
	}

	public String getAni_subject() {
		return ani_subject;
	}

	public void setAni_subject(String ani_subject) {
		this.ani_subject = ani_subject;
	}

	public String getAni_content() {
		return ani_content;
	}

	public void setAni_content(String ani_content) {
		this.ani_content = ani_content;
	}

	public String getAni_name() {
		return ani_name;
	}

	public void setAni_name(String ani_name) {
		this.ani_name = ani_name;
	}

	public String getAni_tel() {
		return ani_tel;
	}

	public void setAni_tel(String ani_tel) {
		this.ani_tel = ani_tel;
	}

	public String getAni_date() {
		return ani_date;
	}

	public void setAni_date(String ani_date) {
		this.ani_date = ani_date;
	}

	public String getAni_dday() {
		return ani_dday;
	}

	public void setAni_dday(String ani_dday) {
		this.ani_dday = ani_dday;
	}

	public String getAni_pass() {
		return ani_pass;
	}

	public void setAni_pass(String ani_pass) {
		this.ani_pass = ani_pass;
	}

}
