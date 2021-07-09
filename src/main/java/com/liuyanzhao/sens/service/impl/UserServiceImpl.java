package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.model.User;
import com.liuyanzhao.sens.dao.UserDao;
import com.liuyanzhao.sens.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuyanzhao
 * @since 2021-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
