package com.zby.service.impl;

import com.zby.dao.StudentDao;
import com.zby.domain.Student;
import com.zby.service.StudentService;
import com.zby.util.SqlSessionUtil;
import com.zby.vo.StudentAndClassroomVo;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> sList = studentDao.getAll();
        return sList;
    }

    @Override
    public List<Student> getName(String name) {
        List<Student> sList = studentDao.getName(name);
        return sList;
    }

    @Override
    public List<Student> select1(Student stu) {
        List<Student> sList = studentDao.select1(stu);
        return sList;
    }

    @Override
    public List<Student> select2(String name) {
        List<Student> sList = studentDao.select2(name);
        return sList;
    }

    @Override
    public List<Student> select3(Student stu) {
        List<Student> sList = studentDao.select3(stu);
        return sList;
    }

    @Override
    public List<Student> select4(String[] strArr) {
        List<Student> sList = studentDao.select4(strArr);
        return sList;
    }

    @Override
    public List<Map<String, Object>> select5() {
        List<Map<String, Object>> sList = studentDao.select5();
        return sList;
    }

    @Override
    public List<StudentAndClassroomVo> select6() {
        List<StudentAndClassroomVo> sList = studentDao.select6();
        return sList;
    }
}
