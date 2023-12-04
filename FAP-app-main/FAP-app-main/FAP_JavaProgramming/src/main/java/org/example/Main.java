package org.example;
import org.example.entity.*;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.Observer;
import org.example.interfaces.UpdateInfoRequest;
import org.example.entity.service.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Singleton - Creation1====================================== tạo tài khoản nếu có thì sẽ hiện, chạy 1 luồng
        Teacher teacher = new Teacher(1,"Dinh Van Dong");
        TeacherService.getInstance().insert(teacher);


        //===================================================================================
        // Factory Method == Creational2 Pattern gửi tin nhắn hàng loạt
        NotifyInterface notifyStudent = AccountFactory.createNotification("Student");
        notifyStudent.notification();

        NotifyInterface notifyTeacher = AccountFactory.createNotification("Teacher");
        notifyTeacher.notification();

        NotifyInterface notifyParent = AccountFactory.createNotification("Parent");
        notifyParent.notification();
        //========================================================================= contructor nhỏ
        // Builder Pattern == Creation 3
        CourseBuilderService courseBuilderService = new CourseBuilderService();
        DirectorBuilderCourse directorBuilderCourse = new DirectorBuilderCourse(courseBuilderService);
        directorBuilderCourse.construct();



        //=================================================================================== trung gian
       // Adapter ========Structural1 Pattern
        UpdateInfoRequest updateInfoRequest = new AdminService(TeacherService.getInstance());
        updateInfoRequest.updateInfoTeacher(teacher);


        //Facade == Structural2 Pattern tổng hợp các phương thức thêm sửa xóa

        FacadeService facadeService = new FacadeService();
        facadeService.operationDeleteTeacher(1);


        //Composite Pattern == Structure 3 lớp tree
        Department computerScience = new Department("Computer Science");
        DepartmentService departmentService = new DepartmentService("Btec");
        departmentService.addUnit(computerScience);
        departmentService.displayDetails();

        // Iterator ============Behavior1 ==================================================== đọc thông tin

        Student student1 = new Student(1,"Anh");
        Student student2 = new Student(2, "Trang");
        Student student3 = new Student(3,"Kien");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }


        //============================================== thùng rác
        //Memento Pattern == Behavior 2
        System.out.println("--------- MEMENTO Pattern");

        ClassroomHistory history = new ClassroomHistory();
        ClassroomService classroomService = new ClassroomService();
        history.saveMemento(classroomService.save());
        classroomService.displayStudents();
        //delete 1 student
        history.saveMemento(classroomService.delete());
        // Restoring to previous state
        System.out.println("---Restoring to previous state---");
        classroomService.restore(history.getMemento());
        classroomService.displayStudents();


        //================================================= facebook
        System.out.println("--------- Observer Pattern");

        StudentService repeatedStudents   = new StudentService();
        Observer observer = new StudentListObserver();

        repeatedStudents.addStudent();
        repeatedStudents.register(observer);

        repeatedStudents.unregister(observer);
        repeatedStudents.removeStudent();

    }
}
