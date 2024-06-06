create Database SinhVienDB;
use SinhVienDB;
create table SinhVien (
	maSinhVien nvarchar(10) primary key,
    hoTen nvarchar(50),
    ngaySinh Date,
    gioiTinhNam bit
);
insert into SinhVien 
	values("21T1020285", "Trần Văn Đạt", "2002-03-05", true),
    ("21T1020286", "Trần Văn Nợn", "2002-03-16", true),
    ("21T1020228", "Hoàng Anh", "2003-12-21", false);
select * from SinhVien