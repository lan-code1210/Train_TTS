package trainproject.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import trainproject.demo.entity.SinhVien;
import trainproject.demo.repository.SinhVienRepository;
import trainproject.demo.service.SinhVienService;

@Service
public class SinhVienServiceImpl implements SinhVienService {
	@Autowired
	private SinhVienRepository svRepository;
	@Override
	public <S extends SinhVien> S save(S entity) {
		return svRepository.save(entity);
	}

	@Override
	public List<SinhVien> findAll() {
		return svRepository.findAll();
	}

	@Override
	public List<SinhVien> findAllById(Iterable<Integer> ids) {
		return svRepository.findAllById(ids);
	}

	@Override
	public Optional<SinhVien> findById(Integer id) {
		return svRepository.findById(id);
	}

	@Override
	public <S extends SinhVien> Page<S> findAll(Example<S> example, Pageable pageable) {
		return svRepository.findAll(example, pageable);
	}

	@Override
	public void deleteById(Integer id) {
		svRepository.deleteById(id);
	}

	@Override
	public void delete(SinhVien entity) {
		svRepository.delete(entity);
	}

	@Override
	public <S extends SinhVien> List<S> findAll(Example<S> example, Sort sort) {
		return svRepository.findAll(example, sort);
	}
	
	
}
