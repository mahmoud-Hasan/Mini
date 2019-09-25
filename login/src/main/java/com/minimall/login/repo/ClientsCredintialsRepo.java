package com.minimall.login.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.minimall.login.model.ClientsCredentials;

@Repository
public interface ClientsCredintialsRepo extends CassandraRepository<ClientsCredentials, String> {

	ClientsCredentials findByUsername(String userName);

}
