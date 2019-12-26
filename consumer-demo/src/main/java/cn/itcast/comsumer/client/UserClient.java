package cn.itcast.comsumer.client;

import cn.itcast.comsumer.pojo.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallback = UserClientImpl.class)
public interface UserClient {
    @GetMapping("user/{id}")
    TbUser queryById(@PathVariable("id") Long id);
}
