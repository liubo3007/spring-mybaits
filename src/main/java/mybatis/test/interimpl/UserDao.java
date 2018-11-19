package mybatis.test.interimpl;

import mybatis.test.domain.User;
import mybatis.test.inter.IUserDao;
import mybatis.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getOneByAccount(String account) {
        return userMapper.selectByAccount(account);
    }
}
