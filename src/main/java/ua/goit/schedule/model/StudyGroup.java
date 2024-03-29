package ua.goit.schedule.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties({"students"})
@Table(name="study_group")
public class StudyGroup implements BaseEntity<Long>{

    private static final long serialVersionUID = -361503220932482353L;
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private  String name;

    @OneToMany(mappedBy = "studyGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Student> students;

    @Override
    public Long getId() {
        return id;
    }

}
