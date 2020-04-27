package com.windrises.core.entity.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:41
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestUser extends BasePo {
    private String name;

    private String password;

    private String role;
}