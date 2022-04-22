package com.company.Assignment12;

import java.util.ArrayList;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();

        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("=>Print the name of all departments in the college");
        StreamApiDemo.getDepartments(students);
        System.out.println();

        System.out.println("=>Get the names of all students who have enrolled after 2018");
        StreamApiDemo.getStudentsEnrolledAfter2018(students);
        System.out.println();

        System.out.println("=>Get the details of all male student in the computer sci department");
        StreamApiDemo.getMaleDetailsInCSE(students);
        System.out.println();

        System.out.println("=>How many male and female student are there ");
        StreamApiDemo.getMaleAndFemaleCount(students);
        System.out.println();

        System.out.println("=>What is the average age of male and female students");
        StreamApiDemo.getAverage(students);
        System.out.println();

        System.out.println("=>Get the details of highest student having highest percentage");
        StreamApiDemo.getStudentWithHighestPercentage(students);
        System.out.println();

        System.out.println("=>Count the number of students in each department");
        StreamApiDemo.getStudentsInEachDepartment(students);
        System.out.println();

        System.out.println("=>What is the average percentage achieved in each department");
        StreamApiDemo.getAveragePercentageInEachDepartment(students);
        System.out.println();

        System.out.println("=>Get the details of youngest male student in the Electronic department");
        StreamApiDemo.getDetailsOfYoungestMaleInElectronic(students);
        System.out.println();

        System.out.println("=>How many male and female students are there in the computer science department");
        StreamApiDemo.getMaleAndFemaleCountInCSE(students);
    }
}