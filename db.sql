drop database libsys;
create database libsys;
use libsys;


create table Account(
	fname varchar(20),
    lname varchar(20),
    membership_start_date Date,
    membership_end_date Date,
    username varchar(5),
    acct_password varchar(5),
    primary key(username)
    
);

create table Addresse(
	userName varchar(5),
    country varchar(20),
    state varchar(20),
    city varchar(20),
    district varchar(20),
    house_no varchar(20),
    landmark varchar(255),
    primary key(userName),
    foreign key(userName) references Account(username)

);

create table Book(
	title varchar(50),
    isbn varchar(5),
    author varchar(20),
    publishDate Date,
    primary key(isbn)
);

create table Basket(
	userName varchar(5),
    book_id varchar(5),
    primary key(userName,book_id),
    foreign key(userName) references Account(username),
    foreign key(book_id) references Book(isbn)
);

create table History(
	userName varchar(5),
    book_ID varchar(5),
    foreign key(userName) references Account(username),
    foreign key(book_ID) references Book(isbn),
    primary key(userName,book_ID)
);

insert into Account values("Jeff","Bezos",'2000-09-12','2000-12-12','00001','00001');
insert into Account values("Tom","Sawyer",'2001-09-12','2001-12-12','00002','00002');
insert into Account values("Michael","Reeves",'2002-09-12','2002-12-12','00003','00003');
insert into Account values("Karl","Marx",'2002-09-12','2002-12-12','00004','00004');
insert into Account values("Carol","Schwarz",'2004-09-12','2004-12-12','00005','00005');

insert into Book values("Philosophers Stone","0000a","JK Rowling","2003-4-16");
insert into Book values("Chamber of Secrets","0000b","JK Rowling","2006-4-16");
insert into Book values("Prisoner of Azkaban","0000c","JK Rowling","2006-4-16");
insert into Book values("Goblet of Fire","0000d","JK Rowling","2006-4-16");
insert into Book values("Order of The Phoenix","0000e","JK Rowling","2006-4-16");
insert into Book values("Half Blood Prince","0000f","JK Rowling","2006-4-16");
insert into Book values("Deathly Hallows","0000g","JK Rowling","2006-4-16");
insert into Book values("I Know Why The Caged Bird Sings","0000h","Maya Angelou","2006-4-16");
insert into Book values("East of Eden","0000i","John Steinbeck","2006-4-16");
insert into Book values("The Sun Also Rises","0000j","Ernest Hemingway","2006-4-16");
insert into Book values("Do Androids Dream of Electric Sheep?","0000k","Phillip K Dick","2006-4-16");
insert into Book values("The House of Mirth","0000l","Edith Wharton","2006-4-16");
insert into Book values("Cloudy With A Chance of Meatballs","0000m","Judi Barett","2009-8-15");

insert into Basket values("00001","0000a");
insert into Basket values("00001","0000b");

insert into Basket values("00002","0000c");
insert into Basket values("00002","0000d");

insert into Basket values("00003","0000e");
insert into Basket values("00003","0000f");

insert into Basket values("00004","0000g");
insert into Basket values("00004","0000h");

insert into Basket values("00005","0000i");
insert into Basket values("00005","0000j");

insert into Addresse values("00001","India","Karnataka","Bangalore","yelahanka","1/1A","next to HP petrol station");
insert into Addresse values("00002","India","Haryana","Chandigarh","Sector A","2/1A","next to BP petrol station");
insert into Addresse values("00003","India","Punjab","Amritsar","Ajnala","2/1A","next to Shell petrol station");
insert into Addresse values("00004","India","Gujrat","ahmedabad","Mandal","1/2B","next to Indian oil petrol station");
insert into Addresse values("00005","India","Kerala","cochin","Muvattupuzha","1/3A","next to essar petrol station");

insert into History values("00001","0000i");
insert into History values("00002","0000j");
insert into History values("00003","0000k");
insert into History values("00004","0000l");
insert into History values("00005","0000m");


select * from Account;
