package cn.winter.demo.controller;

import cn.winter.demo.mapper.AdminMapper;
import cn.winter.demo.pojos.Admin;
import cn.winter.demo.pojos.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * Description:
 * Created with IntelliJ IDEA.
 * User: zhangyingjie
 * Date: 2017/11/18
 * Time: 下午7:48
 */
@Controller
@RequestMapping(value = "admin",produces = "text/html;charset=UTF-8")
@ResponseBody
public class AdminController {

    @Resource
    private AdminMapper adminMapper;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(){
        Admin admin=adminMapper.get(1L);

        return admin.getUsername();
    }
}
