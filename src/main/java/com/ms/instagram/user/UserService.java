package com.ms.instagram.user;

public interface UserService {
    User save(User user);

    User update(User user);

    User getById(Long id);

}
