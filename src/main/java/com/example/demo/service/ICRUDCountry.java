package com.example.demo.service;


import com.example.demo.model.Country;

import java.util.List;
import java.util.Optional;

public interface ICRUDCountry  {
    Country save(Country e);

    void delete(Long id);

    Optional<Country> findById(Long id);

    List<Country> findAll();

}
