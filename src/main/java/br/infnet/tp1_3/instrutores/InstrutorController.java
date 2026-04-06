package br.infnet.tp1_3.instrutores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instrutores")
@CrossOrigin(origins = "*")
public class InstrutorController {

    private final InstrutorService instrutorService;

    public InstrutorController(InstrutorService instrutorService) {
        this.instrutorService = instrutorService;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody Instrutor instrutor) {
        instrutorService.cadastrarInstrutor(instrutor);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity<List<Instrutor>> listarTodos() {
        return ResponseEntity.ok(instrutorService.listarTodos());
    }
}