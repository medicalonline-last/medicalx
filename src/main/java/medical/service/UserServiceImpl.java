package medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medical.entity.User;
import medical.mapper.UserMapper;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper usermapper;
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.insertUser(user);
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.updateUser(user);
	}

	public int deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return usermapper.deleteUserById(userId);
	}

	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return usermapper.selectAllUser();
	}

	public int selectUserByname(User user) {
		// TODO Auto-generated method stub
		return usermapper.selectUserByname(user);
	}

	public int selectUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.selectUser(user);
	}
	public User selectinfo(String username) {
		// TODO Auto-generated method stub
		return usermapper.selectinfo(username);
	}
  
}
