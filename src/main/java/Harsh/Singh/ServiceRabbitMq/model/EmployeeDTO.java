package Harsh.Singh.ServiceRabbitMq.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor@NoArgsConstructor
@ToString
public class EmployeeDTO {

    private String empName;
    private String email;

}
