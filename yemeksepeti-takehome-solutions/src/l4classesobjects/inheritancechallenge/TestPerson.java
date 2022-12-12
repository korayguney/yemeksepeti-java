package l4classesobjects.inheritancechallenge;

public class TestPerson {
    public static void main(String[] args) {
        // Test Student class
        Student student = new Student("Ayşe Yağmur", "Kozyatağı / İstanbul");
        student.addCourseGrade("CS535", 67);
        student.addCourseGrade("IT507", 88);
        student.addCourseGrade("AB456", 90);

        student.printGrades();

        System.out.println("Average grade of the courses : " + student.getAverageGrades());

        // Test Teacher class
        Teacher teacher = new Teacher("Kemal Türkeri", "Tuzla / İstanbul");
        System.out.println(teacher);
        String[] courses = {"IT535", "CS432", "YZ451", "CS432"};

        for (String c : courses) {
            if (teacher.addCourse(c)) {
                System.out.println(c + " added");
            } else {
                System.out.println(c + " not added");
            }
        }

        if (teacher.removeCourse("CS432")) {
            System.out.println("CS432 removed");
        } else {
            System.out.println("CS432 not removed");
        }

        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }

    }
}
