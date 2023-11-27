drop database if exists BDIncidente;

create database BDIncidente;

use BDIncidente;

create table cliente (
	idcli int not null auto_increment primary key,
    nombre varchar (60) not null,
	rasonSocial varchar(50) not null,
	cuit varchar(12) not null
);

insert into cliente (nombre, rasonSocial, cuit)
values 
	('Erick Diaz', 'n', 20235648 ),
    ('Andres Rodriguez', 'a', 12235648 ),
	('Pablo Gomez', 'b', 30235648 );

create table incidente(
	idInc int not null auto_increment,
    descripcion varchar(200) not null,
    estado varchar(100),
    fechaResolucion varchar(12) not null,
    idcli1 int,
    constraint pk_cinc primary key(idInc),
    constraint fk_fcid foreign key(idcli1) references cliente (idcli)
);

insert into incidente (descripcion, estado, fechaResolucion) 
values 
	('se cayo', 'Le duele la rodilla', '12/11/2023'),
    ('accidente auto', 'caduco', '11/11/2023'),
    ('cayo del avion', 'se asusto', '05/02/2023');

create table tecnico (
	idTec int not null auto_increment primary key,
    nombre varchar(30),
    medioNotificacion varchar(200),
    idInc1 int,
    constraint fk_ftec foreign key(idInc1) references incidente (idInc)
);

insert tecnico (nombre, medioNotificacion) 
values 
	('Lueonidas', 'Celular, paloma mensajera'),
    ('Jerjes', 'Correo Argentino'),
    ('Imperion', 'oca');

create table especialidad (
	idEsp int not null auto_increment primary key,
    nombre varchar(30),
    idTec1 int
);

insert especialidad (nombre) 
values 
	('Astronauta'),
    ('Conquistador de Mundos'),
    ('Juez Federal');

create table tec_esp (
	idTec1 int,
    idEsp1 int,
    constraint fk_ftec1 foreign key (idTec1) references tecnico (idTec),
    constraint fk_fesp1 foreign key (idEsp1) references especialidad (idEsp)
);

create table problema (
	idPro int not null auto_increment primary key,
    descripcion varchar(300)
);

insert problema (descripcion) 
values 
	('quedo colgado de la estacion espacial ruso'),
	('no puede encontrar el mundo que tiene que conquistar jajajaja'),
    ('no encuentra el martillito para pegar y decir orden en la corte jajaj');

create table tipoProblema (
	idTP int not null auto_increment primary key,
    nombre varchar(30),
    idPro1 int,
    constraint fk_fidpro foreign key(idPro1) references problema (idPro)
);

insert tipoProblema (nombre) 
values 
	('esquisofrenia'),
    ('imaginacion espontanea'),
    ('Se cree el todo Poderoso');

create table inc_pro (
	idInc1 int,
    idPro1 int,
    constraint fk_finc1 foreign key (idInc1) references incidente (idInc),
    constraint fk_fpro1 foreign key (idPro1) references problema (idPro)
);

select * from  cliente;
select * from incidente;
select * from tecnico
