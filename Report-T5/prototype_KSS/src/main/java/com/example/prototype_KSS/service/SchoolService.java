package com.example.prototype_KSS.service;

import com.example.prototype_KSS.entity.School;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private List<School> schools;

    public SchoolService() {
        schools = new ArrayList<>();
        schools.add(new School("Trường Mầm Non Tư Thục Ước Mơ Xanh (Green Dream Preschool)", "Lô 34-35 - Biệt thự liền kề 319 Hồng Tiến, Quận Long Biên, Hà Nội", "GreenDream.school.edu", "From 4,000,000 VND/month", "From 6 months to 5 years", "Public", 5.0, Arrays.asList("Cafeteria", "School bus", "After school care", "Saturday class"), Arrays.asList("Breakfast", "Health check")));
        schools.add(new School("Trường Mầm Non Song Ngữ Peace Montessori Pre-school", "Số 2, Ngõ 38, Đường Yên Lãng, Phường Láng Hạ, Quận Đống Đa, Hà Nội", "PeaceMontessori.school.edu", "From 5,000,000 VND/month", "From 6 months to 5 years", "Public", 5.0, Arrays.asList("Cafeteria", "School bus", "After school care", "Saturday class"), Arrays.asList("Breakfast", "Health check")));
    }

    public List<School> searchSchools(String name, String cityProvince, String district, String type, Double minFee, Double maxFee, List<String> facilities, List<String> utilities) {
        return schools.stream()
                .filter(s -> name == null || s.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(s -> type == null || s.getSchoolType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public School getSchoolByName(String name) {
        return schools.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
