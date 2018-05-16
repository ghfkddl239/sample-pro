package kr.co.hta.board.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RequestMapping;

/*
@Target(ElementType.TYPE) // 클래스
@Target(ElementType.CONSTRUCTOR) // 생성자
@Target(ElementType.FIELD)	// 변수
@Target(ElementType.METHOD)	// 메소드
*/
// 매개변수
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 정보가 해석되는 시점
@Documented // 문서에 어노테이션 정보를 표시
public @interface LoginUser {

}
