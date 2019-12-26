package cn.itcast.comsumer.client;

import cn.itcast.comsumer.pojo.TbUser;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient{
    @Override
    public TbUser queryById(Long id) {
        final TbUser tbUser = new TbUser();
        tbUser.setUsername("未知用户!");
        return tbUser;
    }
}
