package com.example.apitest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apitest.Dao.CourseDao;
import com.example.apitest.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int id) {
        return courseDao.getReferenceById(id);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }
    @Override
    public Course updateCourse(Course course){
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(int id) {
        Course course = courseDao.getReferenceById(id);
        courseDao.delete(course);
    }
    
}
