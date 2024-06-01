package uz.muhammadtrying.tourfirmproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.muhammadtrying.tourfirmproject.entity.Role;
import uz.muhammadtrying.tourfirmproject.entity.RoleName;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
    Role findByRoleNameEquals(RoleName roleName);
}
