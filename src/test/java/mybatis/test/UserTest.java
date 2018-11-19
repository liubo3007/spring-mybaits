package mybatis.test;

import mybatis.test.domain.User;
import mybatis.test.inter.IUserDao;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath*:applicationContext.xml"
})
public class UserTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void testGetUser() {
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
//        userDao = ctx.getBean(IUserDao.class);
        User user = userDao.getOneByAccount("admin");
        assertNotNull(user);
        System.out.println(user);
    }
}
