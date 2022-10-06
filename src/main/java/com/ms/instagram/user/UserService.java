package com.ms.instagram.user;

import java.util.List;

public interface UserService {
    User save(User profile);

    User getById(Long ProId);
    List<User> getAllProfile();
}
