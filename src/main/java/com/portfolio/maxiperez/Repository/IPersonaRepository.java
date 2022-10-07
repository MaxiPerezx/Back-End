
package com.portfolio.maxiperez.Repository;

import com.portfolio.maxiperez.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {

}
