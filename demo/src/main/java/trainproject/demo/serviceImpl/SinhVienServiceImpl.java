package trainproject.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import trainproject.demo.entity.Khoa;
import trainproject.demo.entity.SinhVien;
import trainproject.demo.repository.SinhVienRepository;
import trainproject.demo.service.SinhVienService;

@Service
public class SinhVienServiceImpl implements SinhVienService {
	@Autowired
	private SinhVienRepository svRepository;
	
	
	public SinhVienServiceImpl(SinhVienRepository svRepository) {
		super();
		this.svRepository = svRepository;
	}

	@Override
	public <S extends SinhVien> S save(S entity) {
		return svRepository.save(entity);
	}

	@Override
	public List<SinhVien> findAll() {
		return svRepository.findAll();
	}

	@Override
	public SinhVien getSVById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSVById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkSDTSV(String name) {
		// TODO Auto-generated method stub
		return false;
	}


}
