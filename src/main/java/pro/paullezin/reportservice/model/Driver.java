package pro.paullezin.reportservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Driver implements Serializable {
    private String id;
    private String name;
    private DriverLicense license;
}