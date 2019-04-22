package com.cong.springbootdemo.controller;

import com.cong.springbootdemo.common.UserVO;
import com.cong.springbootdemo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author zheng cong
 * @Date 2019-04-21
 */
@Controller
public class BaseController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserVO get(@PathVariable Integer id) {
        return userMapper.getById(id);
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String success(@RequestBody UserVO userVO) {
        int result = userMapper.insertUser(userVO);
        return result == 1 ? "success" : "fail";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("content", "way back to home");
        return "home";
    }
}
