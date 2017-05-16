package edu.nuist.duanxun.guyongqiang.dao;

import edu.nuist.duanxun.guyongqiang.entity.Student;
import edu.nuist.duanxun.guyongqiang.util.JDBCUtil;

import java.sql.Connection;
import java.util.List;

/**
 * Created by John on 2017/5/16.
 */
public class StudentDao extends BaseDao implements IStudentDao {
    @Override
    public void add(Student student) {
        Connection connection = JDBCUtil.getConnection();
        String sql="INSERT into students  (account,name,password,study_nummber ,gender,phone,email,birthday,interest,birth_place ,introduction) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        this.update(connection,sql,student.getAccount(),student.getName(),student.getPassword(),student.getStudyNumber(),student.getGender(),student.getPhone(),student.getEmail(),student.getBirthday(),student.getInterest(),student.getIntroduction());
        JDBCUtil.releaseResources(null, null, connection);
    }

    @Override
    public void delete(int id) {
        Connection connection = JDBCUtil.getConnection();
        String sql="delete from students where id=?";
        this.update(connection,sql,id);
        JDBCUtil.releaseResources(null, null, connection);
    }

    @Override
    public void update(Student student) {
        Connection connection = JDBCUtil.getConnection();
        String sql="update students account=?,name=?,password=?,study_nummber=? ,gender=?,phone=?,email=?,birthday=?,interest=?,birth_place=?,introduction=? where id=?";
        this.update(connection,sql,student.getAccount(),student.getName(),student.getPassword(),student.getStudyNumber(),student.getGender(),student.getPhone(),student.getEmail(),student.getBirthday(),student.getInterest(),student.getIntroduction(),student.getId());
        JDBCUtil.releaseResources(null, null, connection);
    }

    @Override
    public Student get(int id) {
        Connection connection = JDBCUtil.getConnection();
        String sql="select id,account,name,password,study_number as studyNumber ,gender,phone,email,birthday,interest,birth_place as birthPlace,introduction from students where id=?";
        Student student=this.get(connection, Student.class, sql, id);
        JDBCUtil.releaseResources(null, null, connection);
        return student;
    }

    @Override
    public List<Student> getAll() {
        Connection connection = JDBCUtil.getConnection();
        String sql="select id,account,name,password,study_number as studyNumber ,gender,phone,email,birthday,interest,birth_place as birthPlace,introduction from students";
        List <Student> studentList=this.getAll(connection, Student.class, sql);
        JDBCUtil.releaseResources(null, null, connection);
        return studentList;
    }
}
