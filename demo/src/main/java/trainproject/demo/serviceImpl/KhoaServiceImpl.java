package trainproject.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import trainproject.demo.entity.Khoa;
import trainproject.demo.model.KhoaModel;
import trainproject.demo.repository.KhoaReppository;
import trainproject.demo.service.KhoaService;

@Service
public class KhoaServiceImpl implements KhoaService{

	@Autowired
	private KhoaReppository khoaReppository;

	public KhoaServiceImpl(KhoaReppository khoaReppository) {
		super();
		this.khoaReppository = khoaReppository;
	}

	@Override
	public <S extends Khoa> S save(S entity) {
		return khoaReppository.save(entity);
	}

	@Override
	public List<Khoa> findAll() {
		return khoaReppository.findAll();
	}

	@Override
	public Page<Khoa> findAll(Pageable pageable) {
		return khoaReppository.findAll(pageable);
	}

	@Override
	public List<Khoa> findAll(Sort sort) {
		return khoaReppository.findAll(sort);
	}

	@Override
	public List<Khoa> findAllById(Iterable<Integer> ids) {
		return khoaReppository.findAllById(ids);
	}



	public Optional<Khoa> findById(Integer id) {
		return khoaReppository.findById(id);
	}

	@Override
	public <S extends Khoa> Page<S> findAll(Example<S> example, Pageable pageable) {
		return khoaReppository.findAll(example, pageable);
	}

	@Override
	public void deleteById(Integer id) {
		khoaReppository.deleteById(id);
	}

	@Override
	public <S extends Khoa> List<S> findAll(Example<S> example, Sort sort) {
		return khoaReppository.findAll(example, sort);
	}

	
}
