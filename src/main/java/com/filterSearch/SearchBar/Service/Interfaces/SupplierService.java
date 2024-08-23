package com.filterSearch.SearchBar.Service.Interfaces;


import com.filterSearch.SearchBar.DTO.SearchResponseDTO;
import com.filterSearch.SearchBar.DTO.searchInformationDTO;
import com.filterSearch.SearchBar.ExceptionHandling.LocationNotFoundException;
import com.filterSearch.SearchBar.ExceptionHandling.ManufacturesNotFound;
import com.filterSearch.SearchBar.models.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {
    List<SearchResponseDTO> findByFiltering(searchInformationDTO searchInformationDTO, Integer pageNumber, Integer pageSize) throws LocationNotFoundException, ManufacturesNotFound;



}
