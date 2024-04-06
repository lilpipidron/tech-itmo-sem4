package ru.itmo.cats;

import java.util.List;

public interface CatRepository {
    void addNewCat(Cat cat);
    Cat getCatById(int id);
    List<Cat> getAllFriends(int id);
    void addFriend(int catId, int friendId);
    void deleteCat(int catId);
}