package com.example.ITAspring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Essa nossa interface é responsavel pelas manipulaçoes do nosso banco de dados

@Repository               // Declarando essa anotattio o spring ira entender que esse arquivo ou interface é o nosso repositorio

public interface Repositorio extends CrudRepository<Aluno/*¹*/, Long/*²*/> { // O Crud repository contem as funções de banco de dados
    
}


// ¹ Entidade da nossa classe - Para importamos nossa entidade(Entity) precisamos importar a classe de onde ela se encontra 
// ² Estamos declarando o tipo de dado que compoe nossa chave primaria e para fazermos isso, nao devemos declarar um tipo primitivo de dados, devemos declarar uma classe