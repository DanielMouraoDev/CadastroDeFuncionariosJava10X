package dev.java._x.cadastroDeCarros.Ninjas;

import dev.java._x.cadastroDeCarros.Missoes.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FuncionariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    int idade;

    @ManyToOne
    @JoinColumn (name = "Tarefas_ID") // foreing key
    private TarefasModel tarefas;


    }
