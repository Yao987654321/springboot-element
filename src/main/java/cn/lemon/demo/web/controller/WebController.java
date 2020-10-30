package cn.lemon.demo.web.controller;

import cn.lemon.demo.domain.User;
import cn.lemon.demo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WebController {

  @Resource
  private UserServiceImpl userService;

  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public Integer delete(Integer id) {
    System.out.println(id);
    int result = userService.delete(id);
    return result;
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  @ResponseBody
  public String update(User user) {
    int result = userService.update(user);
    if (result >= 1) {
      return "修改成功";
    } else {
      return "修改失败";
    }

  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public User add(User user) {
    return userService.add(user);
  }

  @RequestMapping("/userList")
  @ResponseBody
  public List<User> userList() {
    return userService.findAll();
  }

  @RequestMapping("/findByName")
  @ResponseBody
  public List<User> findByName(String name) {
    return userService.findByName(name);
  }

  /**
   * 分页
   * @return
   */
  @RequestMapping(value="/page")
  @ResponseBody
  public List<User> page(Integer page){
    int pageNow = page == null ? 1 : page;
    int pageSize = 5;
    int startRows = pageSize*(pageNow-1);
    List<User> list = userService.queryPage(startRows);
    return list;
  }

  /**
   * rows
   * @return
   */
  @RequestMapping(value="/rows")
  @ResponseBody
  public int rows(){
    return userService.getRowCount();
  }
}
