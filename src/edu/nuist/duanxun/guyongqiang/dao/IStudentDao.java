package edu.nuist.duanxun.guyongqiang.dao;

import edu.nuist.duanxun.guyongqiang.entity.Student;

import java.util.List;

/**
 * Created by John on 2017/5/16.
 */
public interface IStudentDao  {
    public void add(Student student) ;

    public void delete(int id)  ;

    public void update(Student student) ;

    public Student get(int id);

    public List<Student> getAll();
}
