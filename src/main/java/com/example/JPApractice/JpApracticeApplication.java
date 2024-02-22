package com.example.JPApractice;

import com.example.JPApractice.dao.Userrepo;
import com.example.JPApractice.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpApracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpApracticeApplication.class, args);
		Userrepo userrepo = (Userrepo) context.getBean(Userrepo.class);

		User user = new User(  );
		user.setName("Alex");
		user.setCity("Chicago");
		user.setStatus("Java Developer");

		User user1 = userrepo.save(user);
		System.out.println(user1);

	}

}
