package com.example.jpastudy.api;


import com.example.jpastudy.model.BaseEntity;
import com.example.jpastudy.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController()
public class BaseController {

    private final BaseRepository baseRepository;

    @GetMapping(value = "api/v1/base", produces = "application/json")
    public ResponseEntity<List<BaseEntity>> getAll() {
        var all = baseRepository.findAll();

        return ResponseEntity.ok(all);
    }




}
