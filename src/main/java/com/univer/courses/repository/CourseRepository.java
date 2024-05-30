package com.univer.courses.repository;
import com.univer.courses.model.CourseEntity;
import org.springframework.data.repository.CrudRepository;
public interface CourseRepository extends CrudRepository<CourseEntity, Long> {
}
