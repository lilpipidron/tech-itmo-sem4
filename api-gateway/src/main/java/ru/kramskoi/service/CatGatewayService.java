package ru.kramskoi.service;

import ru.kramskoi.dto.CatClientDTO;
import ru.kramskoi.dto.CatDTO;
import ru.kramskoi.dto.CatPost;
import ru.kramskoi.dto.FriendMessage;

import java.security.Principal;
import java.util.List;

public interface CatGatewayService {
    void addCat(CatPost catPost, Principal principal);

    void deleteCat(long id, Principal principal);

    void updateCat(CatPost catPost, Principal principal);

    CatClientDTO getCat(long id, Principal principal);

    void addFriend(FriendMessage friendMessage, Principal principal);

    List<CatClientDTO> getFriends(long id, Principal principal);
}
