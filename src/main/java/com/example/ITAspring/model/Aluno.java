package com.example.ITAspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// Atraves do nosso modelo, poderemos gerar uma tabela no banco de dados e trafegar informações atraves da API

@Table(name = "alunos")              //Nome da tabela
@Entity(name = "alunos")             //Nome da entidade
@Getter                              //lombok ira fazer todos os metodos de GET dos atributos
@Setter                              //lombok ira fazer todos os metodos de SET dos atributos


public class Aluno {
        // Os atributos serao as colunas da nossa tabela
        @Id                         //O JPA ira entender que o id é nossa chave primaria
        @GeneratedValue(strategy = GenerationType.IDENTITY)  // o JPA ira entender que a nossa chave primaria é AUTOINCREMENT
        private long id;
        private String nome;
        private String sobrenome;
        private Integer numero;
        private String sexo;
        private String email;
        private Integer senha;

}
