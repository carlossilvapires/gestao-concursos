package com.gestao.concursos.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity // avisa ao spring que essa classe vai virar uma tabela no banco de dados
@Data   // criacao de getters e seters com lombok
public class Concurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String orgao;
    private LocalDate dataProva;
    private String descricao;
    private String imagemUrl;
}
