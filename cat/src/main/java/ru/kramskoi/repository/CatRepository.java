package ru.kramskoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kramskoi.dto.Breed;
import ru.kramskoi.dto.Color;
import ru.kramskoi.entity.Cat;

import java.util.List;


@Repository

public interface CatRepository extends JpaRepository<Cat, Long> {

    List<Cat> getCatsByOwnerID(Long ownerId);

    List<Cat> getCatsByBreed(Breed breed);

    List<Cat> getCatsByColor(Color color);

    List<Cat> getCatsByColorOrBreed(Color color, Breed breed);
}
