package trainproject.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import trainproject.demo.entity.Khoa;
import trainproject.demo.entity.SinhVien;
import trainproject.demo.model.SinhVienModel;
import trainproject.demo.service.KhoaService;
import trainproject.demo.service.SinhVienService;

@Controller
//@RequestMapping("/sinhvien")
public class SinhVienController {
	
	@Autowired
	private SinhVienService svService;
	
	@Autowired
	private KhoaService khoaService;
	
	@GetMapping("createsv")
	public String sinhvien(Model model, 
			@ModelAttribute("sv") SinhVienModel sinhVienModel) {
		List<SinhVien> listsv = this.svService.findAll();
		model.addAttribute("listsv", listsv);
		List<Khoa> listkh= this.khoaService.findAll();
		model.addAttribute("listkh", listkh);
		
		return "create";
	}
	
	@GetMapping("/editSV/{svID}")
	public String update(@PathVariable("svID") Integer sv,
			Model model) {
		
		SinhVien sinhVien = this.svService.getSVById(sv);
		model.addAttribute("sv", sinhVien);
		return "";
	}
	
	@GetMapping("listsv")
	public String list(Model model) {
		List<SinhVien> listsv = this.svService.findAll();
		model.addAttribute("listsv", listsv);
		List<Khoa>  listkh= this.khoaService.findAll();
		model.addAttribute("listkh", listkh);
		
		return "";
	}
	
	@PostMapping("savesv")
	public String sinhvien2(Model model, 
			@ModelAttribute("sv") SinhVienModel svmModel) {
		SinhVien sv = new SinhVien();
		BeanUtils.copyProperties(svmModel, sv);
		this.svService.save(sv);
		return "redirect:/create";
	}
	
	
}
