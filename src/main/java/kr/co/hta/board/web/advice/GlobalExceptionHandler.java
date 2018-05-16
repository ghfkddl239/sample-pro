package kr.co.hta.board.web.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import kr.co.hta.board.exception.SimpleBoardException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SimpleBoardException.class)
	public String HandleException(SimpleBoardException ex) {
		ex.printStackTrace();
		return "error/500.jsp";
	}
	
	@ExceptionHandler(Exception.class)
	public String HandleException(Exception ex) {
		ex.printStackTrace();
		return "error/500.jsp";
	}
}
