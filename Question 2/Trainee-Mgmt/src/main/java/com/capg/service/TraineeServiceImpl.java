package com.capg.service;

import java.util.List;

import com.capg.dao.ITraineeDao;
import com.capg.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements ITraineeService{
    private ITraineeDao traineeDao;

    public ITraineeDao getEmployeeDao(){
        return traineeDao;
    }

    @Autowired
    public void setTraineeDao(ITraineeDao dao){
        this.traineeDao=dao;
    }

	@Override
	public void addTrainee(Trainee t) {
		traineeDao.addTrainee(t);
		
	}

	@Override
	public void deleteTrainee(int id) {
		traineeDao.deleteTrainee(id);
		
	}

	@Override
	public Trainee modifyTrainee(Trainee t) {
		Trainee trainee = traineeDao.modifyTrainee(t);
		return trainee;
	}

	@Override
	public Trainee fetchTrainee(int id) {
		Trainee t = traineeDao.fetchTrainee(id);
		return t;
	}

	@Override
	public boolean credentials(int id, String password) {
		boolean credential = traineeDao.credentials(id, password);
		return credential;
	}

    
}
