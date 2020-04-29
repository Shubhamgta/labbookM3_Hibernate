package com.capg.dao;

import com.capg.entities.Trainee;
import java.util.*;

public interface ITraineeDao {

    void addTrainee(Trainee t);
    void deleteTrainee(int id);
    Trainee modifyTrainee(Trainee t);
    Trainee fetchTrainee(int id);
    boolean credentials(int id, String password);

}
