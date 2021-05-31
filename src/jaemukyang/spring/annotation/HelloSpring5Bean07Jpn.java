package jaemukyang.spring.annotation;

import org.springframework.stereotype.Component;

import jaemukyang.spring.beans.HelloSpring5Bean03;

@Component("jpn")
public class HelloSpring5Bean07Jpn implements HelloSpring5Bean03{

	@Override
	public void sayHello(String msg) {
		System.out.println("こんにちは, " + msg);
	}


}
