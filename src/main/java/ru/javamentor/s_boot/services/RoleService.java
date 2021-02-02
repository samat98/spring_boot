package ru.javamentor.s_boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javamentor.s_boot.dao.RoleRepo;
import ru.javamentor.s_boot.model.Role;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepo roleDao;

    public Role getRoleById(Long id) {
        return roleDao.getOne(id);
    }
    public List<Role> getRolesList() {
        return roleDao.findAll();
    }
}
