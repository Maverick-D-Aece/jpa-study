package com.example.jpastudy.repository;

import com.example.jpastudy.domain.SubInterfaceOne;
import com.example.jpastudy.domain.SubInterfaceTwo;
import com.example.jpastudy.model.BaseEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BaseRepositoryTest {

    @Autowired BaseRepository baseRepository;
    @Autowired SubInterfaceOneRepository subInterfaceOneRepository;
    @Autowired SubInterfaceTwoRepository subInterfaceTwoRepository;


    @BeforeEach
    void setUp() {
        baseRepository.deleteAll();

        BaseEntity entity = new BaseEntity();        
        entity.setFieldOne("fieldOne");
        entity.setFieldTwo("fieldTwo");
        entity.setFieldThree("fieldThree");
        entity.setFieldFour("fieldFour");
        entity.setFieldFive("fieldFive");
        entity.setFieldSix("fieldSix");

        baseRepository.save(entity);
    }

    @Test
    void findByFieldOne() {
        List<SubInterfaceOne> byFieldOne = subInterfaceOneRepository.findByFieldOne("fieldOne");

        assertThat(byFieldOne).hasSize(1);
        assertThat(byFieldOne.get(0).getFieldOne()).isEqualTo("fieldOne");
        assertThat(byFieldOne.get(0).getFieldTwo()).isEqualTo("fieldTwo");
        assertThat(byFieldOne.get(0).getFieldThree()).isEqualTo("fieldThree");
    }

    @Test
    void findByFieldTwo() {
        List<SubInterfaceOne> byFieldTwo = subInterfaceOneRepository.findByFieldTwo("fieldTwo");

        assertThat(byFieldTwo).hasSize(1);
        assertThat(byFieldTwo.get(0).getFieldOne()).isEqualTo("fieldOne");
        assertThat(byFieldTwo.get(0).getFieldTwo()).isEqualTo("fieldTwo");
        assertThat(byFieldTwo.get(0).getFieldThree()).isEqualTo("fieldThree");
    }

    @Test
    void findByFieldThree() {
        List<SubInterfaceOne> byFieldThree = subInterfaceOneRepository.findByFieldThree("fieldThree");

        assertThat(byFieldThree).hasSize(1);
        assertThat(byFieldThree.get(0).getFieldOne()).isEqualTo("fieldOne");
        assertThat(byFieldThree.get(0).getFieldTwo()).isEqualTo("fieldTwo");
        assertThat(byFieldThree.get(0).getFieldThree()).isEqualTo("fieldThree");
    }

    @Test
    void findFirstByFieldFour() {
        SubInterfaceOne byFieldFour = subInterfaceOneRepository.findFirstByFieldFour("fieldFour");

        assertThat(byFieldFour).isNotNull();
        assertThat(byFieldFour.getFieldOne()).isEqualTo("fieldOne");
        assertThat(byFieldFour.getFieldTwo()).isEqualTo("fieldTwo");
        assertThat(byFieldFour.getFieldThree()).isEqualTo("fieldThree");
    }

    @Test
    void findByFieldFour() {
        List<SubInterfaceTwo> byFieldFour = subInterfaceTwoRepository.findByFieldFour("fieldFour");

        assertThat(byFieldFour).hasSize(1);
        assertThat(byFieldFour.get(0).getFieldFour()).isEqualTo("fieldFour");
        assertThat(byFieldFour.get(0).getFieldFive()).isEqualTo("fieldFive");
        assertThat(byFieldFour.get(0).getFieldSix()).isEqualTo("fieldSix");
    }

    @Test
    void findByFieldFive() {
        List<SubInterfaceTwo> byFieldFive = subInterfaceTwoRepository.findByFieldFive("fieldFive");

        assertThat(byFieldFive).hasSize(1);
        assertThat(byFieldFive.get(0).getFieldFour()).isEqualTo("fieldFour");
        assertThat(byFieldFive.get(0).getFieldFive()).isEqualTo("fieldFive");
        assertThat(byFieldFive.get(0).getFieldSix()).isEqualTo("fieldSix");
    }

    @Test
    void findByFieldSix() {
        List<SubInterfaceTwo> byFieldSix = subInterfaceTwoRepository.findByFieldSix("fieldSix");

        assertThat(byFieldSix).hasSize(1);
        assertThat(byFieldSix.get(0).getFieldFour()).isEqualTo("fieldFour");
        assertThat(byFieldSix.get(0).getFieldFive()).isEqualTo("fieldFive");
        assertThat(byFieldSix.get(0).getFieldSix()).isEqualTo("fieldSix");
    }
}