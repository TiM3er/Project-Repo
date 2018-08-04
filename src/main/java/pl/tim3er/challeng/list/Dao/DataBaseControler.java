package pl.tim3er.challeng.list.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import pl.tim3er.challeng.list.Model.Project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataBaseControler implements IChallenge {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Project> projectList (){
        String sql = "select project.pro_name,project.desctiption,project.githublink, typ_pro.type_name,technology.tech_name FROM project,typ_pro,technology,project_technology where project.typ_pro_id_type = typ_pro.id_type and project.id_pro = project_technology.project_id_pro and technology.id_tech = project_technology.technology_id_tech; ";

        List<Project> projects = jdbcTemplate.query(sql, new ResultSetExtractor<List<Project>>() {
            @Nullable
            @Override
            public List<Project> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<Project> projectList = new LinkedList<>();
                while (resultSet.next()){
                    String projectName =resultSet.getString(1);
                    String projectDesctription=resultSet.getString(2);
                    String githubLink=resultSet.getString(3);
                    String projectType=resultSet.getString(4);
                    List<String> tech = new LinkedList<>();
                    do {
                        tech.add(resultSet.getString(5));
                    }while (resultSet.next() && resultSet.getString(1).equals(projectName));
                    projectList.add(new Project(projectName,projectDesctription,githubLink,projectType,tech));
                }
                return projectList;
            }
        });
        return projects;
    }
}
