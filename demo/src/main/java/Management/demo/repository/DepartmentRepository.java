package Management.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import Management.demo.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,UUID>
{
    
}
