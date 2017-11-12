package dao;

import java.util.List;

import pojo.Users;

/**
 * 
 * @author duke
 * @date 2017/11/10
 * @main 框架结合应用  接口类
 *
 */

public interface UsersDAO {
	//登录
	public boolean loginUsers(Users users) throws Exception; 
	//查询全部
	public List<Users> findAllUsers() throws Exception; 
}
