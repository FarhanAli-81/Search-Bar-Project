package com.filterSearch.SearchBar.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "supplier")
@Data
public class Supplier {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    private UUID supplier_id;

    @Column(name="company_name")
    private String companyName;

    private String website;

    @OneToOne(targetEntity = Location.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "location_ref_id",referencedColumnName = "location_id")
    private Location location;

    @Column(name = "nature_of_bussiness")
    private String natureOfBussiness;  // small_scale, medium_scale, large_scale

   @Column(name= "manufacturing_processes")
    private String manufacturingProcesses; // moulding, 3d_printing, casting, coating
}
