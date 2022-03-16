package pro.paullezin.reportservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
public class DriverLicense implements Serializable {
    private String id;
    private String number;
    private LocalDate expDate;
    private Set<Category> categories;
}