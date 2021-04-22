package com.beardtech.contaponto.repo;

import com.beardtech.contaponto.model.Amigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AmigoRepository extends JpaRepository<Amigo, Long> {
    @Modifying
    @Query("UPDATE Amigo a SET a.nome = ?1, a.pontosVitalicios = ?2, a.pontosRevogaveis = ?3 WHERE a.id = ?4")
    int updateAmigoById(String nome, int pontosVitalicios, int pontosRevogaveis, long id);
}
