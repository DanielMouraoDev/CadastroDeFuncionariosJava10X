package dev.java._x.cadastroDeCarros.Tarefas;

import dev.java._x.cadastroDeCarros.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_tarefas")
public class TarefasModel {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String tarefa;

    private String importancia;

    private FuncionariosModel funcionario;

    @OneToMany (mappedBy = "tarefas")
    private List<FuncionariosModel> funcionarios;


}
