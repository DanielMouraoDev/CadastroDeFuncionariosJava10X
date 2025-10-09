package dev.java._x.cadastroDeFuncionarios.Tarefas;

import dev.java._x.cadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor; // Adicionado
import lombok.Data;              // Adicionado
import lombok.NoArgsConstructor;   // Adicionado

import java.util.List;

@Entity
@Table (name = "tb_tarefas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefasModel {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; // Corrigido de long para Long

    private String tarefa;

    private String importancia;

    // Mapeamento One-to-Many
    @OneToMany (mappedBy = "tarefas")
    private List<FuncionariosModel> funcionarios;
}