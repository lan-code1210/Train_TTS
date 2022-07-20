package trainproject.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import trainproject.demo.entity.Khoa;

public interface KhoaService {

	<S extends Khoa> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	<S extends Khoa> Page<S> findAll(Example<S> example, Pageable pageable);

	Optional<Khoa> findById(Integer id);

	List<Khoa> findAllById(Iterable<Integer> ids);

	List<Khoa> findAll(Sort sort);

	Page<Khoa> findAll(Pageable pageable);

	List<Khoa> findAll();

	<S extends Khoa> S save(S entity);

}
