package com.cg.dao;


import com.cg.entities.Employee;

public interface IEmployeeDao {
	Employee fetchById(int id);
}
