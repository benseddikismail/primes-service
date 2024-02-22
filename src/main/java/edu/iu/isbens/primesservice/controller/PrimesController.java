package edu.iu.isbens.primesservice.controller;

import edu.iu.isbens.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")

public class PrimesController{
    IPrimesService primesService;

    public PrimesController(IPrimesService primesService){
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable long n){
        return primesService.isPrime(n);
    }
}
