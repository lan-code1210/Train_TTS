package trainproject.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinhVienController {
	@GetMapping("giangvien")
	public String sinhvien() {
		return "";
	}
	@PostMapping("sinhvien")
	public String sinhvien2() {
		return "";
	}
	
}
