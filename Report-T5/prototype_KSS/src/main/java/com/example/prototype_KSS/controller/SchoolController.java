package com.example.prototype_KSS.controller;

import com.example.prototype_KSS.entity.School;
import com.example.prototype_KSS.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @PostMapping("/search")
    public String searchSchools(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "cityProvince", required = false) String cityProvince,
            @RequestParam(value = "district", required = false) String district,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "minFee", required = false) Double minFee,
            @RequestParam(value = "maxFee", required = false) Double maxFee,
            @RequestParam(value = "facilities", required = false) List<String> facilities,
            @RequestParam(value = "utilities", required = false) List<String> utilities,
            Model model) {

        List<School> schools = schoolService.searchSchools(name, cityProvince, district, type, minFee, maxFee, facilities, utilities);
        model.addAttribute("schools", schools);
        model.addAttribute("schoolCount", schools.size());
        return "search";
    }

    @GetMapping("/school-details")
    public String schoolDetails(@RequestParam("name") String name, Model model) {
        School school = schoolService.getSchoolByName(name);
        model.addAttribute("school", school);
        return "school-details";
    }
}
