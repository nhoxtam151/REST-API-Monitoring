package com.ductam.sdr.api;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface AppUserRepository extends JpaRepository<AppUser, String> {
  public List<AppUser> findByEmail(@Param("email") String email);
}
