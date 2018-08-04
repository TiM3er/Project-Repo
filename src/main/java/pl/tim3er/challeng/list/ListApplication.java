package pl.tim3er.challeng.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import pl.tim3er.challeng.list.Dao.IChallenge;
import pl.tim3er.challeng.list.Model.Project;

import java.util.List;

@SpringBootApplication
public class ListApplication implements CommandLineRunner {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    IChallenge iChallenge;

    public static void main(String[] args) {
        SpringApplication.run(ListApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Project> projects = iChallenge.projectList();
        for (Project project : projects) {
            System.out.println(project.toString());
        }

    }

}
