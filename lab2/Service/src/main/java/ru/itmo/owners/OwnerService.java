package ru.itmo.owners;

import java.sql.Date;
import java.util.UUID;

public interface OwnerService {
    void addNewOwner(String name, Date birthday);
    Owner getOwnerById(UUID id);
    void addCat(UUID ownerId, UUID catId);
    void deleteCat(UUID ownerId, UUID catId);
}
