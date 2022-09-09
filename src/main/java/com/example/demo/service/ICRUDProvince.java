package com.example.demo.service;


import com.example.demo.model.Province;

import java.util.List;
import java.util.Optional;

public interface ICRUDProvince {
    Province save(Province e);

    void delete(Long id);

    Optional<Province> findById(Long id);

    List<Province> findAll();
}
