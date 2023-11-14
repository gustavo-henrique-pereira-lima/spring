package com.example.ITAspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ITAspring.model.Aluno;
import com.example.ITAspring.model.Repositorio;

@RestController   // Annotation de rotas
public class Controle {

        // instanciar objeto do tipo repositorio (cadastrar, selecionar e remover os alunos)
        @Autowired          //o Autowired deixa a responsabilidade do spring boot de gerenciar as instancias
        private Repositorio acao;   //objeto privado do tipo repositorio(sim, como um tipo de dados)


        // Metodo de cadastramento de Alunos
        @PostMapping("/")
        public Aluno cadastrar(@RequestBody Aluno c){ //o requestbody esta esperando um objeto do tipo aluno que sera armazenado em 'c'
                return acao.save(c);
        }
    
}
