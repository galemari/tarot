package cl.tarot.controller;

import cl.tarot.entity.Cliente;
import cl.tarot.exception.EntityNotFoundException;
import cl.tarot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping("/cliente")
    public void crear(@RequestBody Cliente c){
        repository.save(c);
    }

    @GetMapping("/cliente/{id}")
    public Cliente buscarPorId(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(()-> new EntityNotFoundException("No se encuentra el cliente ID : " + id));
    }

    @GetMapping("/cliente")
    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }
}
