package dev.java._x.cadastroDeFuncionarios.Funcionarios;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java._x.cadastroDeFuncionarios.Tarefas.TarefasModel;
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
    @Column (name = "ID")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (unique = true)
    private String email;

    @Column (name = "imagem_Url")
    private String imgUrl;

    @Column (name = "idade")
    int idade;

    @ManyToOne
    @JsonIgnore
    @JoinColumn (name = "Tarefas_ID") // foreing key
    private TarefasModel tarefas;


    }
