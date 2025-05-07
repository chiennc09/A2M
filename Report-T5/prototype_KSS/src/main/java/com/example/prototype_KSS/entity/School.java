package com.example.prototype_KSS.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {
    private String name;
    private String address;
    private String website;
    private String tuitionFee;
    private String admissionAge;
    private String schoolType;
    private double rating;
    private List<String> facilities;
    private List<String> utilities;
}
