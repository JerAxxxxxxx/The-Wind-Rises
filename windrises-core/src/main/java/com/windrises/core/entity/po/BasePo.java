package com.windrises.core.entity.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class BasePo implements Serializable {
    public final static String DEFAULT_USERNAME = "system";

    /**
     * 主键
     */
    private Integer id;
}
