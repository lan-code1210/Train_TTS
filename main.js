const QL = document.querySelector(".qlsv");
const children_QL = document.querySelector(".children");
const sinhVien = document.querySelector(".sv");
const khoa = document.querySelector(".khoa");
const baoCao = document.querySelector(".baocao");
const DmSv = document.querySelector(".sinhvien");
const tableKhoa = document.querySelector(".table-khoa");
const tableInsert = document.querySelector(".table-insert");

const addStudent = document.querySelector(".btn-add");
const fromInsert = document.querySelector(".insert");
const addStudentBtn = document.getElementById("add-student-btn");
//title form them sua
const title = document.querySelector(".title-sv");

// nut sửa sinh vien
const editStudent = document.getElementById("edit-btn");
const editStudentBtn = document.getElementById("edit-student-btn");
console.log(editStudent);

// edit khoa

const editBtnKhoa = document.querySelector(".edit-khoa-btn");
const addSubmitKhoa = document.querySelector(".add-submit-khoa");
const editKhoa = document.querySelector(".edit-khoa");
const titleKhoa = document.querySelector(".title-edit-khoa");
//nút hủy thao tác
const resetKhoa = document.querySelector(".btn-edit-khoa");
resetKhoa.addEventListener("click", () => {
  tableDepartment.style = "display:none";
});
editKhoa.addEventListener("click", () => {
  tableDepartment.style = "display:block";
  titleKhoa.innerHTML = "Sửa Khoa";
  addSubmitKhoa.style = "display:none";
  editBtnKhoa.style = "display:block";
});

editStudent.addEventListener("click", () => {
  title.innerHTML = "Sửa Thông Tin Sinh Viên";
  fromInsert.style = "display:block;";
  tableInsert.style = "display:block;";
  tableKhoa.style = "display:none;";
  addStudentBtn.style = "display:none;";
  tableDepartment.style = "display:none";
  // canCel.style = "display:none";
  editStudentBtn.style = "display:block";
});
// khai báo cho các input để thêm vào data
const studentIdInput = document.getElementById("student-id-input");
const studentNameInput = document.getElementById("student-name-input");
const studentBirthdayInput = document.getElementById("student-birthday-input");
const studentSexInput = document.getElementById("student-sex-input");
const studentDepartmentInput = document.getElementById(
  "student-department-input"
);
const studentAddressInput = document.getElementById("student-address-input");
const studentPhoneInput = document.getElementById("student-phone-input");
const tabSearch = document.querySelector(".search");

QL.addEventListener("click", () => {
  children_QL.classList.toggle("show");
});

sinhVien.addEventListener("click", () => {
  // call api lay danh sach sinh vien
  // getStudentList();
  tabSearch.style = "display :block";
  children_QL.classList.toggle("show");
  DmSv.style = "display:block;";
  tableKhoa.style = "display:none;";
  tableDepartment.style = "display:none";
});

khoa.addEventListener("click", () => {
  // getKhoaList();
  children_QL.classList.toggle("show");
  DmSv.style = "display:none;";
  tableKhoa.style = "display:block;";
  fromInsert.style = "display:none";
  tabSearch.style = "display :none";
});

baoCao.addEventListener("click", () => {
  children_QL.classList.toggle("show");
  DmSv.style = "display:none;";
  fromInsert.style = "display:none";
  tableDepartment.style = "display:none";
  tabSearch.style = "display :none";
});

addStudent.addEventListener("click", () => {
  fromInsert.style = "display:block;";
  tableInsert.style = "display:block;";
  tableKhoa.style = "display:none;";
  editStudentBtn.style = "display:none;";
  tableDepartment.style = "display:none";
  title.innerHTML = "Thêm Sinh Viên";
  addStudentBtn.style = "display:block;";
  canCel.style = "display:block";
});

const canCel = document.getElementById("add-cancel-btn");
canCel.addEventListener("click", () => {
  fromInsert.style = "display:none;";
});

// const tableBody = document.getElementById("show-data");

// CODE
// const renderListKhoa = (khoaList) => {
//   khoaList.forEach(function (item) {
//     dataKhoa.innerHTML += `<tr>
//           <td> <a href="#">${item.maKhoa}</a></td>
//           <td><a href="#">${item.tenKhoa}</a></td></tr>
//           `;
//   });
// };

// const renderListStudent = (studentList) => {
//   studentList.forEach(function (item) {
//     tableBody.innerHTML += `<tr>
//           <td> ${item.maSV}</td>
//           <td>${item.hoTen}</td>
//           <td>${item.ngaySinh}</td>
//           <td>${item.gioiTinh}</td>
//           <td> ${item.Khoa}</td>
//           <td> ${item.diaChi} </td>
//           <td> ${item.sdt}</td>
//           <td><button class='btn-edit'>Sửa</button></td>
//           <td><button class="btn-delete" data-sv=${item.maSV}>xóa</button></td>
//          </tr>`;
//   });
// };

// tao const cho cac error
const errorName = document.querySelector(".error-name");
const errorBirthday = document.querySelector(".error-brithday");
const errorSex = document.querySelector(".error-sex");
const errorDepartment = document.querySelector(".error-department");
const errorAddress = document.querySelector(".error-address");
//     diaChi: studentAddressInput.value,

// check xem input co du lieu hay chua
// const checkValue = () => {
//   //tao data chứa thông tin trong input
//   let data = new Array();
//   data[0] = studentNameInput.value;
//   data[1] = studentBirthdayInput.value;
//   data[2] = studentSexInput.value;
//   data[3] = studentDepartmentInput.value;
//   data[4] = studentAddressInput.value;

