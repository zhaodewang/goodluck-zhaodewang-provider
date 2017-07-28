package com.bw.UserAction;

import com.bw.JpaImpl.UserJpa;
import com.bw.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 赵德旺 on 2017/7/28.
 */
@Controller
public class UserAction {
    @Autowired
    private UserJpa service;
    @RequestMapping("shouye")
    private String haunying(){
            return "login";
        }
    @RequestMapping("tiaozhuan")
    private String tiao(){
        return "add";
    }

    @RequestMapping("login")
    private String index(String uname, String passwd, HttpSession session){
    User user= service.findUsersByUnameAndPasswd(uname,passwd);
     User user1= (User) session.getAttribute("user");
     session.setAttribute("user1",user);
        System.out.println(user);
    if (user!=null){
        return  "forward:select";
    }else
    {
        return "login";
    }

    }
    @RequestMapping("add")
    private String add(User user){
        service.save( user);
        return "forward:select";
    }
    @RequestMapping("select")
    private String select(User user,Model model){
        List<User> list =service.findAll();
       model.addAttribute("list",list);
        return "show";
    }
    @RequestMapping("delete")
    private String delete(User user){
        service.delete(user);
        return "forward:select";
    }
    @RequestMapping("selectname")
    private String selectname(String uname){
        service.findUsersByUname(uname);
        return "forward:select";
    }
}
