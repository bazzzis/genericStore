package bestRings.co.uk.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import bestRings.co.uk.services.TestService;



@ManagedBean(name="helloWorld")
@SessionScoped
public class EntryPoint {
	
	@ManagedProperty("#{test}")
	private transient TestService testService;
	
	
	private String helloMessage = "Hello from Pakistam";

	public String getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	public String redirect(){
		System.out.println("Entering redirect");
		return "third";
	}
	
	public String showServiceMesage(){
		return testService.showMe();
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

}
