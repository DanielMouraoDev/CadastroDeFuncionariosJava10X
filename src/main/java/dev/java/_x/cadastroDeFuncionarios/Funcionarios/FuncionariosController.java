package dev.java._x.cadastroDeFuncionarios.Funcionarios;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    private final FuncionariosServices funcionariosServices;

    public FuncionariosController(FuncionariosServices funcionariosServices) {
        this.funcionariosServices = funcionariosServices;
    }

    @GetMapping("/Boasvindas")
    public String Boasvindas() {
        return "Essa é a minha primeira menssagem nessa rota";
    }

    @PostMapping("/criar")
    public FuncionariosModel criarfuncionario(@RequestBody FuncionariosModel funcionario) {
        return funcionariosServices.criarFuncionarios(funcionario);
    }

    @GetMapping("/listar")
    public List<FuncionariosModel> ListarTodososFuncionarios() {
        return funcionariosServices.listarFuncionarios();
    }

    @GetMapping("/listar/{id}")
    public FuncionariosModel MostrarTodososFuncionariosporID(@PathVariable Long id) {
        return funcionariosServices.listarFuncionariosID(id);
    }

    @PutMapping("/AlterarID")
    public String AlterarFuncionariosporID() {
        return "Alterar FuncionarioporID";
    }

    @DeleteMapping("/DeletarID")
    public String DeletarFuncionariosporID() {
        return "Funcionario Deletado porID";
    }
}