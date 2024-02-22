package edu.iu.isbens.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {

    PrimesService primesService = new PrimesService();

    @Test
    void _105isNotPrime(){
        boolean actual = primesService.isPrime(105);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void _17isPrime(){
        boolean actual = primesService.isPrime(17);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void _17383930isNotPrime(){
        boolean actual = primesService.isPrime(17383930);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}