package ua.goit.schedule.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="audience")
public class Audience implements BaseEntity<Long>{

    private static final long serialVersionUID = 8988628177175548905L;
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private  String name;

}
