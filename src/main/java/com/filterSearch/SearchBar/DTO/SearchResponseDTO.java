package com.filterSearch.SearchBar.DTO;

import com.filterSearch.SearchBar.models.Location;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
public class SearchResponseDTO {

    private UUID supplier_id;
    private String bussiness_nature;
    private String manufacture_process;
    private String company_name;
    private String country;
    private String website;

}
