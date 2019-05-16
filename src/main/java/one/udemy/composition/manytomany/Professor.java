package one.udemy.composition.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table(name="professor")
public class Professor {
    @Id
    @Column(name="id")
    @GeneratedValue
    private int professorId;
    
    @Column(name="professor_name")
    private String professorName;
    
    @ManyToMany(mappedBy="professors", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private List<ResearchProject> projects;

    public Professor() {
        this.projects = new ArrayList<>();
    }

    public Professor(String professorName) {
        this();
        this.professorName = professorName;
    }
    
    public void assignProjectToProf(ResearchProject project){
        this.projects.add(project);
    }
}