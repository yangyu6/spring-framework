package goods.ioc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yu
 * @description:
 * @create: 2023-07-26 17:00
 **/
public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(test.class);
		Object test = context.getBean("test");
		System.out.println("大米饭成功了"+test);
	}



}
