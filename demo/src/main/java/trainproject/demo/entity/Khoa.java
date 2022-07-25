package trainproject.demo.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "khoa")
public class Khoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_khoa")
	private int maKhoa;
	
	@Column(name = "ten_khoa")
	private String tenKhoa;
	
	@OneToMany(mappedBy = "khoa", cascade = CascadeType.ALL)
	private Collection<SinhVien>  sinhViens;
	
	
}
