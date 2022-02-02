package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

    void insert(Seller obj);
    void Update(Seller obj);
    void deleById(Integer id);
    Seller findById(Integer Id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
	List<Seller> findByDepartment(Department department, String name);
	List<Seller> findByDeartment(int department, String name);
}	
