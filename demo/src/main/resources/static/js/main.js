const QL = document.querySelector(".qlsv");
const children_QL = document.querySelector(".children");
const sinhVien = document.querySelector(".sv");
const khoa = document.querySelector(".khoa");
const baoCao = document.querySelector(".baocao");
const DmSv = document.querySelector(".sinhvien");
const tableKhoa = document.querySelector(".table-khoa");

QL.addEventListener("click", () => {
  children_QL.classList.toggle("show");
});

sinhVien.addEventListener("click", () => {
  children_QL.classList.toggle("show");
  DmSv.style = "display:block;";
  tableKhoa.style = "display:none;";
});

khoa.addEventListener("click", () => {
  children_QL.classList.toggle("show");
  DmSv.style = "display:none;";
  tableKhoa.style = "display:block;";
});

baoCao.addEventListener("click", () => {
  children_QL.classList.toggle("show");
  DmSv.style = "display:none;";
});

// call api

const trTag = document.getElementById("show-data");

axios
  .get("https://621665d07428a1d2a366a311.mockapi.io/SinhVien")
  .then(function (response) {
    const data = response.data;
    if (data) {
      data.forEach(function (item) {
        trTag.innerHTML += `<tr>
            <td> ${item.maSV}</td>
            <td>${item.hoTen}</td>
            <td>${item.ngaySinh}</td>
            <td>${item.gioiTinh}</td>
            <td> ${item.Khoa}</td>
            <td> ${item.diaChi} </td>
            <td> ${item.sdt}</td>
           </tr>`;
      });
    }
  });

const dataKhoa = document.getElementById("data-khoa");
axios
  .get("https://621665d07428a1d2a366a311.mockapi.io/Khoa")
  .then(function (response) {
    const data = response.data;
    if (data) {
      data.forEach(function (item) {
        dataKhoa.innerHTML += `<tr>
            <td> <a href="#">${item.maKhoa}</a></td>
            <td><a href="#">${item.tenKhoa}</a></td></tr>
            `;
      });
    }
  });
