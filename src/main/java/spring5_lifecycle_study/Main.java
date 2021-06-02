package spring5_lifecycle_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring5_lifecycle_study.config.AppCix;
import spring5_lifecycle_study.spring.Client;
import spring5_lifecycle_study.spring.Client2;

public class Main {

	public static void main(String[] args) {
	try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCix.class)){
		Client client = ctx.getBean(Client.class);
		client.setHost("host");
		client.send();
		System.out.println();
		Client2 client2 = ctx.getBean(Client2.class);
		client2.setHost("host");
		client2.send();
		
	}

	}

}
