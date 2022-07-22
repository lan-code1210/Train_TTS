package trainproject.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import trainproject.demo.entity.Khoa;
import trainproject.demo.entity.SinhVien;
import trainproject.demo.repository.SinhVienRepository;

public interface SinhVienService {

	List<SinhVien> findAll();

	<S extends SinhVien> S save(S entity);

	public SinhVien getSVById(Integer id);

	public void deleteSVById(Integer id);

	public boolean checkSDTSV(String name);

}
