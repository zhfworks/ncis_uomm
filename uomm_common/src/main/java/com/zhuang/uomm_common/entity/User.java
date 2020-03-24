package com.zhuang.uomm_common.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private Date createDate;
    private Timestamp createTime;
}
