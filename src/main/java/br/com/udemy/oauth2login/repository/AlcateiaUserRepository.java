package br.com.udemy.oauth2login.repository;

import br.com.udemy.oauth2login.domain.AlcateiaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface AlcateiaUserRepository extends CrudRepository<AlcateiaUser, UUID> {

    AlcateiaUser findByLogin(@Param("login") String login);

}