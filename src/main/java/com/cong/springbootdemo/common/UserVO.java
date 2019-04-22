package com.cong.springbootdemo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description TODO
 * @Author zheng cong
 * @Date 2019-04-21
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

    private Long id;

    private String name;

    private Integer age;

}
