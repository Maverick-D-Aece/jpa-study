package com.example.jpastudy.api;


import com.example.jpastudy.domain.SubInterfaceOne;
import com.example.jpastudy.repository.SubInterfaceOneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController()
public class SubInterFaceOneController {

    private final SubInterfaceOneRepository subInterfaceOneRepository;

    @GetMapping(value = "api/v1/subOne", produces = "application/json")
    public ResponseEntity<List<SubInterfaceOne>> getSubOne(
            @RequestParam(value = "fieldOne") String fieldOne
    ) {
        var subOnes = subInterfaceOneRepository.findByFieldOne(fieldOne);

        return ResponseEntity.ok(subOnes);
    }




}
