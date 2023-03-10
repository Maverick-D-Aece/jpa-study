package com.example.jpastudy.api;


import com.example.jpastudy.domain.SubInterfaceTwo;
import com.example.jpastudy.repository.SubInterfaceTwoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController()
public class SubInterFaceTwoController {

    private final SubInterfaceTwoRepository subInterfaceTwoRepository;

    @GetMapping(value = "api/v1/subTwo", produces = "application/json")
    public ResponseEntity<List<SubInterfaceTwo>> getSubTwo(
            @RequestParam(value = "fieldFour") String fieldFour
    ) {
        var subTwos = subInterfaceTwoRepository.findByFieldFour(fieldFour);

        return ResponseEntity.ok(subTwos);
    }




}
