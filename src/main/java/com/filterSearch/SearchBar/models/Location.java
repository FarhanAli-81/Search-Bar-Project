package com.filterSearch.SearchBar.models;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;


@Data
@Builder(toBuilder = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    private UUID location_id;
    private String country;
    private String state;
    private String city;
    private String pincode;
}
