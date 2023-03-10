package com.example.jpastudy.repository;

import com.example.jpastudy.domain.SubInterfaceTwo;

import java.util.List;

public interface SubInterfaceTwoRepository extends BaseRepository {

    List<SubInterfaceTwo> findByFieldFour(String fieldFour);

    List<SubInterfaceTwo> findByFieldFive(String fieldFive);

    List<SubInterfaceTwo> findByFieldSix(String fieldSix);

}
