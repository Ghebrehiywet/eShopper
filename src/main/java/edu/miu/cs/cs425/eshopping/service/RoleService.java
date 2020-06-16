package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> findAll();

    Role save(Role role);

    Optional<Role> find(Long id);

    Role findByRoleName(String roleName);

    Role put(Role role);
}
