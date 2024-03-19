package ru.itmo.cats;

import ru.itmo.breeds.Breed;

import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public interface CatService {
    void addNewCat(UUID ownerId, String name, Date birthday, Breed breed);
    Cat getCatById(UUID id);
    ArrayList<Cat> getAllFriends(UUID id);
    void addFriend(UUID catId, UUID friendId);
    void deleteCat(UUID catId, UUID ownerId);
}
