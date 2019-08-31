@RestController
class HelloWorl {

	@RequestMapping("/")
	String home() {
		"Hello World!"
	}

}