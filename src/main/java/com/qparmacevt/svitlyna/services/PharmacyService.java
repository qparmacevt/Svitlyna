package com.qparmacevt.svitlyna.services;

import com.qparmacevt.svitlyna.models.Pharmacies;
import com.qparmacevt.svitlyna.repositories.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PharmacyService {

    @Autowired

    private PharmacyRepository pharmacyRepository;

    public List<Pharmacies> getAllPharmacies() {
        return pharmacyRepository.findAll();
    }

    public Pharmacies getPharmacyById(Long id) {
        return pharmacyRepository.findById(id).orElse(null);
    }

    public Pharmacies savePharmacy(Pharmacies pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

    public void deletePharmacy(Long id) {
        pharmacyRepository.deleteById(id);
    }

    public Pharmacies updatePharmacy(Pharmacies pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

}
