package bestRings.co.uk.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bestRings.co.uk.services.TestService;

@ManagedBean(name="mainPageController")
@ViewScoped
public class MainPageController {
	//Don't forget getters and setters
	@ManagedProperty("#{test}")
	private transient TestService testService;
	
	
	public void init(){
		
		
	}


	public TestService getTestService() {
		return testService;
	}


	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public String getShowMe(){
		return testService.showMe();
	}
	
	

}
