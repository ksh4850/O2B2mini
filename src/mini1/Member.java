package mini1;

import java.io.Serializable;

public class Member implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String pwd;
	private String name;
	private String adrr;
	private int age;
	private char gender;
	private String signupDate;
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", adrr=" + adrr + ", age=" + age + ", gender="
				+ gender + ", signupDate=" + signupDate + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdrr() {
		return adrr;
	}

	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(String signupDate) {
		this.signupDate = signupDate;
	}

	public Member(String id, String pwd, String name, String adrr, int age, char gender, String signupDate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.adrr = adrr;
		this.age = age;
		this.gender = gender;
		this.signupDate = signupDate;
	}

}
