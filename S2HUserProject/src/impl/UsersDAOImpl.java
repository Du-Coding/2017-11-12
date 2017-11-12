package impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Users;
import util.HibernateSessionFactory;
import dao.UsersDAO;

/**
 * 
 * @author duke
 * @date 2017/11/10
 * @main 框架结合应用 接口实现类
 *
 */

public class UsersDAOImpl implements UsersDAO {

	private Session session = null;
	private Transaction tran = null;
	
	//构造方法，得到事务对象
	public UsersDAOImpl(){
		
		session = HibernateSessionFactory.getSession();
		tran = session.beginTransaction();
		
	}
	
	@Override
	public boolean loginUsers(Users users) throws Exception {
		
		String sql = "from Users where uname = ? and upwd = ?";
		
		Query query = session.createQuery(sql);
		query.setString(0, users.getUname());
		query.setString(1, users.getUpwd());
		
		List<Users> list = query.list();
		tran.commit();
		
		if(list.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}

	@Override
	public List<Users> findAllUsers() throws Exception {
		
		String sql = "from Users";
		Query query = session.createQuery(sql);
		List<Users> list = query.list();
		tran.commit();
		return list;
	}
	
}
