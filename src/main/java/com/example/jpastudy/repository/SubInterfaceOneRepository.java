package com.example.jpastudy.repository;

import com.example.jpastudy.domain.SubInterfaceOne;

import java.util.List;

public interface SubInterfaceOneRepository extends BaseRepository {

    List<SubInterfaceOne> findByFieldOne(String fieldOne);

    List<SubInterfaceOne> findByFieldTwo(String fieldTwo);

    List<SubInterfaceOne> findByFieldThree(String fieldThree);

    SubInterfaceOne findFirstByFieldFour(String fieldFour);

}
