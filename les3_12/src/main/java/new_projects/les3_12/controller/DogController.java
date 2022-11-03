package new_projects.les3_12.controller;

import new_projects.les3_12.entity.Dog;
import new_projects.les3_12.service.DogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private final DogService service;

    public DogController(DogService service) {
        this.service = service;
    }

    @RequestMapping("/dog/alldogs")
    public List<Dog> dogGetAll() {
        return service.dogGetAll();
    }

    @RequestMapping("/dog/1")
    public Dog dogById1() {
        return service.dogById(10);
    }

    @RequestMapping("/dog/1")
    public Dog dogById2() {
        return service.dogById(20);
    }

    @RequestMapping("/dog/1")
    public Dog dogById3() {
        return service.dogById(30);
    }
}
