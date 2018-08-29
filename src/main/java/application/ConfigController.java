package application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    
	@Value("${url}")
	String url;
	@RequestMapping(value = "/url")
	public String url(){
		return url;
	}
	@Value("${username}")
	String username;
	@RequestMapping(value = "/username")
	public String username(){
		return username;
	}
	@Value("${password}")
	String password;
	@RequestMapping(value = "/password")
	public String password(){
		return password;
	}
}
