package com.yemeksepeti.comparator;

import com.yemeksepeti.comparable.ComparableStudent;

import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();

        Student student1 = new Student("Thomas Jefferson", 1111, 3.8);
        Student student2 = new Student("John Adams", 2222, 3.9);
        Student student3 = new Student("George Washington", 3333, 3.4);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList, sortName);
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("---------------------------");

        Collections.sort(studentList, sortGpa);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
