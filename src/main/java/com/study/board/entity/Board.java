package com.study.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity   // 테이블을 의미함. JPA
@Data  // lombok
public class Board {

    @Id  // primary key를 의미함
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //전략. Identity는 mysql, mariaDB에서 쓰임
    private Integer id;
    private String title;
    private String content;
    private String filename;
    private String filepath;
}
