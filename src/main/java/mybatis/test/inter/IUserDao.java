package mybatis.test.inter;

import mybatis.test.domain.User;

public interface IUserDao {
    public User getOneByAccount(String account);
}
