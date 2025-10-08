package dev.java._x.cadastroDeFuncionarios.Funcionarios;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FuncionariosController {

    @GetMapping("/Boasvindas")
    public String Boasvindas() {
        return "Essa é a minha primeira menssagem nessa rota";
    }

    // CREATE
    @PostMapping("/criar")
    public String criarfuncionario() {
        return "Funcionario criado";
    }

    @GetMapping("/todos")
    public String MostrarTodososFuncionarios() {
        return "Mostrar Funcionario ";
    }

    //CREATE POR ID
    @GetMapping("/todosID")
    public String MostrarTodososFuncionariosporID() {
        return "Mostrar Funcionario por ID";
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