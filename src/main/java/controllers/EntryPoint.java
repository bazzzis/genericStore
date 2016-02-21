package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="helloWorld")
@SessionScoped
public class EntryPoint {
	
	private String helloMessage = "Hello from Pakistam";

	public String getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	

}
