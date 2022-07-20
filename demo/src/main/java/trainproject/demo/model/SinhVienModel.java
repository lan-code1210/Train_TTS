package trainproject.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienModel {
	private int maSV;
	private int maKhoa;
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;
	private String sdt;
	
}
