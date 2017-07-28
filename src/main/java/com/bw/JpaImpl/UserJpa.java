package com.bw.JpaImpl;

import com.bw.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 赵德旺 on 2017/7/28.
 */
public interface UserJpa extends JpaRepository<User,Integer>{

    User findUsersByUnameAndPasswd(String uname,String passwd);
    User findUsersByUname(String uname);
}
