package cn.itcyt.test;

import cn.itcyt.dao.UserDao;
import cn.itcyt.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //生产SqlSession对象
        SqlSession session = factory.openSession();
        //代理
        UserDao userDao = session.getMapper(UserDao.class);
        //执行代理接口的方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //释放资源
        session.close();
        in.close();

    }

    @Test
    public void test(){
        System.out.println("中文乱码");
    }
}
