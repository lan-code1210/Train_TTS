package trainproject.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import trainproject.demo.entity.Khoa;

public interface KhoaService {

	List<Khoa> findAll();

	<S extends Khoa> S save(S entity);
	
	public Khoa getKhoaById(Integer id);
	
	public void deleteKhoaById(Integer id);
	
	public boolean checkNameKhoa(String name);

}
