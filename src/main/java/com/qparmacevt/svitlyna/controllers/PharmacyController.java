package com.qparmacevt.svitlyna.controllers;

import com.qparmacevt.svitlyna.models.Journal;
import com.qparmacevt.svitlyna.models.Pharmacies;
import com.qparmacevt.svitlyna.services.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacy")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @GetMapping
    public List<Pharmacies> getAllPharmacies() {
        return pharmacyService.getAllPharmacies();
    }

    @GetMapping("/{id}")
    public Pharmacies getPharmacyById(@PathVariable("id") Long id) {
        return pharmacyService.getPharmacyById(id);
    }

    @PostMapping
    public Pharmacies createPharmacy(@RequestBody Pharmacies pharmacy) {
        return pharmacyService.savePharmacy(pharmacy);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pharmacies> updatePharmacy(@PathVariable("id") Long id, @RequestBody Pharmacies pharmacy) {
        Pharmacies updatePharmacy = pharmacyService.updatePharmacy(pharmacy);
        return ResponseEntity.ok(updatePharmacy);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePharmacy(@PathVariable("id") Long id) {
        pharmacyService.deletePharmacy(id);
        return ResponseEntity.noContent().build();
    }

}
