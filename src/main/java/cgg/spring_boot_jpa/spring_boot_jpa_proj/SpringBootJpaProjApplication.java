package cgg.spring_boot_jpa.spring_boot_jpa_proj;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import cgg.spring_boot_jpa.spring_boot_jpa_proj.dao.userRepository;
import cgg.spring_boot_jpa.spring_boot_jpa_proj.entities.User;

@SpringBootApplication
public class SpringBootJpaProjApplication {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringBootJpaProjApplication.class, args);

		userRepository bean = ap.getBean(userRepository.class);

		User u1 = new User();

		u1.setName("bin");
		u1.setCity("arm");
		u1.setStatus("stud");

		User u2 = new User();

		u2.setName("jhon");
		u2.setCity("nyc");
		u2.setStatus("emp");

		List<User> users = List.of(u1, u2);
		// bean.saveAll(users);
		// users.forEach(System.out::println);
		System.out.println("____________________________");

		// update users
		// Optional<User> byId = bean.findById(2);

		// System.out.println(byId);

		// User u3 = byId.get();
		// u3.setCity("la");

		// bean.save(u3);
		System.out.println("____________________________");

		// retrival

		// Iterable<User> all = bean.findAll();

		// List<User> byName = bean.findByNameAndCity("bin", "arm");
		// List<User> allUsers = bean.getUserByName("bin");
		List<User> allusers = bean.getUsers();
		allusers.forEach(System.out::println);
		// all.forEach(System.out::println);
		System.out.println("____________________________");
		//// deleting
		// bean.deleteById(2);
		// Iterable<User> all = bean.findAll();
		// all.forEach(s -> System.out.println(s));
		// bean.deleteAll();
		// System.out.println("delted succesfully");

	}

}
