package org.javaboy.vhr.controller;

import org.javaboy.vhr.bean.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Acrossthewind
 * @version 1.0
 * @description: TODO
 * @date 2023/9/7 9:16
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录");
    }

}
