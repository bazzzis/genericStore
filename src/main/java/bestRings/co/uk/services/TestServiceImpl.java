package bestRings.co.uk.services;

import org.springframework.stereotype.Service;

@Service("test")
public class TestServiceImpl implements TestService{
	@Override
public String showMe(){
	
	return "Show String from service";
}	

}
