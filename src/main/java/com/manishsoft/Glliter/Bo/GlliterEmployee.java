package com.manishsoft.Glliter.Bo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "emp")
public class GlliterEmployee {
	private String f_Name;
	private String l_Name;
	private int sal;

	@Override
	public String toString() {
		return "GlliterEmployee [f_Name=" + f_Name + ", l_Name=" + l_Name + ", sal=" + sal + "]";
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public GlliterEmployee(String f_Name, String l_Name, int sal) {
		super();
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.sal = sal;
	}

	public GlliterEmployee() {
		super();
	}

}
