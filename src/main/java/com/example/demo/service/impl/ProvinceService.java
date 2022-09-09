package com.example.demo.service.impl;

import com.example.demo.model.Province;
import com.example.demo.repository.IProvinceRepository;
import com.example.demo.service.ICRUDProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService implements ICRUDProvince {
    @Autowired
    private IProvinceRepository iProvinceRepository;

    @Override
    public Province save(Province province) {
        return iProvinceRepository.save(province);
    }

    @Override
    public void delete(Long id) {
        iProvinceRepository.deleteById(id);
    }

    @Override
    public Optional<Province> findById(Long id) {
        return iProvinceRepository.findById(id);
    }

    @Override
    public List<Province> findAll() {
        return iProvinceRepository.findAll();
    }


}
