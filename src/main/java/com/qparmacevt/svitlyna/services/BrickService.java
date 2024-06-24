package com.qparmacevt.svitlyna.services;

import com.qparmacevt.svitlyna.models.Bricks;
import com.qparmacevt.svitlyna.repositories.BrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrickService {

    @Autowired
    private BrickRepository brickRepository;

    public List<Bricks> getAllBricks() {
        return brickRepository.findAll();
    }

    public Bricks getBrickById(Long id) {
        return brickRepository.findById(id).orElse(null);
    }

    public Bricks createBrick(Bricks brick) {
        return brickRepository.save(brick);
    }

    public Bricks updateBrick(Bricks brick) {
        return brickRepository.save(brick);
    }

    public void deleteBrick(Long id) {
        brickRepository.deleteById(id);
    }
}
