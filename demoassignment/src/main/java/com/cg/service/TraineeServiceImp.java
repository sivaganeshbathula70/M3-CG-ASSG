package com.cg.service;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Entity.Trainee;
import com.cg.dao.TraineeImp;
@Service
public class TraineeServiceImp implements TraineeService {
@Autowired
TraineeImp u;
@Override
public void create(Trainee trainee)
{
	 boolean p = u.create(trainee);
	 if(p==true)
	 {
		 System.out.println("Successfully Added");
	 }
	 else
	 {
		 System.out.println("U Failed");
	 }
	 
}
@Override
public List<Trainee> reterive()
{
	List<Trainee>list = u.reterive();
	return list;
}
@Override
public void delete(int id)
{
	u.delete(id);
	
}
@Override
public Trainee findById(int id)
{
	return u.findById(id);
}

@Override
public void update(int id,String name,String domain,String location)
{
	u.update(id, name, domain, location);
}

}
