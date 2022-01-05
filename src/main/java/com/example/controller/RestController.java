@RestController
public class RestAPIsController{
	
	@RequestMapping("/api/helloworld")
	public String findAll(){
		return"Hello World!";
	}
}
