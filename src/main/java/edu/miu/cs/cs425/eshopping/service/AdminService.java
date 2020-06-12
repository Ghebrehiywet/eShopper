package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Admin;

import java.util.List;


public interface AdminService {

    public List<Admin> findAll();

    public List<Admin> getAllAdmin();

    public Admin save(Admin buyer);

    public Admin find(Long id);

    public Admin findByEmail(String email);

    public Admin put(Admin buyer);
}