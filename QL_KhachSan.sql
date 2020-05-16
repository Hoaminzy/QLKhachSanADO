create database QLKhachSan
use QLKhachSan

create table tbl_DichVu
(
  PK_iMaDV varchar(10) primary key not null,
  sTenLoaiDV nvarchar(50)not null,
)
create  table tbl_CTDichVu(
  PK_iMaCTDV varchar(10) primary key not null,
 sTenDV nvarchar(50) not null,
 fDonGia float null,
  PK_iMaDV varchar(10) foreign key(PK_iMaDV) references tbl_DichVu(PK_iMaDV)
)

insert into tbl_DichVu values
(
'DV1','Massage', 300000
)

create table tbl_KhachHang(
   PK_iMaKH varchar(10) primary key not null ,
   sTenKH nvarchar(50) not null,
    sCMND varchar(13) unique not null,
	sSDT varchar(13) unique null,
	sQuocTich nvarchar(50) null,
	bGioiTinh bit null ,
	dNgaySinh date null,
	
)create table tbl_BoPhan(
   PK_iMaBP varchar(10) primary key not null,
   sTenBP nvarchar(50) not null
)
insert into tbl_BoPhan values
('BP01','Thu Ngan'),
('BP02','Quan Ly')
 create table tbl_NhanVien(
    PK_iMaNV varchar(10) primary key ,
	sTenNV nvarchar(50) not null,
	sChucVu nvarchar(50) null,
	sSDT varchar(13),
	fLuong float null,
	dNgaySinh date null,
	bGioiTinh bit null,
	sDiaChi  nvarchar(50) null,
	sTinhTrang nvarchar(50) not null,
	PK_iMaBP varchar(10) constraint FK_NV_BP foreign key(PK_iMaBP) references tbl_BoPhan(PK_iMaBP)


  )
   insert into tbl_NhanVien values
  ('NV01','Tran Trong Hieu', 'Nhan Vien','0973546253','2300000','12/04/1992',1,'tx Quang Yen, Quang Ninh', 'Hoat dong', 'BP01'),
  ('NV02','Le Ngan Anh', 'Pho Phong Maketing','098354635','8900000','05/03/1990',1,'Quan Trung, Nguyen Hue', 'Hoat dong', 'BP02')


  create table tbl_LoaiPhong(
    PK_iMaLoaiPhong varchar(10) primary key not null,
	sTenLoaiPhong nvarchar(50) not null,
  )
  insert into tbl_LoaiPhong values
  ('LP01', 'VIP1'),
  ('LP02', 'VIP2'),
  ('LP03', 'VIP3'),
  ('LP04', 'VIP4')

  create table tbl_Phong(
     PK_iMaPhong varchar(10) primary key  not null,
	 sTenPhong nvarchar(50) not null,
	 fGiaPhong float null,
	sMota ntext null, 
	sHinhanh nvarchar(max) null,
	 PK_iMaLoaiPhong varchar(10) constraint FK_P_LP foreign key (PK_iMaLoaiPhong) references tbl_LoaiPhong(PK_iMaLoaiPhong),
	 PK_iMaNV varchar(10) constraint PK_PNV foreign key (PK_iMaNV)  references tbl_NhanVien(PK_iMaNV)
  )
  insert into tbl_Phong values

  ('P01','Phong 502', 520000, 'Rong 24m3','anh1','LP01','NV01'),
  ('P02','Phong 503', 600000, 'Rong 64m3','anh2','LP03','NV02'),
  ('P03','Phong 506', 120000, 'Rong 14m3','anh3','LP02','NV01'),
      ('P04','Phong 507', 520000, 'Rong 24m3','snow.jpg','LP05','NV01'),
  ('P05','Phong 508', 600000, 'Rong 64m3','snow.jpg','LP05','NV02'),
  ('P06','Phong 509', 120000, 'Rong 14m3','snow.jpg','LP05','NV01')

  select * from tbl_Phong
  
  select * from tbl_LoaiPhong
  select tbl_Phong.*, tbl_NhanVien.sTenNV,tbl_LoaiPhong.PK_iMaLoaiPhong from tbl_Phong , tbl_NhanVien, tbl_LoaiPhong  where  tbl_Phong.PK_iMaNV = tbl_NhanVien.PK_iMaNV and tbl_Phong.PK_iMaLoaiPhong = tbl_LoaiPhong.PK_iMaLoaiPhong

  create table tbl_CTHoaDon(
   PK_iMaCTHD varchar(10) primary key not null,
   dNgayBook date null ,
   dNgayLap date not null,
   dNgayDen date  null,
   dNgayDi date null,
   fTongTien float null,
   sTinhTrang nvarchar(50) null,
   PK_iMaKH varchar(10) constraint FK_HD_KH foreign key(PK_iMaKH) references tbl_khachHang(PK_iMaKH),
   PK_iMaNV varchar(10) constraint PK_HD_NV foreign key (PK_iMaNV) references tbl_NhanVien(PK_iMaNV),
   PK_iMaPhong   varchar(10) constraint PK_HD_P foreign key (PK_iMaPhong) references tbl_Phong(PK_iMaPhong)
  )
create table tbl_HoaDon(
  PK_iMaCTHD varchar(10) constraint FK_HD_CTHD foreign key(PK_iMaCTHD) references tbl_CTHoaDon(PK_iMaCTHD),
  PK_iMaCTDV varchar(10) constraint FK_HD_DV foreign key (PK_iMaCTDV) references tbl_CTDichVu (PK_iMaCTDV),
  primary key(PK_iMaCTHD, PK_iMaCTDV)
)
  create table tbl_Quyen(
    PK_iMaQuyen varchar(10) primary key not null,
	sTenQuyen nvarchar(50) not null,
	sGhiChu nvarchar(200) null
  )
  create table tbl_User(
   PK_iMaTK varchar(10) not null primary key,
   sTenTK nvarchar(50) not null unique,
   sMatKhau varchar(50) not null,
   sTinhTrang nvarchar(50) not null,
   PK_iMaQuyen varchar(10) foreign key (PK_iMaQuyen) references tbl_Quyen(PK_iMaQuyen)
  )

 