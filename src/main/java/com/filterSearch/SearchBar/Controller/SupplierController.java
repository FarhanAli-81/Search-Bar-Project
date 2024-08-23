package com.filterSearch.SearchBar.Controller;


import com.filterSearch.SearchBar.DTO.SearchResponseDTO;
import com.filterSearch.SearchBar.DTO.searchInformationDTO;
import com.filterSearch.SearchBar.ExceptionHandling.LocationNotFoundException;
import com.filterSearch.SearchBar.ExceptionHandling.ManufacturesNotFound;
import com.filterSearch.SearchBar.Service.Interfaces.SupplierService;
import com.filterSearch.SearchBar.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/search")
    public ResponseEntity<List<SearchResponseDTO>> fetchSupplierByFilter(@RequestBody searchInformationDTO searchInformationDTO,
                                                                         @RequestParam(value ="pageNumber", defaultValue = "1", required = false) Integer pageNumber,
                                                                         @RequestParam(value = "pageSize" , defaultValue = "5", required = false) Integer pageSize
                                                                         ) throws ManufacturesNotFound, LocationNotFoundException {
        List<SearchResponseDTO> searchResponseDTOList = supplierService.findByFiltering(searchInformationDTO, pageNumber, pageSize);
        return ResponseEntity.ok(searchResponseDTOList);
    }





}
