package Harsh.Singh.ServiceRabbitMq.service;

import Harsh.Singh.ServiceRabbitMq.config.Publisher;
import Harsh.Singh.ServiceRabbitMq.model.Employee;
import Harsh.Singh.ServiceRabbitMq.model.EmployeeDTO;
import Harsh.Singh.ServiceRabbitMq.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIMPL implements EmployeeService{
    @Autowired
    private Publisher publisher;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void save(Employee empoloyee) {
        EmployeeDTO employeeDTO =new EmployeeDTO();
        employeeDTO.setEmail(empoloyee.getEmail());
        employeeDTO.setEmpName(empoloyee.getEmpName());
        try {
            employeeRepository.save(empoloyee);
            System.out.println("Message is sent toi rabbit mq also");
            publisher.sendMessageToRabbitmq(employeeDTO);
        }catch (Exception e){
            System.out.println("Error in Service "+e);
        }
    }
}
