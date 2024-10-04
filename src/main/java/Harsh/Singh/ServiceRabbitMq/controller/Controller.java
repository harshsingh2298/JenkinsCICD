package Harsh.Singh.ServiceRabbitMq.controller;

import Harsh.Singh.ServiceRabbitMq.model.Employee;
import Harsh.Singh.ServiceRabbitMq.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin("*")
public class Controller {


    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/save")
    public void saveUser(@RequestBody Employee employee){
        try {
            employeeService.save(employee);
        }catch (Exception e){
            System.out.println("Error in controller"+ e);
        }
    }

}
