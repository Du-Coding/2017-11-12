package dao;

import java.util.List;

import pojo.Users;

/**
 * 
 * @author duke
 * @date 2017/11/10
 * @main ��ܽ��Ӧ��  �ӿ���
 *
 */

public interface UsersDAO {
	//��¼
	public boolean loginUsers(Users users) throws Exception; 
	//��ѯȫ��
	public List<Users> findAllUsers() throws Exception; 
}
