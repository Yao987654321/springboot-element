package cn.lemon.demo.service;

import cn.lemon.demo.domain.User;

import java.util.List;

public interface IUserService {

  /**
   * 添加用户
   *
   * @param user
   * @return
   */
  User add(User user);


  /**
   * 删除用户
   *
   * @param id
   * @return
   */
  int delete(int id);


  /**
   * 查询所有用户
   *
   * @return
   */
  List<User> findAll();


  /**
   * 根据ID查询用户
   *
   * @param id
   * @return
   */
  User findById(Integer id);


  /**
   * 根据姓名查询所有用户
   *
   * @param name
   * @return
   */
  List<User> findByName(String name);


  /**
   * 查询行数
   *
   * @return
   */
  int getRowCount();


  /**
   * 分页查询所有用户
   *
   * @param startRows
   * @return
   */
  List<User> queryPage(Integer startRows);


  /**
   * 修改用户
   *
   * @param user
   * @return
   */
  int update(User user);


}
