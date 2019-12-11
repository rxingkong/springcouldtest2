package cn.itcast.user.controller;

import cn.itcast.user.pojo.TbUser;
import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
   /* public Map<String,Object> seleId(Long id){
        Map<String,Object> map = new HashMap<>();

        try {
          TbUser user= userService.queryById(id);
          map.put("code",100);
          map.put("masage","操作成功");
          map.put("data",user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }*/

   public TbUser seleId(@PathVariable("id") Long id){
       return userService.queryById(id);
    }
}
