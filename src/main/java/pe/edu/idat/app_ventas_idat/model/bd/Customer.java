package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerid;
    private String address;
    private String city;
    private String companyname;
    private String contacname;
    private String contactname;
    private String contacttitle;
    private String country;
    private String fax;
    private String phone;
    private String postalcode;
    private String region;
}
