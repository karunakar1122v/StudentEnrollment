package com.github.elizabetht.service;

import com.github.elizabetht.model.StudentInterface;

public interface StudentService {
	//test
	StudentInterface save(StudentInterface student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
