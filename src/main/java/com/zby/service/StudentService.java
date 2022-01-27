package com.zby.service;

import com.zby.domain.Student;
import com.zby.vo.StudentAndClassroomVo;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public Student getById(String id);

    public void save(Student s);

    List<Student> getAll();

    List<Student> getName(String name);

    List<Student> select1(Student stu);

    List<Student> select2(String name);

    List<Student> select3(Student stu);

    List<Student> select4(String[] strArr);

    List<Map<String, Object>> select5();

    List<StudentAndClassroomVo> select6();
}
