package com.capg.service;

import java.util.List;

import com.capg.entities.Trainee;
import org.springframework.stereotype.Component;

public interface ITraineeService {

	  void addTrainee(Trainee t);
	    void deleteTrainee(int id);
	    Trainee modifyTrainee(Trainee t);
	    Trainee fetchTrainee(int id);
	    boolean credentials(int id, String password);

}
