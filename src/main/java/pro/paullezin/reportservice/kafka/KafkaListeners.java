package pro.paullezin.reportservice.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListeners {

    @KafkaListener(topics = "transport-order", groupId = "groupId")
    void listener (String data){
        log.info(data);
    }
}