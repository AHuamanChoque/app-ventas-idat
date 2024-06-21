package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    private Double freight;
    private Date orderdate;
    private Date requireddate;
    private String shipaddress;
    private String shipcity;
    private String shipcountry;
    private String shipname;
    private Date shipdate;
    private String shippostalcode;
    private String shipregion;
    private Integer shipvia;

}
