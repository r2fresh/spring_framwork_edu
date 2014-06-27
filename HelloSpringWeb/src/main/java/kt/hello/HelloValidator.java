package kt.hello;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class HelloValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		
		return HelloVo.class.isAssignableForm(clazz);
	}

	public void validate(Object arg0, Errors errors) {
		
		HelloVo vo = (HelloVo)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Field is Required");
	}

}