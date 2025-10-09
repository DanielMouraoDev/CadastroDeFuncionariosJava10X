package dev.java._x.cadastroDeFuncionarios.Funcionarios;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    private FuncionariosServices funcionariosServices;

    public FuncionariosController(FuncionariosServices funcionariosServices) {
        this.funcionariosServices = funcionariosServices;
    }

    @GetMapping("/Boasvindas")
    public String Boasvindas() {
        return "Essa é a minha primeira menssagem nessa rota";
    }

    // CREATE
    @PostMapping("/criar")
    public String criarfuncionario() {
        return "Funcionario criado";
    }

    @GetMapping("/listar")
    public List<FuncionariosModel> ListarTodososFuncionarios() {
        return funcionariosServices.listarFuncionarios();
    }

    //CREATE POR ID
    @GetMapping("/listar/{id}")
    public FuncionariosModel MostrarTodososFuncionariosporID(@PathVariable Long id) {
        return funcionariosServices.listarFuncionariosID(id);
    }

    //UPDATE
    @PutMapping("/AlterarID")
    public String AlterarFuncionariosporID() {
        return "Alterar FuncionarioporID";
    }

    //DELETE
    @DeleteMapping("/DeletarID")
    public String DeletarFuncionariosporID() {
        return "Funcionario Deletado porID";

    }
}