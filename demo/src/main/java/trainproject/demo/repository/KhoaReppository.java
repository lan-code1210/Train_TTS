package trainproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trainproject.demo.entity.Khoa;

@Repository
public interface KhoaReppository extends JpaRepository<Khoa, Integer>{

}
