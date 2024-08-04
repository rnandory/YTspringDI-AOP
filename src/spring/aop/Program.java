package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context
//		= new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		= new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		Exam exam = (Exam)context.getBean("exam");
		
		System.out.printf("totoal is %d\n", exam.total());
		System.out.printf("avg is %f\n", exam.avg());
		
		/*
		 * Exam exam = new NewlecExam(1, 1, 1, 1);
		 * 
		 * // invocation handler라는 인터페이스를 구현한 클래스를 객체화하는 작업 필요 // 익명객체로 Exam proxy =
		 * (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[]
		 * { Exam.class }, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * // 곁다리 long start = System.currentTimeMillis();
		 * 
		 * // 주업무 Obje ct result = method.invoke(exam, args);
		 * 
		 * // 곁다리 long end = System.currentTimeMillis();
		 * 
		 * String message = (end - start) + "ms 시간이 걸렸습니다.";
		 * System.out.println(message);
		 * 
		 * return result; } } );
		 */


	}

}
