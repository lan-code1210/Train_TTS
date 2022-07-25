package trainproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trainproject.demo.entity.SinhVien;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {

}
