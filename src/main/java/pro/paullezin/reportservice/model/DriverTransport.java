package pro.paullezin.reportservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class DriverTransport {
    private String id;
    private Timestamp created;
    private Timestamp modified;
    private Driver driver;
    private Transport transport;
    private Status status;
    private Action action;
}