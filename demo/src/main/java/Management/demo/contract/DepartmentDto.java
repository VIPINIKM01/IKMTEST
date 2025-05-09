package Management.demo.contract;

import java.util.UUID;


import lombok.Data;
@Data

public class DepartmentDto {
    
    private UUID id;
    private String department_code;
    private String department_name;
    private String description;
    private Boolean status;


}
