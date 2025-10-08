package dev.java._x.cadastroDeFuncionarios.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas/criar")
public class TarefasController {

@PostMapping("/criar")
    public String criarTarefas() {
    return "Tarefa criada com seucesso";
}

@PutMapping("/alterar")
    public String alterarTarefa() {
    return "Tarefa Alterada";
}

@DeleteMapping("/deletar")
    public String deletarTarefa() {
    return "Tarefa deletada";
}

@GetMapping("/listar")
    public String listar() {
    return "Tarefas listadas com sucesso";
}
}
