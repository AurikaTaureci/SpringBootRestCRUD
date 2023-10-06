create schema restapi;
use restapi;
drop table if exists books;

create table books(
    id tinyint not null primary key auto_increment,
    title varchar(255) not null,
    price decimal(6,2) not null
);

insert into books(title,price) values('In your hands',45.99),
('Bear Says Thanks',35.99),
('Plant a Kiss',75.39);