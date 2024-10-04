package Harsh.Singh.ServiceRabbitMq.config;

import Harsh.Singh.ServiceRabbitMq.model.EmployeeDTO;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private RabbitTemplate rabbitTemplate;
    private DirectExchange exchange;
    @Autowired
    public Publisher(RabbitTemplate rabbitTemplate, DirectExchange exchange) {
        this.rabbitTemplate = rabbitTemplate;
        this.exchange = exchange;
    }
    public void sendMessageToRabbitmq(EmployeeDTO employeeDTO){
        rabbitTemplate.convertAndSend(exchange.getName(),"routing_key",employeeDTO);
    }
}
