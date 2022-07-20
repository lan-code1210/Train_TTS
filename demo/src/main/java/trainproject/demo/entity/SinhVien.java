package trainproject.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data
@Entity
@Table(name = "sinhVien")
public class SinhVien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maSV")
	private int maSV;
	
	@ManyToOne
	@JoinColumn(name = "maKhoa")
	private int maKhoa;
	
	@Column(name = "hoTen")
	private String hoTen;
	
	@Column(name = "ngaySinh")
	private String ngaySinh;
	
	@Column(name = "gioiTinh")
	private String gioiTinh;
	
	@Column(name = "diaChi")
	private String diaChi;
	
	@Column(name = "sdt")
	private String sdt;
}
