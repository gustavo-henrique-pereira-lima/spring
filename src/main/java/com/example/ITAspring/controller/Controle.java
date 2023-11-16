package com.example.ITAspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ITAspring.model.Aluno;
import com.example.ITAspring.model.Repositorio;

@RestController   // Annotation de rotas
@CrossOrigin(origins = "4200")  // evita o problema CORS e libera a comunicação com a API
public class Controle {

        // instanciar objeto do tipo repositorio (cadastrar, selecionar e remover os alunos)
        @Autowired          //o Autowired deixa a responsabilidade do spring boot de gerenciar as instancias
        private Repositorio acao;   //objeto privado do tipo repositorio(sim, como um tipo de dados)


        // Metodo de cadastramento de Alunos
        @PostMapping("/")
        public Aluno cadastrar(@RequestBody Aluno c){ //o requestbody esta esperando um objeto do tipo aluno que sera armazenado em 'c'
                return acao.save(c);
        }
        
        @GetMapping("/")                  // ira buscar/listar todos os usuarios da tabela Aluno
        public Iterable<Aluno> todosAlunos(){
                return acao.findAll();
        }

        @PutMapping("/")                  // Isto ira fazer com que um objeto do banco de dados seja alterado
        public Aluno editar (@RequestBody Aluno c){
                return acao.save(c);
                // Para alterar voce precisa estar com todos os dados do objeto que queres atualizar, senao o update nao ira ocorrer com sucesso
        }

        @DeleteMapping("/{id}")           // Isto ira excluir um objeto do banco de dados
        public void remover(@PathVariable long id){
                acao.deleteById(id);
        }       // Nao HAVERA retorno para a exclusao
}
