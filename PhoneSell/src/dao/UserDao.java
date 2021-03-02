package dao;

//import java.util.List;

//import org.gecedu.bean.PageInfo;
import dao.User;

public interface UserDao 
{

	/**
	 * 保存
	 */
	int save(User user);
	/**
	 *更新
	 */
//	void update(User user);
	/**
	 * 删除
	 * @param id  个人id
	 */

//	void deleteById(Integer id);
	/**
	 * 根据id查找
	 * @param id  个人id
	 * @return  user用户
	 */
	User queryByPhone(String phone);
	
	/**
	 * 全部用户
	 */
//	List<User> queryAll();
	
	/**
	 * ？
	 */
//	PageInfo queryByPages(Integer currentPage);
	
	/**
	 * 根据用户账号密码返回用户信息
	 */
	User queryByAccountAndPwd(String phone, String password);


}
