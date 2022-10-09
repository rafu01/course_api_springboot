package com.example.apitest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.apitest.Entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {
    
}
