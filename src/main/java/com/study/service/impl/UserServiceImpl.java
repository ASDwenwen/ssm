package com.study.service.impl;

import com.study.admin.pojo.User;
import com.study.dao.service.impl.BaseServiceImpl;
import com.study.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Administrator
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
}
