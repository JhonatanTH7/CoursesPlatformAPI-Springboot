package com.Platform.Courses.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Platform.Courses.domain.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
