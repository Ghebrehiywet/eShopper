package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
     Role findByRoleName(String roleName);
     List<Role> findAll();
}
