package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierid;
    private String address;
    private String city;
    private String companyname;
    private String contactname;
    private String contacttitle;
    private String country;
    private String fax;
    private String homepage;
    private String phone;
    private String postalcode;
    private String region;

}
