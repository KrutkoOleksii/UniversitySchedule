package ua.goit.schedule.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.goit.schedule.model.Subject;
import ua.goit.schedule.service.SubjectsService;

import java.util.Collection;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/subjects")
public class SubjectsController {

    private final SubjectsService subjectsService;

    @GetMapping(value = {"","/"})
    public Collection<Subject> findAll(){
        return subjectsService.findAll();
    }

    @GetMapping(value = {"/{id}"})
    public Optional<Subject> findById(@PathVariable Long id){
        return subjectsService.findById(id);
    }

    @PostMapping(value = {"","/"})
    public Subject save(@RequestBody Subject subject){
        return subjectsService.save(subject);
    }

    @DeleteMapping(value = {"/{id}"})
    public void deleteById(@PathVariable Long id) {
        subjectsService.deleteById(id);
    }
}
