package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Admin;

import java.util.List;


public interface AdminService {

    List<Admin> findAll();

    List<Admin> getAllAdmin();

    Admin save(Admin buyer);

    Admin find(Long id);

    Admin findByEmail(String email);

    Admin put(Admin buyer);
}