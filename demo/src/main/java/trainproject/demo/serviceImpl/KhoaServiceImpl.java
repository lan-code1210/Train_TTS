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
public class KhoaServiceImpl implements KhoaService {

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
	public Khoa getKhoaById(Integer id) {
		Optional<Khoa> optional = this.khoaReppository.findById(id);
		Khoa khoa = null;
		if (optional.isPresent()) {
			khoa = optional.get();
		}else {
			throw new RuntimeException("Không tìm thấy khoa với id: "+id);
		}
		return khoa;
	}

	@Override
	public void deleteKhoaById(Integer id) {
		this.khoaReppository.deleteById(id);
		
	}

	@Override
	public boolean checkNameKhoa(String name) {
		for (int i = 0; i < khoaReppository.findAll().size(); i++) {
			if (khoaReppository.findAll().get(i).getTenKhoa().trim().equals(name.trim())) {
				return true;
			}
		}
		return false;
	}


	
}
