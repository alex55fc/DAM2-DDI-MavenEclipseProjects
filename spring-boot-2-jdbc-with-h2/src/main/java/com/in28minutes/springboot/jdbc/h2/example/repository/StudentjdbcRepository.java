package com.in28minutes.springboot.jdbc.h2.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.jdbc.h2.example.student.Student;

@Repository
public class StudentjdbcRepository {

	//Clase dentro de una clase 
    @Autowired
    JdbcTemplate jdbcTemplate;

    class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        	Student student = new Student();
            student.setid(rs.getLong("id"));
            student.setname(rs.getString("name"));
            student.setpassportnumber(rs.getString("passport_number"));
            return student;
        }
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student", new StudentRowMapper());
    }

    //@SuppressWarnings("deprecation")
	public Student findbyid(long id) {
        return jdbcTemplate.queryForObject("select * from student where id=?", new Object[]{id},
            new BeanPropertyRowMapper < Student > (Student.class));
    }
    
    public int deleteById(long id) {
        return jdbcTemplate.update("delete from student where id=?", new Object[]{id});
    }

    public int insert(Student student) {
        return jdbcTemplate.update("insert into student (id, name, passport_number) " + "values(?,  ?, ?)",
                new Object[]{student.getid(), student.getname(), student.getpassportnumber()});
    }

    public int update(Student student) {
        return jdbcTemplate.update("update student " + " set name = ?, passport_number = ? " + " where id = ?",
                new Object[]{student.getname(), student.getpassportnumber(), student.getid()});
    }
}
