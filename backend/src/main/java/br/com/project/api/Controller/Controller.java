package br.com.project.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.api.Model.Client;
import br.com.project.api.Repository.Repository;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Repository acao;

    @PostMapping("/")
    public Client cadastrar(@RequestBody Client c) {
        return acao.save(c);

    }

    @GetMapping("/")
    public Iterable<Client> selecionar() {
        return acao.findAll();
    }

    @PutMapping("/")
    public Client editar(@RequestBody Client c) {
        return acao.save(c);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable long id) {
        acao.deleteById(id);

    }

}
