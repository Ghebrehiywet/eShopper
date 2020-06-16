package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.model.Role;
import edu.miu.cs.cs425.eshopping.repository.RoleRepository;
import edu.miu.cs.cs425.eshopping.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Optional<Role> find(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role findByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    @Override
    public Role put(Role role) {
        return roleRepository.save(role);
    }
}
