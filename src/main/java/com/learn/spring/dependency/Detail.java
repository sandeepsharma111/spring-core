package com.learn.spring.dependency;

public class Detail {
	private String orgAdress;
	private  String domain;


	public void setOrgAdress(String orgAdress){
		this.orgAdress=orgAdress;
	}
	public  void setDomain(String domain){
		this.domain=domain;
	}

	public String getDomain(){
		return this.domain;
	}

	public String getOrgAdress() {
		return orgAdress;
	}

	@Override
	public String toString() {
		return "[Domain="+domain+", OrgAddress="+orgAdress+"]";
	}
}
