package ru.kramskoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kramskoi.breeds.Breed;
import ru.kramskoi.colors.Color;
import ru.kramskoi.entity.Cat;

import java.util.List;


@Repository

public interface CatRepository extends JpaRepository<Cat, Long> {
    Cat getCatById(Long id);

    List<Cat> getCatsByBreed(Breed breed);

    List<Cat> getCatsByColor(Color color);

    List<Cat> getCatsByOwnerId(Long ownerId);

    List<Cat> getCatsByColorOrBreed(Color color, Breed breed);
}