create database thptqg;
use thptqg;
create table dsthisinh (
	STT int primary key auto_increment,
	Ho_ten varchar(50) not null,
	Gioi_tinh varchar(6),
	CCCD varchar(16),
    Dien_thoai varchar(16),
    Diem_toan float,
    Diem_van float,
    Ngoai_ngu float,
    To_hop float
);
insert into dsthisinh(Ho_ten,Gioi_tinh,CCCD,Dien_thoai,Diem_toan,Diem_van,Ngoai_ngu,To_hop)
values 	("Nguyen Huu Minh","Nam","049304006666","0123456789",8,8,8,9),
		("Duong Ngoc Hong Ha","Nu","049306116166","6666666666",9,9,8,9),
        ("Le Quynh","Nam","049316191015","0942269161",7,8,6,8);
