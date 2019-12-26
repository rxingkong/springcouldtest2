package cn.itcast.comsumer.controller;

import cn.itcast.comsumer.client.UserClient;
import cn.itcast.comsumer.pojo.TbUser;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer")
@DefaultProperties(defaultFallback = "queryByIdFallBack")
public class ConsumerController {
  /*  @Autowired
    private RestTemplate restTemplate;*/
  @Autowired
  private UserClient userClient;


    @GetMapping("/{id}")
    public TbUser queryById(@PathVariable("id") Long id) {
        return userClient.queryById(id);
        /*String url = "http://user-service/user/" + id;
        String tbUser = restTemplate.getForObject(url, String.class);
        return tbUser;*/
    }
  /*  @Autowired
    private DiscoveryClient discoveryClient;



    @GetMapping("/{id}")
   *//* @HystrixCommand(commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })*//*
   @HystrixCommand(commandProperties = {
           @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
           @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
           @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "50"),
   })
    public String queryById(@PathVariable("id") Long id) {
        if (id%2==0){
            throw new RuntimeException("");
        }
        *//*List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id;*//*
        String url = "http://user-service/user/" + id;
        String tbUser = restTemplate.getForObject(url, String.class);
        return tbUser;
    }*/

    /*public String queryByIdFallBack(Long id){
        return "服务器压力太大请稍候再试";
    }*/
    public String queryByIdFallBack(){
        return "服务器压力太大请稍候再试";
    }

   /* @GetMapping("/{id}")
    public TbUser queryById(@PathVariable("id") Long id) {
        *//*List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id;*//*
        String url = "http://user-service/user/" + id;
        TbUser tbUser = restTemplate.getForObject(url, TbUser.class);
        return tbUser;
    }*/
}

