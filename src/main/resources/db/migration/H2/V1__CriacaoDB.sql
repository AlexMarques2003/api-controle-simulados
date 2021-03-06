---- TABELA ALUNOS

CREATE TABLE alunos (
   id BIGINT NOT NULL AUTO_INCREMENT,
   nome VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL,
   CONSTRAINT pk_alunos PRIMARY KEY (id)
);

---- TABELA SIMULADOS

CREATE TABLE simulados (
   id BIGINT NOT NULL AUTO_INCREMENT,
   descricao VARCHAR(255) NOT NULL,
   finalizado BOOLEAN,
   calculado BOOLEAN,
   CONSTRAINT pk_simulados PRIMARY KEY (id)
);

---- TABELA TIPOS_CALCULO_PROVA

CREATE TABLE tipos_calculo_prova (
   id BIGINT NOT NULL AUTO_INCREMENT,
   descricao VARCHAR(255) NOT NULL,
   CONSTRAINT pk_tipos_calculo_prova PRIMARY KEY (id)
);

---- TABELA NIVEIS

CREATE TABLE niveis (
   id BIGINT NOT NULL AUTO_INCREMENT,
   descricao VARCHAR(255) NOT NULL,
   peso DOUBLE NOT NULL,
   CONSTRAINT pk_niveis PRIMARY KEY (id)
);

---- TABELA PARAMETROS

CREATE TABLE parametros (
   id BIGINT NOT NULL AUTO_INCREMENT,
   chave VARCHAR(255),
   valor DOUBLE,
   descricao VARCHAR(255),
   CONSTRAINT pk_parametros PRIMARY KEY (id)
);

---- TABELA PROVAS

CREATE TABLE provas (
   id BIGINT NOT NULL AUTO_INCREMENT,
   id_simulado BIGINT,
   id_tipo_calculo BIGINT,
   materia VARCHAR(255) NOT NULL,
   data DATE,
   CONSTRAINT pk_provas PRIMARY KEY (id)
);

ALTER TABLE provas ADD CONSTRAINT FK_PROVAS_ON_ID_SIMULADO FOREIGN KEY (id_simulado) REFERENCES simulados (id);

ALTER TABLE provas ADD CONSTRAINT FK_PROVAS_ON_ID_TIPO_CALCULO FOREIGN KEY (id_tipo_calculo) REFERENCES tipos_calculo_prova (id);

---- TABELA QUESTOES

CREATE TABLE questoes (
   id BIGINT NOT NULL AUTO_INCREMENT,
   ordem BIGINT,
   enunciado VARCHAR(255),
   id_prova BIGINT,
   id_nivel BIGINT,
   CONSTRAINT pk_questoes PRIMARY KEY (id)
);

ALTER TABLE questoes ADD CONSTRAINT FK_QUESTOES_ON_ID_NIVEL FOREIGN KEY (id_nivel) REFERENCES niveis (id);

ALTER TABLE questoes ADD CONSTRAINT FK_QUESTOES_ON_ID_PROVA FOREIGN KEY (id_prova) REFERENCES provas (id);

---- TABELA ALTERNATIVAS

CREATE TABLE alternativas (
   id BIGINT NOT NULL AUTO_INCREMENT,
   id_questao BIGINT,
   opcao VARCHAR(255),
   correta BOOLEAN,
   CONSTRAINT pk_alternativas PRIMARY KEY (id)
);

ALTER TABLE alternativas ADD CONSTRAINT FK_ALTERNATIVAS_ON_QUESTAO FOREIGN KEY (id_questao) REFERENCES questoes (id);

---- TABELA RESPOSTAS ALUNO

CREATE TABLE respostas_aluno (
   id BIGINT NOT NULL AUTO_INCREMENT,
   id_questao BIGINT,
   id_aluno BIGINT,
   resposta VARCHAR(255) NOT NULL,
   CONSTRAINT pk_respostas_aluno PRIMARY KEY (id)
);

ALTER TABLE respostas_aluno ADD CONSTRAINT FK_RESPOSTAS_ALUNO_ON_ID_ALUNO FOREIGN KEY (id_aluno) REFERENCES alunos (id);

ALTER TABLE respostas_aluno ADD CONSTRAINT FK_RESPOSTAS_ALUNO_ON_ID_QUESTAO FOREIGN KEY (id_questao) REFERENCES questoes (id);