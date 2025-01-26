package com.devsuperior.dlist.repositories;

import com.devsuperior.dlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
