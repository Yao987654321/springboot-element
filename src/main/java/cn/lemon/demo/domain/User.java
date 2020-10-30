package cn.lemon.demo.domain;

import java.io.Serializable;

/**
 * user 实体类
 */
public class User{

  private String address;
  private int age;
  private int id;
  private String name;
  private String sex;

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    this.age = age;
  }


  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }


  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "User{" +
        "address='" + address + '\'' +
        ", age=" + age +
        ", id=" + id +
        ", name='" + name + '\'' +
        ", sex='" + sex + '\'' +
        '}';
  }
}
