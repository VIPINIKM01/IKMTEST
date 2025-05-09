package Management.demo.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Department {

@Id
@GeneratedValue(strategy = GenerationType.UUID)


    private UUID id;
    private String department_code;
    private String department_name;
    private String description;
    private Boolean status;
    
}
