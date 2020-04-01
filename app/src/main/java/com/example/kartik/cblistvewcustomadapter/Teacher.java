package com.example.kartik.cblistvewcustomadapter;

import java.util.ArrayList;

public class Teacher {

    String name, course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public static ArrayList<Teacher> getTeacherdetails(){
         ArrayList<Teacher> teachersList= new ArrayList<Teacher>();
         teachersList.add(new Teacher("Kartik", "Java"));
        teachersList.add(new Teacher("Shivani", "a"));
        teachersList.add(new Teacher("Aman", "c"));
        teachersList.add(new Teacher("Radhika", "c"));
        teachersList.add(new Teacher("Deepak", "d"));
        teachersList.add(new Teacher("Bhavna", "e"));
        teachersList.add(new Teacher("Naman", "f"));
        return teachersList;
    }



}


