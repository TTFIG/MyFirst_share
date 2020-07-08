package cn.itcyt.test;

import cn.itcyt.dao.UserDao;
import cn.itcyt.domain.QueryVo;
import cn.itcyt.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestMybatis {

    private InputStream in;
    private SqlSession session;
    private UserDao userDao;

    @Before
    public void init() throws IOException {
        //读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //生产SqlSession对象
        session = factory.openSession();
        //代理
        userDao = session.getMapper(UserDao.class);
    }

    @After
    public void destroy() throws IOException {

        //提交事务
        session.commit();
        //释放资源
        session.close();
        in.close();
    }
//查询所有
    @Test
    public void FindAll() throws IOException {
        //执行代理接口的方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void SaveUser(){
        User user = new User();
        user.setUsername("罗文浩");
        user.setAddress("福州仓山");
        user.setBirthday(new Date());
        user.setSex("男");

        //执行代理接口的方法
        userDao.saveUser(user);
    }
    @Test
    public void UpdateUser(){
        User user = new User();
        user.setId(41);
        user.setUsername("小谢");
        user.setAddress("北京市顺义区");
        user.setSex("女");
        user.setBirthday(new Date());
        userDao.updateUser(user);
    }
    @Test
    public void testDelete(){
        //5.执行删除方法
        userDao.deleteUser(48);
    }
    @Test
    public void testFindOne(){
        //5.执行查询一个方法
        User user = userDao.findById(49);
        System.out.println(user);
    }
    @Test
    public void testFindByName(){
        //根据名称模糊查询
        List<User> users =  userDao.findByName("%文%");
        for (User user : users) {
            System.out.println(user);
        }
    }
    /**
     * 测试查询总记录条数
     */
    @Test
    public void testFindTotal(){
        //5.执行查询一个方法
        int count = userDao.findTotal();
        System.out.println(count);
    }


    /**
     * 测试使用QueryVo作为查询条件
     */
    @Test
    public void testFindByVo(){
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        //5.执行查询一个方法
        List<User> users = userDao.findUserByVo(vo);
        for(User u : users){
            System.out.println(u);
        }
    }

}
