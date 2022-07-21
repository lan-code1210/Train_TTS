package trainproject.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import trainproject.demo.entity.Khoa;
import trainproject.demo.model.KhoaModel;
import trainproject.demo.model.SinhVienModel;
import trainproject.demo.service.KhoaService;

@Controller
@RequestMapping("/khoa")
public class KhoaController{
	@Autowired
	private KhoaService khoaService;
	
	
	@GetMapping("/create")
	public String create(Model model) {
		KhoaModel khoaModel = new KhoaModel();
		model.addAttribute("kh", khoaModel);
		return "create";
	}
	
	@GetMapping("/update/{khoaID}")
	public String update( Model model) {
		KhoaModel khoaModel = new KhoaModel();
		model.addAttribute("kh", khoaModel);
		return "";
	}
	
	@PostMapping("/savekh")
	public String saveSV(@ModelAttribute("kh") KhoaModel khoaModel) {
		Khoa khoa = new Khoa();
		BeanUtils.copyProperties(khoaModel, khoa);
		this.khoaService.save(khoa);
		System.out.println("Successfully");
		return "redirect:/create";
	}
	
	
	
	
}
