insert into alunos(nome, email) values('João',  'joao@gmail.com');
insert into alunos(nome, email) values('Pedro', 'pedro@gmail.com' );
insert into alunos(nome, email) values('Maria', 'maria@gmail.com');
insert into alunos(nome, email) values('Antonio', 'antonio@gmail.com');
insert into alunos(nome, email) values('Jose', 'jose@gmail.com');

insert into simulados(descricao) values('2022.1');
insert into simulados(descricao) values('2022.2');
insert into simulados(descricao) values('2022.3');

insert into tipos_calculo_prova(descricao) values('DEFAULT GERAL');
insert into tipos_calculo_prova(descricao) values('DEFAULT MATEMATICA');
insert into tipos_calculo_prova(descricao) values('DEFAULT PORTUGUES');

insert into niveis(descricao, peso) values('FACIL', 15);
insert into niveis(descricao, peso) values('MEDIA', 12);
insert into niveis(descricao, peso) values('DIFICIL', 8);

insert into provas(id_simulado, id_tipo_calculo, materia) values(1, 1, 'MATEMATICA');
insert into provas(id_simulado, id_tipo_calculo, materia) values(1, 1, 'PORTUGUES');
insert into provas(id_simulado, id_tipo_calculo, materia) values(1, 1, 'QUIMICA');
insert into provas(id_simulado, id_tipo_calculo, materia) values(2, 1, 'MATEMATICA');
insert into provas(id_simulado, id_tipo_calculo, materia) values(2, 1, 'PORTUGUES');
insert into provas(id_simulado, id_tipo_calculo, materia) values(2, 1, 'QUIMICA');
insert into provas(id_simulado, id_tipo_calculo, materia) values(3, 1, 'MATEMATICA');
insert into provas(id_simulado, id_tipo_calculo, materia) values(3, 1, 'PORTUGUES');
insert into provas(id_simulado, id_tipo_calculo, materia) values(3, 1, 'QUIMICA');

insert into parametros(chave, valor, descricao) values('VALORBASE', 600,'VALOR DEFAULT DA FORMULA 1');





