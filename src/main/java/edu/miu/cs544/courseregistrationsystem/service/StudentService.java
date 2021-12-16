package edu.miu.cs544.courseregistrationsystem.service;

import java.util.List;

import edu.miu.cs544.courseregistrationsystem.model.*;

public interface StudentService {
	List<Student> getAll();
	Student save(Student t);
	Student get(Long id);
    void delete(Long id);
	List<Student> findByRegistrationEvent(long registrationEventId);
}
