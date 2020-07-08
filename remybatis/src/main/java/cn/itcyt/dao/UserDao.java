package cn.itcyt.dao;

import cn.itcyt.domain.QueryVo;
import cn.itcyt.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
//    @Select("select * from user")
    //查询数据
    List<User> findAll();
    //添加数据
    void saveUser(User user);
    //更新数据
    void updateUser(User user);
    //删除数据
    void deleteUser(Integer userId);
    //根据id查询用户信息
    User findById(Integer userid);
    //根据名称模糊查询
    List<User> findByName(String username);
    // 查询总用户数
    int findTotal();
    //根据queryVo中的条件查询用户
    List<User> findUserByVo(QueryVo vo);

}
