package com.cop.mobi.account.service;

import com.cop.mobi.account.entity.User;
import com.cop.mobi.car.entity.MyCar;
import com.cop.mobi.common.Result;

public interface AccountService {

	Result login(User user);

	Result register(User user, MyCar myCar);
}
