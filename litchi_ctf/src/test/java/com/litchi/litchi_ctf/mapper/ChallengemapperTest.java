package com.litchi.litchi_ctf.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengemapperTest {
    @Autowired
    private Challengemapper challengemapper;
    @Test
    public void selectChallengeById() {
        System.out.println(challengemapper.selectChallengeById(3));
    }
}