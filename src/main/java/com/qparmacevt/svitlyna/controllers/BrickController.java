package com.qparmacevt.svitlyna.controllers;


import com.qparmacevt.svitlyna.models.Bricks;
import com.qparmacevt.svitlyna.services.BrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brick")
public class BrickController {

    @Autowired
    private BrickService brickService;
    @GetMapping
    public List<Bricks> getAllBricks() {
        return brickService.getAllBricks();
    }

    @GetMapping("/{id}")
    public Bricks getBrickById(@PathVariable("id") Long id) {
        return brickService.getBrickById(id);
    }

    @PostMapping
    public ResponseEntity<Bricks> createBrick(@RequestBody Bricks brick) {
        try {
            Bricks createdBrick = brickService.createBrick(brick);
            return ResponseEntity.ok(createdBrick);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bricks> updateBrick(@PathVariable("id") Long id, @RequestBody Bricks brick) {
        Bricks updatedBrick = brickService.updateBrick(brick);
        return ResponseEntity.ok(updatedBrick);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBrick(@PathVariable("id") Long id) {
        brickService.deleteBrick(id);
        return ResponseEntity.noContent().build();
    }

}
