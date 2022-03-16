package pro.paullezin.reportservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import pro.paullezin.reportservice.model.DriverTransport;

public interface DriverTransportOrderRepo extends MongoRepository<DriverTransport, String> {
}
