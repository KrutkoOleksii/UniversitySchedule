package ua.goit.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.goit.schedule.model.Lecture;

public interface LectureRepository extends JpaRepository<Lecture,Long> {
}
