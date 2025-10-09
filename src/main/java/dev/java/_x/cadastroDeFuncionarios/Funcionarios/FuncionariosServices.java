package dev.java._x.cadastroDeFuncionarios.Funcionarios;

import org.springframework.stereotype.Service;
import java.util.List;

@Service // Diz ao Spring para gerenciar esta classe como um Bean
public class FuncionariosServices {

    private FuncionariosRepository funcionariosRepository;

    public FuncionariosServices(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    public List<FuncionariosModel> listarFuncionarios() {
        return funcionariosRepository.findAll();
    }
}