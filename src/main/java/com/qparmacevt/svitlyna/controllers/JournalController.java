package com.qparmacevt.svitlyna.controllers;

import com.qparmacevt.svitlyna.models.Journal;
import com.qparmacevt.svitlyna.services.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journal")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @GetMapping
    public List<Journal> getAllJournals() {
        return journalService.getAllJournals();
    }

    @GetMapping("/{id}")
    public Journal getJournalById(@PathVariable Long id) {
        return journalService.getJournalById(id);
    }

    @PostMapping
    public Journal createJournal(@RequestBody Journal journal) {
        return journalService.createJournal(journal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Journal> updateJournal(@PathVariable("id") Long id, @RequestBody Journal journal) {
        Journal updateJournal = journalService.updateJournal(journal);
        return ResponseEntity.ok(updateJournal);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBrick(@PathVariable("id") Long id) {
        journalService.deleteJournal(id);
        return ResponseEntity.noContent().build();
    }
}
