package com.beardtech.contaponto.controller;

import com.beardtech.contaponto.model.Amigo;
import com.beardtech.contaponto.repo.AmigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/amigo")
public class AmigoController {

    @Autowired
    private AmigoRepository repository;

    @PostMapping
    public String create(@RequestBody Amigo amigo){
        repository.save(amigo);
        return "Amigo " + amigo.getNome() + " criado com sucesso";
    }

    @GetMapping
    public List<Amigo> getAll(){
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Amigo> get(@PathVariable Long id){
        return repository.findById(id);
    }

    @PutMapping
    @Transactional
    public String update(@RequestBody Amigo amigo){
        repository.updateAmigoById(amigo.getNome(), amigo.getPontosVitalicios(), amigo.getPontosRevogaveis(), amigo.getId());
        return "Amigo " + amigo.getNome() + " atualizado com sucesso";
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Long id){
        repository.delete(repository.findById(id).get());
        return "Amigo deletado com sucesso";
    }
}
