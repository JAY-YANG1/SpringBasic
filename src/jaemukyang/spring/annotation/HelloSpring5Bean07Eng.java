package jaemukyang.spring.annotation;

import org.springframework.stereotype.Component;

import jaemukyang.spring.beans.HelloSpring5Bean03;

@Component("eng")
public class HelloSpring5Bean07Eng implements HelloSpring5Bean03{

	@Override
	public void sayHello(String msg) {
		System.out.println("Hello, " + msg);
	}


}
