package org.example.entity.service;

public class DirectorBuilderCourse {
    private CourseBuilderService courseBuilderService;
    public DirectorBuilderCourse(CourseBuilderService courseBuilderService){
        this.courseBuilderService = courseBuilderService;
    }
    public void construct(){
        courseBuilderService.buildID(1);
        courseBuilderService.buildName("IOT");
    }
}
