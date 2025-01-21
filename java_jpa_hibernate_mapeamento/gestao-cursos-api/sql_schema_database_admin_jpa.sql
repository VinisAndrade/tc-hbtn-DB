CREATE TABLE Aluno (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nomeCompleto TEXT NOT NULL,
    matricula TEXT NOT NULL,
    nascimento DATE,
    email TEXT
);

CREATE TABLE Endereco (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    logradouro TEXT,
    cidade TEXT,
    estado TEXT,
    aluno_id INTEGER,
    FOREIGN KEY (aluno_id) REFERENCES Aluno(id)
);

CREATE TABLE Telefone (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    numero TEXT NOT NULL,
    aluno_id INTEGER,
    FOREIGN KEY (aluno_id) REFERENCES Aluno(id)
);

CREATE TABLE Professor (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nomeCompleto TEXT NOT NULL,
    matricula TEXT NOT NULL
);

CREATE TABLE Curso (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    descricao TEXT,
    professor_id INTEGER,
    FOREIGN KEY (professor_id) REFERENCES Professor(id)
);

CREATE TABLE MaterialCurso (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    descricao TEXT,
    url TEXT,
    curso_id INTEGER,
    FOREIGN KEY (curso_id) REFERENCES Curso(id)
);
