package dao;

//import java.util.List;

//import org.gecedu.bean.PageInfo;
import dao.User;

public interface UserDao 
{

	/**
	 * ����
	 */
	int save(User user);
	/**
	 *����
	 */
//	void update(User user);
	/**
	 * ɾ��
	 * @param id  ����id
	 */

//	void deleteById(Integer id);
	/**
	 * ����id���ү�
	 * @param id  ����id
	 * @return  user�û�
	 */
	User queryByPhone(String phone);
	
	/**
	 * ȫ���û�
	 */
//	List<User> queryAll();
	
	/**
	 * ����
	 */
//	PageInfo queryByPages(Integer currentPage);
	
	/**
	 * �����û��˺����뷵���û���Ϣ
	 */
	User queryByAccountAndPwd(String phone, String password);


}
