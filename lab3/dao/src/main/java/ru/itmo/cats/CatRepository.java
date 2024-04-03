package ru.itmo.cats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.breeds.Breed;
import ru.itmo.colors.Color;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
    Cat getCatById(Long id);
    List<Cat> getCatsByBreed(Breed breed);
    List<Cat> getCatsByColor(Color color);
    List<Cat> getCatsByOwnerId(Long ownerId);

    List<Cat> getFriendsById(Long id);
}
