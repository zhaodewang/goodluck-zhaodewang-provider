package com.bw.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 赵德旺 on 2017/7/28.
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String  uname;
    private String passwd;
    private Integer age;
    private String gender;
    private String img;
    private String hobby;


}
