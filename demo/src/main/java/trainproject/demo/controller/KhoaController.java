package trainproject.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import trainproject.demo.entity.Khoa;
import trainproject.demo.model.KhoaModel;
import trainproject.demo.model.SinhVienModel;
import trainproject.demo.repository.KhoaReppository;
import trainproject.demo.service.KhoaService;

@Controller
//@RequestMapping("/khoa")
public class KhoaController{
	@Autowired
	private KhoaService khoaService;
	
	
	@GetMapping("create")
	public String create(Model model, 
			@ModelAttribute("khoa") KhoaModel khoaModel) {
		List<Khoa> khoaModel2 = this.khoaService.findAll();
		model.addAttribute("listkh", khoaModel2);
		return "test";
	}
	
	@GetMapping("/edit/{khoaId}")
	public String update(@PathVariable("khoaId") Integer id,
			Model model) {
		Khoa khoa = khoaService.getKhoaById(id);
		model.addAttribute("khoa", khoa);
		List<Khoa> khoaModel2 = this.khoaService.findAll();
		model.addAttribute("listkh", khoaModel2);
		return "test";
	}
	
	@GetMapping("list")
	public String list( Model model) {
		List<Khoa> khoaModel = this.khoaService.findAll();
		model.addAttribute("listkh", khoaModel);
		return "test";
	}
	
	@GetMapping("/delete/{khoaId}")
	public String delete(@PathVariable("khoaId") Integer id,
			Model model) {
		this.khoaService.deleteKhoaById(id);
		return "redirect:/create";
	}
	
	@GetMapping("search")
	public String search(Model model) {
		
		return "";
	}
	@PostMapping("/savekhoa")
	public String savekhoa(
			@ModelAttribute("khoa") KhoaModel khoaModel, 
			HttpSession session) {
		Khoa khoa = new Khoa();
		String name = khoaModel.getTenKhoa();
		if (khoaService.checkNameKhoa(name)) {
			session.setAttribute("error", "Tên khoa tồn tại");
			System.out.println("Tên khoa tồn tại");
			return "test";
		}
		BeanUtils.copyProperties(khoaModel, khoa);
		this.khoaService.save(khoa);
		System.out.println("Successfully");
		return "redirect:/create";
	}
	
	
	
}
