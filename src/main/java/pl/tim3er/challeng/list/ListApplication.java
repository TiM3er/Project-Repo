package pl.tim3er.challeng.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ListApplication implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ListApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		List<Project> projects = projectList();
//		for (Project project : projects) {
//			System.out.println(project.toString());
//		}

	}

}
