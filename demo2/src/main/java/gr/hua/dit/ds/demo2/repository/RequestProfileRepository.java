package gr.hua.dit.ds.demo2.repository;

import gr.hua.dit.ds.demo2.entity.RequestProfile;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path= "requestprofile")
@Hidden
public interface RequestProfileRepository extends JpaRepository<RequestProfile, Integer>{
}
