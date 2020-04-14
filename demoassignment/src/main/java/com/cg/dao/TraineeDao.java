package com.cg.dao;

import java.util.List;

import com.cg.Entity.Trainee;

public interface TraineeDao {
	
	public boolean create(Trainee trianee);

	public List<Trainee> reterive();

	public Trainee findById(int id);

	public void delete(int id);

	public void update(int id,String name,String domain,String location);

}
