package new_projects.les3_12.controller;

import new_projects.les3_12.entity.Parrot;
import new_projects.les3_12.service.ParrotService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParrotController {
    private final ParrotService service;

    public ParrotController(ParrotService service) {
        this.service = service;
    }
    @RequestMapping("/parrot/parrots")
    public List<Parrot> parrotGetAll(){
        return service.parrotGetAll();
    }
    @RequestMapping("/parrot/1")
    public Parrot getById1(){
        return service.parrotById(1);
    }
    @RequestMapping("/parrot/2")
    public Parrot getById2(){
        return service.parrotById(2);
    }
    @RequestMapping("/parrot/3")
    public Parrot getById3(){
        return service.parrotById(3);
    }
}
