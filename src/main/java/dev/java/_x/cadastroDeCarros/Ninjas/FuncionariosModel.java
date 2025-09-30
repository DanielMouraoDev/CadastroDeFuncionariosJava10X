package dev.java._x.cadastroDeCarros.Ninjas;

import dev.java._x.cadastroDeCarros.Missoes.TarefasModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
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


    public FuncionariosModel() {
    }

    public FuncionariosModel(Long id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


        }