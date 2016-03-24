package com.example.webapi.dao;

import com.example.webapi.model.User;

public interface UserDao {
	User findByUserName(String username);
}
