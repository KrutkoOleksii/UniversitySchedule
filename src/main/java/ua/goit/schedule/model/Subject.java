package ua.goit.schedule.model;

public class Subject implements BaseEntity<Long>{

    private Long id;
    private String name;

    @Override
    public Long getId() {
        return id;
    }
}
