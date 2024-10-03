package kz.ruzgaliyev.Sportclub.controllers;

import kz.ruzgaliyev.Sportclub.entities.SportType;
import kz.ruzgaliyev.Sportclub.service.SportTypeService;
import kz.ruzgaliyev.Sportclub.service.impl.SportTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sporttype")
public class SportTypeController {
    @Autowired
    private SportTypeService sportTypeService;
    @GetMapping
    public List<SportType> getAllSportTypes() {
        return sportTypeService.getAllSportTypes();
    }
    @GetMapping("/{id}")
    public SportType getSportTypeById(@PathVariable Long id) {
        return sportTypeService.getAllSportTypesById(id);
    }
    @PostMapping
    public SportType addSportType(@RequestBody SportType sportType) {
        return sportTypeService.addSportType(sportType);
    }
    @PutMapping("/{id}")
    public SportType updateSportType(@PathVariable Long id, @RequestBody SportType sportType) {
        return sportTypeService.updateSportType(sportType);
    }
    @DeleteMapping("/{id}")
    public void deleteSportType(@PathVariable Long id) {
        sportTypeService.deleteSportType(id);
    }
}
