package pro.paullezin.reportservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Transport implements Serializable {
    private String id;
    private String model;
    private String regnum;
    private Category category;
}