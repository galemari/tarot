package cl.tarot.controller;

import cl.tarot.entity.Tarotista;
import cl.tarot.repository.TarotistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TarotistaController {
    @Autowired
    private TarotistaRepository repository;

    @PostMapping("/tarotista")
    public void crear(@RequestBody Tarotista t){
        repository.save(t);
    }

    @GetMapping("/tarotista")
    public List<Tarotista> buscarTodos(){
        return repository.findAll();
    }

}
