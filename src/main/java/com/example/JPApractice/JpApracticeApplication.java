package com.example.JPApractice;

import com.example.JPApractice.dao.Userrepo;
import com.example.JPApractice.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpApracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpApracticeApplication.class, args);
		Userrepo userrepo = (Userrepo) context.getBean(Userrepo.class);

//		User user1 = new User();
//		user1.setName("Alex");
//		user1.setCity("Chicago");
//		user1.setStatus("Java Developer");
//
//		User user2 = new User();
//		user2.setName("joe");
//		user2.setCity("DC");
//		user2.setStatus("Pytyon Developer");
//
////		Saving single user
////		User user1 = userrepo.save(user);
////		System.out.println(user1);
////		User userRes = userrepo.save(userDetails1);
////		System.out.println(userRes);
//
////		Saving as a Multiple user
//		List <User> users = List.of(user1, user2);
//		Iterable <User> result = userrepo.saveAll(users);
//		System.out.println(result);


//	Updating the details of user
//		Optional<User> optional = userrepo.findById(2);
//		User user = optional.get();
//		System.out.println(user);
//
//		user.setName("Mickey");
//
//		User user1 = userrepo.save(user);
//		System.out.println(user1);

//		Iteration of each of the intity.
//		Iterable<User> itr = userrepo.findAll();
//
//		itr.forEach(user -> {
//			System.out.println(user);
//		});
//
//		userrepo.deleteById(102);

//		Data by name

//		List<User> users = userrepo.findByName("Alex");
//		users.forEach(user -> {
//			System.out.println(user);
//		});
//		List<User> users = userrepo.findByNameAndCity("Serif", "DC");

		Iterable<User> users = userrepo.findAll();
		users.forEach(user -> {
			System.out.println(user);
		});

	}

}
