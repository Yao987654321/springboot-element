package cn.lemon.demo.service.impl;

import cn.lemon.demo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

  @Resource
  private UserServiceImpl userService;

  @Test
  public void add() {
    User user = new User();
    user.setName("马化腾");
    user.setAge(50);
    user.setSex("男");
    user.setAddress("深圳市腾讯");
    userService.add(user);
  }


  @Test
  public void delete() {
    userService.delete(16);
  }


  @Test
  public void findAll() {
    List<User> userList = userService.findAll();
    for (User user : userList) {
      System.out.println(user.getName() + user.getAddress());
    }
  }


  @Test
  public void findById() {
    User user = userService.findById(1);
    System.out.println(user.getName());
  }


  @Test
  public void findByName() {
    List<User> userList = userService.findByName("詹");
    for (User user : userList) {
      System.out.println(user.getAge() + user.getAddress());
    }
  }


  @Test
  public void getRowCount() {
    int i = userService.getRowCount();
    System.out.println(i);
  }


  @Test
  public void queryPage() {
    List<User> userList = userService.queryPage(1);
    for (User user : userList) {
      System.out.println(user.getName() + user.getAddress());
    }
  }


  @Test
  public void update() {
    User user = new User();
    user.setId(13);
    user.setName("科比");
    user.setAge(40);
    user.setSex("男");
    user.setAddress("洛杉矶湖人");
    userService.update(user);

    User user1 = userService.findById(13);
    System.out.println(user1.getName() + user1.getAddress());
  }
}
