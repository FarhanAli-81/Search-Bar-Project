package com.filterSearch.SearchBar.DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class searchInformationDTO {
     private String country;
     private String nature;
     private String manufacture;

}
