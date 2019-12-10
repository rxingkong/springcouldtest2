package cn.itcast.comsumer.controller;

import cn.itcast.comsumer.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public TbUser queryById(@PathVariable("id") Long id) {
        String url = "http://localhost:8081/user/" + id;
        TbUser tbUser = restTemplate.getForObject(url, TbUser.class);
        return tbUser;
    }
}
