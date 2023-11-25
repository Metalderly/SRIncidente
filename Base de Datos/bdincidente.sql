drop database if exists BDIncidente;

create database BDIncidente;

use BDIncidente;

create table cliente (
	idcli int not null auto_increment primary key,
	rasonSocial varchar(50) not null,
	cuit varchar(12) not null
);

create table incidente(
	idInc int not null auto_increment,
    descripcion varchar(200) not null,
    estado varchar(100),
    fechaResolucion date null,
    idcli1 int,
    constraint pk_cinc primary key(idInc),
    constraint fk_fcid foreign key(idcli1) references cliente (idcli)
);

create table tecnico (
	idTec int not null auto_increment primary key,
    nombre varchar(30),
    medioNotificacion varchar(200),
    idInc1 int,
    constraint fk_ftec foreign key(idInc1) references incidente (idInc)
);

create table especialidad (
	idEsp int not null auto_increment primary key,
    nombre varchar(30),
    idTec1 int
);

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

create table tipoProblema (
	idTP int not null auto_increment primary key,
    nombre varchar(30),
    idPro1 int,
    constraint fk_fidpro foreign key(idPro1) references problema (idPro)
);

create table inc_pro (
	idInc1 int,
    idPro1 int,
    constraint fk_finc1 foreign key (idInc1) references incidente (idInc),
    constraint fk_fpro1 foreign key (idPro1) references problema (idPro)
);
