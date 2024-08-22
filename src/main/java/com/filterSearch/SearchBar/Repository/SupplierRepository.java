package com.filterSearch.SearchBar.Repository;

import com.filterSearch.SearchBar.models.Location;
import com.filterSearch.SearchBar.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, UUID> {

    public List<Supplier> findByNatureOfBussinessAndManufacturingProcessesAndLocation_Country(String natureOfBussiness, String manufacturingProcesses, String country);
}