//   //tạo mảng error
//   let myerror = new Array();
//   myerror[0] = "Bạn chưa nhập tên";
//   myerror[1] = "Bạn chưa nhập ngày sinh";
//   myerror[2] = "Bạn chưa nhập giới tính";
//   myerror[3] = "bạn chưa nhập khoa";
//   myerror[4] = "bạn chưa nhập địa chỉ";

//   let nearby = new Array(
//     "z-name",
//     "z-birthday",
//     "z-sex",
//     "z-department",
//     "z-address"
//   );
//   for (i in data) {
//     const error = myerror[i];
//     const tr = nearby[i];
//     if (data[i] == "") {
//       document.getElementById(tr).innerHTML = error;
//       document.getElementById(tr).style = "color:red;";
//     } else {
//       document.getElementById(tr).innerHTML = "OK";
//       document.getElementById(tr).style = "color:green;";
//     }
//   }

//   // sự kiện cho nút cancel
//   const canCel = document.getElementById("add-cancel-btn");
//   canCel.addEventListener("click", () => {
//     //ẩn form thêm sinh viên
//     fromInsert.style = "display:none;";
//     fromInsert.reset();
//     //chạy vòng for các error. nếu value input rỗng thì error rỗng
//     for (i in data) {
//       const error = myerror[i];
//       const tr = nearby[i];
//       if (data[i] == "") {
//         document.getElementById(tr).innerHTML = ``;
//       }
//     }
//   });
// if (studentNameInput.value == "") {
//   errorName.innerHTML = "nhap ho va ten sinh vien";
// }
// if (studentBirthdayInput.value == "") {
//   errorBirthday.innerHTML = "nhap thong tin ngay sinh";
// }
// if (studentSexInput.value == "") {
//   errorSex.innerHTML = "nhap gioi tinh";
// }
// if (studentDepartmentInput.value == "") {
//   errorDepartment.innerHTML = "nhap khoa";
// } else {
//   alert("thanh cong");
// }
// };
// const getKhoaList = async () => {
//   let khoaList = [];
//   //  get khoa list tu api
//   await axios
//     .get("https://621665d07428a1d2a366a311.mockapi.io/Khoa")
//     .then(function (response) {
//       const data = response.data; //
//       if (data) {
//         khoaList = data;
//       }
//     });
//   // reset api
//   dataKhoa.innerHTML = ``;
//   // goi ham render khoa
//   renderListKhoa(khoaList);
// };

// const getStudentList = async () => {
//   let studentList = [];
//   // Get student list tu api
//   await axios
//     .get("https://621665d07428a1d2a366a311.mockapi.io/SinhVien")
//     .then(function (response) {
//       const data = response.data; //
//       if (data) {
//         studentList = data;
//       }
//     });
//   // gọi hàm reset ui
//   tableBody.innerHTML = ``;
//   // sau khi call api va co dc studentList, goi hàm render ui
//   renderListStudent(studentList);

//   // delete sinh vien
//   const deleteStudentBtn = document.querySelectorAll(".btn-delete");

//   deleteStudentBtn.forEach((btn) => {
//     const maSV = btn.getAttribute("data-sv");
//     btn.addEventListener("click", async () => {
//       console.log("click", maSV);
//       // call api delete (maSV)
//       await axios
//         .delete(`https://621665d07428a1d2a366a311.mockapi.io/SinhVien/${maSV}`)
//         .then(async () => {
//           console.log("xoa thanh cong");
//           // reset lại list
//           await axios
//             .get("https://621665d07428a1d2a366a311.mockapi.io/SinhVien")
//             .then(function (response) {
//               const data = response.data; //
//               if (data) {
//                 studentList = data;
//               }
//             });
//           // gọi hàm reset ui
//           tableBody.innerHTML = ``;
//           // sau khi call api va co dc studentList, goi hàm render ui
//           renderListStudent(studentList);
//         });
//     });
//   });
//   console.log("studentList", studentList);
// };

// const dataKhoa = document.getElementById("data-khoa");
// axios
//   .get("https://621665d07428a1d2a366a311.mockapi.io/Khoa")
//   .then(function (response) {
//     const data = response.data;
//     if (data) {
//       khoaList = data;
//     }
//   });
// // gọi hàm reset ui
// tableBody.innerHTML = ``;
// // renderListKhoa(khoaList);

// click addStudentBtn call api Post student
addStudentBtn.addEventListener("click", () => {
  checkValue();
  //   // Lấy thông tin trong các ô input
  //   const data = {
  //     hoTen: studentNameInput.value,
  //     ngaySinh: studentBirthdayInput.value,
  //     gioiTinh: studentSexInput.value,
  //     khoaId: studentDepartmentInput.value,
  //     diaChi: studentAddressInput.value,
  //     sdt: studentPhoneInput.value,
  //   };

  //   // call api gui data len
  //   axios
  //     .post("https://621665d07428a1d2a366a311.mockapi.io/SinhVien", data)
  //     .then(function (response) {
  //       alert("tao thanh cong!");
  //       console.log(response, "tao thanh cong!");
  //     })
  //     .catch(function (error) {
  //       alert(error);
  //     });
});

const addDepartmentBtn = document.querySelector(".add-khoa-btn");
const tableDepartment = document.querySelector(".add-khoa");
addDepartmentBtn.addEventListener("click", () => {
  tableDepartment.style = "display:block";
  titleKhoa.innerHTML = "Thêm Khoa";
  addSubmitKhoa.style = "display:block";
  editBtnKhoa.style = "display:none";
});
// // thêm khoa

// kiem tra from
