CREATE table tbAluno(
    id bigint auto_increment,
    nome varchar(200)
);

CREATE table tbProva(
    id bigint auto_increment,
    materia varchar(200)
 );


insert into tbAluno(nome) values('João');
insert into tbAluno(nome) values('Jorge');
insert into tbAluno(nome) values('Lucas');
insert into tbAluno(nome) values('Pedro');

insert into tbProva(materia) values('Matemática');
insert into tbProva(materia) values('Português');
insert into tbProva(materia) values('Geografia');
insert into tbProva(materia) values('Física');
