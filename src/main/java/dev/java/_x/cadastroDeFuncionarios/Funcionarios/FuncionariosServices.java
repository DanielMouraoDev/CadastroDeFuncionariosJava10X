package dev.java._x.cadastroDeFuncionarios.Funcionarios;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service // Diz ao Spring para gerenciar esta classe como um Bean
public class FuncionariosServices {

    private FuncionariosRepository funcionariosRepository;

    public FuncionariosServices(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    public List<FuncionariosModel> listarFuncionarios() {
        return funcionariosRepository.findAll();
    }

    public FuncionariosModel listarFuncionariosID(Long id) {
            Optional<FuncionariosModel> funcionariosID = funcionariosRepository.findById(id);
            return funcionariosID.orElse(null);
        }

        public FuncionariosModel criarFuncionarios (FuncionariosModel funcionario) {
        return funcionariosRepository.save(funcionario);
        }

        }
