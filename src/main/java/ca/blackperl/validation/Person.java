package ca.blackperl.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
  // http://www.slf4j.org/faq.html#declared_static
  private static final Logger log = LogManager.getLogger(Person.class);

  private int age;
  private String name;
}

