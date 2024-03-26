package edu.iu.isbens.primesservice.repository;

import edu.iu.isbens.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {

    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;

}
