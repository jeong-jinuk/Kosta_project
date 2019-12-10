package kr.or.kosta.mvc.exception;

import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

		@ExceptionHandler(Exception.class)
		public String myHandlerException(Exception e) {
			e.printStackTrace();
			String returnval;
			if(e instanceof UnsatisfiedServletRequestParameterException) {
				returnval ="error";
			}else {
				returnval="error2";
			}
			return returnval;
		}
}
