package medical.mapper;

import java.util.List;

import medical.entity.User;

public interface UserMapper {
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUserById(int userId);
    public List<User> selectAllUser();
    public int selectUserByname(User user);
    public int selectUser(User user); 
	public User selectinfo(String username);
}
