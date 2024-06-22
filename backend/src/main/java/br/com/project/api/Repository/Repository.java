package br.com.project.api.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.project.api.Model.Client;

public interface Repository extends CrudRepository<Client, Long> {

}
