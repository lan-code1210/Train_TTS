package trainproject.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import trainproject.demo.entity.SinhVien;
import trainproject.demo.model.SinhVienModel;
import trainproject.demo.service.SinhVienService;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {
	
	@Autowired
	private SinhVienService svService;
	
	@GetMapping("/create")
	public String sinhvien(Model model) {
		SinhVienModel sinhVienModel = new SinhVienModel();
		model.addAttribute("sv", sinhVienModel);
		return "create";
	}
	
//	@GetMapping("/updateSV/{svID}")
//	public String update(@PathVariable("svID") Integer sv,
//			Model model) {
//		
//		SinhVienModel sinhVienModel = new SinhVienModel();
//		model.addAttribute("sv", sinhVienModel);
//		return "";
//	}
	
	@PostMapping("/saveSV")
	public String sinhvien2(Model model, 
			@ModelAttribute("sv") SinhVienModel svmModel) {
		SinhVien sv = new SinhVien();
		BeanUtils.copyProperties(svmModel, sv);
		return "redirect:/create";
	}
	
	
}
