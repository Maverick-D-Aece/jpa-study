package com.example.jpastudy.service;

import com.example.jpastudy.model.BaseEntity;
import com.example.jpastudy.repository.BaseRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InitialDataLoader {
    private final BaseRepository repository;

    public InitialDataLoader(
            @Qualifier("baseRepository") BaseRepository repository
    ) {
        this.repository = repository;
    }

    @PostConstruct
    public void loadData() {
        BaseEntity entity = new BaseEntity();
        entity.setFieldOne("fieldOne");
        entity.setFieldTwo("fieldTwo");
        entity.setFieldThree("fieldThree");
        entity.setFieldFour("fieldFour");
        entity.setFieldFive("fieldFive");
        entity.setFieldSix("fieldSix");

        repository.save(entity);
    }
}
