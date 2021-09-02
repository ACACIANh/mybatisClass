package xyz.itwill.dto;

/*
MYHEWON 테이블 : 회원정보를 저장하기 위한 테이블
 => 아이디(HEWON_ID),이름(HEWON_NAME),전화번호(HEWON_PHONE),이메일(HEWON_EMAIL),공개범위(HEWON_STATE)
 => 공개범위 : 1(아이디),2(아이디&이름),3(아이디&이름&전화번호),4(아이디&이름&전화번호&이메일)
create table myhewon(hewon_id varchar2(20) primary key,hewon_name varchar2(30)
    ,hewon_phone varchar2(20),hewon_email varchar2(50),hewon_state number(1));
    
이름          널?       유형           
----------- -------- ------------ 
HEWON_ID    NOT NULL VARCHAR2(20) 
HEWON_NAME           VARCHAR2(30) 
HEWON_PHONE          VARCHAR2(20) 
HEWON_EMAIL          VARCHAR2(50) 
HEWON_STATE          NUMBER(1)        
*/
public class MyHewon {
	private String id;
	private String name="미공개";
	private String phone="미공개";
	private String email="미공개";
	private int state;
	
	public MyHewon() {
		// TODO Auto-generated constructor stub
	}

	public MyHewon(String id, String name, String phone, String email, int state) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}












