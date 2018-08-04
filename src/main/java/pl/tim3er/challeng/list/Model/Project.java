package pl.tim3er.challeng.list.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@ToString
@Getter
@Setter
public class Project {
    String projectName;
    String projectDesctription;
    String githubLink;
    String projectType;
    List<String> projectTech;

    public Project(String projectName, String projectDesctription, String githubLink, String projectType, List<String> projectTech) {
        this.projectName = projectName;
        this.projectDesctription = projectDesctription;
        this.githubLink = githubLink;
        this.projectType = projectType;
        this.projectTech = projectTech;
    }
}
