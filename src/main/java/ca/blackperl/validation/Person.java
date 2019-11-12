package ca.blackperl.validation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ca.blackperl.validation.annotation.Age;

public class Person {
  
  @NotNull
  @Age
  private int age;
  
  @NotNull
  @Size(min=4, max=32)
  private String name;
  
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}

