package com.filterSearch.SearchBar.Service;

import com.filterSearch.SearchBar.DTO.SearchResponseDTO;
import com.filterSearch.SearchBar.DTO.searchInformationDTO;
import com.filterSearch.SearchBar.ExceptionHandling.LocationNotFoundException;
import com.filterSearch.SearchBar.ExceptionHandling.ManufacturesNotFound;
import com.filterSearch.SearchBar.InsertIntoDatabase.InsertIntoDatabase;
import com.filterSearch.SearchBar.Repository.LocationRepository;
import com.filterSearch.SearchBar.Repository.SupplierRepository;
import com.filterSearch.SearchBar.Service.Interfaces.SupplierService;
import com.filterSearch.SearchBar.models.Location;
import com.filterSearch.SearchBar.models.Supplier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private LocationRepository locationRepository;



    @Override
    public List<SearchResponseDTO> findByFiltering(searchInformationDTO searchInformationDTO, Integer pageNumber, Integer pageSize) throws LocationNotFoundException, ManufacturesNotFound {

        //pagination

        Pageable p = PageRequest.of(pageNumber, pageSize);

        Page<Supplier> pageSuppliers = this.supplierRepository.findByNatureOfBussinessAndManufacturingProcessesAndLocation_Country(searchInformationDTO.getNature(), searchInformationDTO.getManufacture(),searchInformationDTO.getCountry(), p);
        List<Supplier> suppliers = pageSuppliers.getContent();
        if(suppliers.isEmpty()){
            throw new ManufacturesNotFound("no manufactures found of this type");
        }

        // return list of responses
        return santizeInputDTO(searchInformationDTO, suppliers);

    }





    private List<SearchResponseDTO> santizeInputDTO(searchInformationDTO searchInformationDTO, List<Supplier>suppliers){

        List<SearchResponseDTO> l =new ArrayList<>();
        try{
            for (Supplier s : suppliers) {
                SearchResponseDTO searchResponseDTO = SearchResponseDTO.builder()
                        .supplier_id(s.getSupplier_id())
                        .bussiness_nature(s.getNatureOfBussiness())
                        .manufacture_process(s.getManufacturingProcesses())
                        .company_name(s.getCompanyName())
                        .country(s.getLocation().getCountry())
                        .website(s.getWebsite())
                        .build();
                l.add(searchResponseDTO);
            }

        }catch(Exception ex) {
            ex.printStackTrace();
            log.error("could not sanitze the dto");
        }
        return l;
    }



}
