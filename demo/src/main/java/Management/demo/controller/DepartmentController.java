package Management.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Management.demo.Service.DepartmentService;
import Management.demo.contract.DepartmentDto;
import Management.demo.contract.DepartmentdetailsDto;
import Management.demo.model.Department;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Data
@RestController
@AllArgsConstructor
@RequestMapping("/api/depart")
public class DepartmentController {

    private  final DepartmentService departmentService;

    @PostMapping
    public DepartmentdetailsDto departmentdetails(@RequestBody DepartmentDto departmentDto) {
        
        
        return departmentService.departmentdetails(departmentDto);
    }


      @GetMapping("/{department_code}")
public DepartmentdetailsDto getByCode(@PathVariable String department_code) {
    return departmentService.getBycode(department_code);
}
    
}
