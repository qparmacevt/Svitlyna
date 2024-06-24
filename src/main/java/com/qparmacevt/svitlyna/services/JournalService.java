package com.qparmacevt.svitlyna.services;

import com.qparmacevt.svitlyna.models.Journal;
import com.qparmacevt.svitlyna.repositories.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journal createJournal(Journal journal) {
        return journalRepository.save(journal);
    }

    public Journal updateJournal(Journal journal) {
        return journalRepository.save(journal);
    }

    public void deleteJournal(Long id) {
        journalRepository.deleteById(id);
    }

    public Journal getJournalById(Long id) {
        return journalRepository.findById(id).orElse(null);
    }
}
