package dev.java._x.cadastroDeFuncionarios.Tarefas;

import dev.java._x.cadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor; // Adicionado
import lombok.Data;              // Adicionado
import lombok.NoArgsConstructor;   // Adicionado

import java.util.List;

@Entity
@Table (name = "tb_tarefas")
@Data // Adicionado: Gera Getters, Setters, toString, etc.
@NoArgsConstructor // Adicionado: Construtor vazio para JPA
@AllArgsConstructor // Adicionado
public class TarefasModel {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; // Corrigido de long para Long

    private String tarefa;

    private String importancia;

    // Campo 'funcionario' removido pois é redundante com a lista abaixo

    // Mapeamento One-to-Many
    @OneToMany (mappedBy = "tarefas")
    private List<FuncionariosModel> funcionarios;
}