package com.capg.dao;

import com.capg.entities.Trainee;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class TraineeDaoImpl implements ITraineeDao{
    private Map<Integer,Trainee>store=new HashMap<>();
    private Map<Integer,Trainee>admin = new HashMap<>();
    
    public TraineeDaoImpl() {
    Trainee trainee = new Trainee();
    trainee.setId(1);
    trainee.setName("anirudh");
    trainee.setPassword("anirudh");
    trainee.setLocation("mumbai");
    admin.put(1,trainee);
    }
    
	@Override
	public void addTrainee(Trainee t) {
		store.put(t.getId(),t);
		
	}

	@Override
	public void deleteTrainee(int id) {
		 Trainee t = store.get(id);
    	 	 store.remove(t.getId());
    	}

	@Override
	public Trainee modifyTrainee(Trainee t) {
    	if(store.containsKey(t.getId())) {
    		store.put(t.getId(),t);
    	}
    	return t;
	}

	@Override
	public Trainee fetchTrainee(int id) {
		Trainee t = store.get(id);
		return t;
	}


    @Override
    public boolean credentials(int id, String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        Trainee trainee = admin.get(id);
        if (trainee == null) {
            return false;
        }
        return trainee.getPassword().equals(password);
    }

  
}
