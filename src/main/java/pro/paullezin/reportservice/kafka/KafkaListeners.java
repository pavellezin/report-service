package pro.paullezin.reportservice.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pro.paullezin.reportservice.model.DriverTransport;
import pro.paullezin.reportservice.repo.DriverTransportOrderRepo;

@Component
@AllArgsConstructor
@Slf4j
public class KafkaListeners {
    private final DriverTransportOrderRepo orderRepo;

    @KafkaListener(topics = "transport-order", groupId = "groupId")
    void listener (DriverTransport order){
        log.info(order.toString());
        orderRepo.save(order);
    }
}