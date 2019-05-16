package one.udemy.composition.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Jan
 */

@Entity
@Table(name="research_project")
public class ResearchProject {
    @Id
    @Column(name="project_id")
    @GeneratedValue
    private int projectId;
    
    @Column(name="project_name")
    private String projectName;
    
    @ManyToMany
    @JoinTable(name="prof_project",
            joinColumns=@JoinColumn(name="projectId"),
            inverseJoinColumns=@JoinColumn(name="professorId")) //foreign key
    private List<Professor> professors;

    public ResearchProject() {
        this.professors = new ArrayList<>();
    }

    public ResearchProject(String projectName) {
        this();
        this.projectName = projectName;
    }
    
    public void assignProfToProject(Professor professor){
        this.professors.add(professor);
    }
}