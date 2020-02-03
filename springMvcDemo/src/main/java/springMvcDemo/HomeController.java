package springMvcDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	@RequestMapping(method = RequestMethod.GET,path = "/")
	public String home()
	{
		return "main-menu";
	}

}
