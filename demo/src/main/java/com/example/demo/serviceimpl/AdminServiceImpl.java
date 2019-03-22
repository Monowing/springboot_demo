package com.example.demo.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;

@Transactional
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository	adminRepository;

	@Override
	public List<Admin> findList() {
		Iterable<Admin> findAll = adminRepository.findAll();
		return (List<Admin>) findAll;
	}

	
}
