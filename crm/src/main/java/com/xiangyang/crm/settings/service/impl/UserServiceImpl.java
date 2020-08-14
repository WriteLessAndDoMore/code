package com.xiangyang.crm.settings.service.impl;

import com.xiangyang.crm.settings.dao.UserDao;
import com.xiangyang.crm.settings.service.UserService;
import com.xiangyang.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {
    UserDao userDao = SqlSessionUtil.getSession().getMapper(UserDao.class);
}
