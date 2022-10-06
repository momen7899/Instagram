package com.ms.instagram.user;

import com.ms.instagram.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        User savedBefore = getById(user.getId());
        savedBefore.setBio(user.getBio());
        savedBefore.setUserName(user.getUserName());
        savedBefore.setPassword(user.getPassword());
        savedBefore.setName(user.getName());
        savedBefore.setImage(user.getImage());
        return save(savedBefore);
    }


    @Override
    public User getById(Long ProId) {
        Optional<User> profile = repository.findById(ProId);

        if (profile.isEmpty()) {
            throw new NotFoundException("Profile Not Found");
        }
        return profile.get();
    }
}
