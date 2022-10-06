package com.ms.instagram.user;

import java.util.List;

public interface UserService {
    User save(User user);
    User update(User user);

    User getById(Long id);

}
