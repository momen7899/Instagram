package com.ms.instagram.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
private final UserRepository repository;


    @Override
    public User save(User profile) {
        return repository.save(profile);
    }



    @Override
    public User getById(Long ProId) {
        Optional<User> profile=repository.findById(ProId);

        if (!profile.isPresent()){

            throw new NotFoundException("Profile Not Found");
        }

        return profile.get();
    }

    @Override
    public List<User> getAllProfile() {
        return null;
    }
}
