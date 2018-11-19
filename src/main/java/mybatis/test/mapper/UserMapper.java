package mybatis.test.mapper;

import mybatis.test.domain.User;

public interface UserMapper {
    User selectByAccount(String account);
}
