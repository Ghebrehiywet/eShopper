package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    public List<Role> findAll();
    public Role save(Role role);
    public Optional<Role> find(Long id);
    public Role findByRoleName(String roleName);
    public Role put(Role role);
}
