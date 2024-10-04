package Harsh.Singh.ServiceRabbitMq.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    private String empName;

    private String empPhone;

    private String email;



}
