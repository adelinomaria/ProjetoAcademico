package projeto.sga.sga.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import projeto.sga.sga.model.ClasseAluno;
import projeto.sga.sga.service.AlunoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService as;

    @PostMapping
    public ResponseEntity<?> cadastrarAluno(@RequestBody ClasseAluno aluno) {
        return as.cadastrarAluno(aluno);
    }

    @GetMapping
    public List<ClasseAluno> listarAlunos() {
        return as.listarAlunos();
    }

    @GetMapping("/{id}")
    public Optional<ClasseAluno> buscarAlunoById(@PathVariable Long id) {
        return as.buscarAlunoById(id);
    }
}
