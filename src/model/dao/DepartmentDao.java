package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

     void insert(Department obj);
     void Update(Department obj);
     void deleById(Integer id);
     Department findById(Integer id);
     List<Department> findAll();    
}