package new_projects.les3_12.controller;

import new_projects.les3_12.entity.Cat;
import new_projects.les3_12.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {
    private final CatService service;

    public CatController(CatService service) {
        this.service = service;
    }

    @RequestMapping("/cat/cats")
    public List<Cat> catGetAll() {
        return service.catGetAll();
    }

    @RequestMapping("/cat/1")
    public Cat getByID1() {
        return service.catById(5);
    }

    @RequestMapping("/cat/1")
    public Cat getByID2() {
        return service.catById(15);
    }

    @RequestMapping("/cat/1")
    public Cat getByID3() {
        return service.catById(25);
    }
}
