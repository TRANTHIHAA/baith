package com.example.demo.service.impl;

import com.example.demo.model.Country;
import com.example.demo.repository.ICountryRepository;
import com.example.demo.service.ICRUDCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICRUDCountry {
    @Autowired
    private ICountryRepository iCountryRepository;
    @Override
    public Country save(Country country) {
        return iCountryRepository.save(country);
    }

    @Override
    public void delete(Long id) {
       iCountryRepository.deleteById(id);
    }

    @Override
    public Optional<Country> findById(Long id) {
        return iCountryRepository.findById(id);
    }

    @Override
    public List<Country> findAll() {
        return iCountryRepository.findAll();
    }
}
