package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;


@Repository
public interface AdminRepository extends PagingAndSortingRepository<Admin, Long> {

}
