package ca.blackperl.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ca.blackperl.validation.annotation.Age;

public class AgeValidator implements ConstraintValidator<Age, String> {
  
  // http://www.slf4j.org/faq.html#declared_static
  private static final Logger log = LogManager.getLogger(AgeValidator.class);

  public void initialize(Age constraint) {
    log.info("initializing AgeValidator: ");
  };
  
  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    log.info("checking if it is valid: " + value);
    
    if ( value == null ) {
      log.info("value is null - return true" );
      return true;
    }
    
    // If we got here, we probably passed the other composite constraints
    log.info("value not null - return true" );
    return true;
  }

}

