package ru.brusnika.NauJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.brusnika.NauJava.model.Founder;

@Repository
public interface FounderRepository extends JpaRepository<Founder, Integer> {
    // Дополнительные пользовательские запросы можно определить здесь
}