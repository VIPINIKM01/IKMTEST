package Management.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import Management.demo.contract.DepartmentDto;
import Management.demo.contract.DepartmentdetailsDto;
import Management.demo.model.Department;
import Management.demo.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class DepartmentService {

   private final DepartmentRepository departmentRepository;
   public DepartmentdetailsDto departmentdetails(@RequestBody DepartmentDto departmentDto)
   {
    Department depart = new Department();
    DepartmentdetailsDto departdet =new DepartmentdetailsDto();

    depart.setDepartment_code(departmentDto.getDepartment_code());
    depart.setDepartment_name(departmentDto.getDepartment_name());
    depart.setDescription(departmentDto.getDescription());
    depart.setStatus(departmentDto.getStatus());

    depart=departmentRepository.save(depart);
    
    departdet.setId(depart.getId());
    departdet.setDepartment_code(depart.getDepartment_code());
    departdet.setDepartment_name(depart.getDepartment_name());
    departdet.setDescription(depart.getDescription());

     return departdet;
   }

      public DepartmentdetailsDto getBycode(String department_code) {
        Department department = departmentRepository.findBygetBycode(department_code);
    
   }



    
}
