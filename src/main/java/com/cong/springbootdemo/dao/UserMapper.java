package com.cong.springbootdemo.dao;

import com.cong.springbootdemo.common.UserVO;

/**
 * @Description TODO
 * @Author zheng cong
 * @Date 2019-04-22
 */
public interface UserMapper {

    int insertUser(UserVO userVO);

    UserVO getById(Integer id);

}
