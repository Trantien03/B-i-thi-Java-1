CREATE TABLE Contact (
  id INT PRIMARY KEY identity(1,1),
  name VARCHAR(50) NOT NULL,
  company VARCHAR(50),
  email VARCHAR(50),
  phone VARCHAR(20)
);

select * from Contact

insert into Contact(name, company, email, phone)
  values('tien','FPT','tienTV@gmail.com','012398754');