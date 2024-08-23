package com.filterSearch.SearchBar.InsertIntoDatabase;

import com.filterSearch.SearchBar.Repository.SupplierRepository;
import com.filterSearch.SearchBar.models.Location;
import com.filterSearch.SearchBar.models.Supplier;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InsertIntoDatabase {

    @Autowired
    private SupplierRepository supplierRepository;


    @PostConstruct
    public void insertData() {
        Location l1 = Location.builder().state("Telangana").city("Hyderabad").country("India").pincode("500036").build();
        Location l2 = Location.builder().state("Karnataka").city("Bangalore").country("India").pincode("560001").build();
        Location l3 = Location.builder().state("Maharashtra").city("Mumbai").country("India").pincode("400001").build();
        Location l4 = Location.builder().state("Delhi").city("New Delhi").country("India").pincode("110001").build();
        Location l5 = Location.builder().state("New York").city("New York").country("USA").pincode("10001").build();
        Location l6 = Location.builder().state("Texas").city("Austin").country("USA").pincode("73301").build();
        Location l7 = Location.builder().state("Gujarat").city("Ahmedabad").country("India").pincode("380001").build();
        Location l8 = Location.builder().state("Quebec").city("Montreal").country("Canada").pincode("H1A 0A1").build();
        Location l11 = Location.builder().state("Rajasthan").city("Jaipur").country("India").pincode("302001").build();
        Location l12 = Location.builder().state("West Bengal").city("Kolkata").country("India").pincode("700001").build();
        Location l13 = Location.builder().state("Uttar Pradesh").city("Lucknow").country("India").pincode("226001").build();
        Location l14 = Location.builder().state("Punjab").city("Ludhiana").country("India").pincode("141001").build();
        Location l15 = Location.builder().state("Tamil Nadu").city("Coimbatore").country("India").pincode("641001").build();


        Supplier s1 = Supplier.builder().website("www.abcmanufacturing.com").location(l1).manufacturingProcesses("casting").natureOfBussiness("small_scale").companyName("ABC Manufacturing").build();
        Supplier s2 = Supplier.builder().website("www.castingmasters.com").location(l2).manufacturingProcesses("casting").natureOfBussiness("medium_scale").companyName("Casting Masters").build();
        Supplier s3 = Supplier.builder().website("www.3dinnovators.com").location(l3).manufacturingProcesses("3d_printing").natureOfBussiness("small_scale").companyName("3D Innovators").build();
        Supplier s4 = Supplier.builder().website("www.coatingtech.com").location(l4).manufacturingProcesses("coating").natureOfBussiness("large_scale").companyName("Coating Tech").build();
        Supplier s5 = Supplier.builder().website("www.mouldingpro.com").location(l5).manufacturingProcesses("moulding").natureOfBussiness("medium_scale").companyName("Moulding Pro").build();
        Supplier s6 = Supplier.builder().website("www.industrial3d.com").location(l6).manufacturingProcesses("3d_printing").natureOfBussiness("large_scale").companyName("Industrial 3D Solutions").build();
        Supplier s7 = Supplier.builder().website("www.hyderabadcasting.com").location(l7).manufacturingProcesses("casting").natureOfBussiness("large_scale").companyName("Hyderabad Casting Ltd.").build();
        Supplier s8 = Supplier.builder().website("www.metalmoulders.com").location(l8).manufacturingProcesses("moulding").natureOfBussiness("small_scale").companyName("Metal Moulders").build();
        Supplier s11 = Supplier.builder().website("www.jaipurcastings.com").location(l11).manufacturingProcesses("casting").natureOfBussiness("medium_scale").companyName("Jaipur Castings").build();
        Supplier s12 = Supplier.builder().website("www.kolkatacastingworks.com").location(l12).manufacturingProcesses("casting").natureOfBussiness("medium_scale").companyName("Kolkata Casting Works").build();
        Supplier s13 = Supplier.builder().website("www.lucknowindustries.com").location(l13).manufacturingProcesses("casting").natureOfBussiness("medium_scale").companyName("Lucknow Industries").build();
        Supplier s14 = Supplier.builder().website("www.ludhianacasting.com").location(l14).manufacturingProcesses("casting").natureOfBussiness("medium_scale").companyName("Ludhiana Casting Co.").build();
        Supplier s15 = Supplier.builder().website("www.coimbatorecastings.com").location(l15).manufacturingProcesses("casting").natureOfBussiness("medium_scale").companyName("Coimbatore Castings").build();
//
//
        supplierRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8,  s11, s12, s13, s14, s15));
    }
}
