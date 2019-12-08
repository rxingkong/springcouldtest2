package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public TbUser queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
