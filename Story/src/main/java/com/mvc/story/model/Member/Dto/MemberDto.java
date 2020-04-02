package com.mvc.story.model.Member.Dto;

public class MemberDto {

	private int MEMBER_CODE;
	private String MEMBER_NAME;
	private String MEMBER_ID;
	private String MEMBER_PW;
	private String MEMBER_EMAIL;
	private String MEMBER_PHONE;
	private String MEMBER_ADDR;
	
	public MemberDto() {
		
	}

	public MemberDto(int mEMBER_CODE, String mEMBER_NAME, String mEMBER_ID, String mEMBER_PW, String mEMBER_EMAIL,
			String mEMBER_PHONE, String mEMBER_ADDR) {
		super();
		MEMBER_CODE = mEMBER_CODE;
		MEMBER_NAME = mEMBER_NAME;
		MEMBER_ID = mEMBER_ID;
		MEMBER_PW = mEMBER_PW;
		MEMBER_EMAIL = mEMBER_EMAIL;
		MEMBER_PHONE = mEMBER_PHONE;
		MEMBER_ADDR = mEMBER_ADDR;
	}

	public int getMEMBER_CODE() {
		return MEMBER_CODE;
	}

	public void setMEMBER_CODE(int mEMBER_CODE) {
		MEMBER_CODE = mEMBER_CODE;
	}

	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}

	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}

	public String getMEMBER_ID() {
		return MEMBER_ID;
	}

	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}

	public String getMEMBER_PW() {
		return MEMBER_PW;
	}

	public void setMEMBER_PW(String mEMBER_PW) {
		MEMBER_PW = mEMBER_PW;
	}

	public String getMEMBER_EMAIL() {
		return MEMBER_EMAIL;
	}

	public void setMEMBER_EMAIL(String mEMBER_EMAIL) {
		MEMBER_EMAIL = mEMBER_EMAIL;
	}

	public String getMEMBER_PHONE() {
		return MEMBER_PHONE;
	}

	public void setMEMBER_PHONE(String mEMBER_PHONE) {
		MEMBER_PHONE = mEMBER_PHONE;
	}

	public String getMEMBER_ADDR() {
		return MEMBER_ADDR;
	}

	public void setMEMBER_ADDR(String mEMBER_ADDR) {
		MEMBER_ADDR = mEMBER_ADDR;
	}
	
	
	
}
