package trainproject.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import trainproject.demo.entity.SinhVien;
import trainproject.demo.repository.SinhVienRepository;

public interface SinhVienService {

	<S extends SinhVien> List<S> findAll(Example<S> example, Sort sort);

	void delete(SinhVien entity);

	void deleteById(Integer id);

	<S extends SinhVien> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<SinhVien> findById(Integer id);

	List<SinhVien> findAllById(Iterable<Integer> ids);

	List<SinhVien> findAll();

	<S extends SinhVien> S save(S entity);


}
