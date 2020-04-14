package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.*;
import com.cg.service.*;


@RestController
@RequestMapping("/trainee")

public class controller {
@Autowired
TraineeServiceImp uuu;
@PostMapping("/trainer")
public ResponseEntity<Object> saveBook(@RequestBody Trainee tr) {
    uuu.create(tr);
	return new ResponseEntity<>(HttpStatus.OK);
}
@GetMapping("/gettrainer")
public ResponseEntity<List<Trainee>> getTrainerList() {
	List<Trainee>lu = uuu.reterive();
	return new ResponseEntity<List<Trainee>>(lu,HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<Object> deleteTrainer(@PathVariable("id") int id)
{
	 uuu.delete(id);
	return new ResponseEntity<>("Deleted",HttpStatus.OK);
}
@GetMapping("/view/{id}")
public ResponseEntity<Trainee> viewTrainer(@PathVariable("id") int id)
{
	Trainee tru = uuu.findById(id);
	return new ResponseEntity<Trainee>(tru,HttpStatus.OK);
}
@PutMapping("/update/{id}")
public ResponseEntity<Object> updateTrainer(@PathVariable("id") int id,@RequestBody Trainee tr)
{
	uuu.update(id, tr.getTraineeName(), tr.getTraineeDomain(), tr.getTraineeLocation());
	return new ResponseEntity<>(HttpStatus.OK);
}


}
