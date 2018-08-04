package pl.tim3er.challeng.list.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ChallengeDao {
    int id;
    String nazwa;
    String gitHubLink;
    String startTime;
    String stopTime;
    String category;


    @Override
    public String toString() {
        return "ChallengeDao{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", gitHubLink='" + gitHubLink + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public ChallengeDao(int id, String nazwa, String gitHubLink, String startTime, String stopTime, String category) {

        this.id = id;
        this.nazwa = nazwa;
        this.gitHubLink = gitHubLink;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.category = category;
    }
}
