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
@Table(name = "sinhvien")
public class SinhVien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_sv")
	private int maSV;
	
	@ManyToOne
	@JoinColumn(name = "ma_khoa")
	private Khoa khoa;
	
	@Column(name = "ho_ten")
	private String hoTen;
	
	@Column(name = "ngay_sinh")
	private String ngaySinh;
	
	@Column(name = "gioi_tinh")
	private String gioiTinh;
	
	@Column(name = "dia_chi")
	private String diaChi;
	
	@Column(name = "sdt")
	private String sdt;
}
