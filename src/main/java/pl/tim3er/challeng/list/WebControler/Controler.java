package pl.tim3er.challeng.list.WebControler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.tim3er.challeng.list.Dao.DataBaseControler;
import pl.tim3er.challeng.list.Dao.IChallenge;
import pl.tim3er.challeng.list.Model.Project;

import java.util.List;


@Controller
public class Controler {

    @Autowired
    private IChallenge iChallenge;

    public  void Controler(){
        DataBaseControler dataBaseControler = new DataBaseControler();
    }

    @RequestMapping(value = "/")
    public String home(Model model) {
        List<Project> projects = iChallenge.projectList();
        model.addAttribute("ProjectLisr",projects );
        return "index";
    }
    @RequestMapping(value = "/test")
    public String test() {

        return "test";
    }



}
