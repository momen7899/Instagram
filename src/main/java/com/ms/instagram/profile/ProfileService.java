package com.ms.instagram.profile;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProfileService implements ProfileServicePl{
private final ProfileRepository repository;


    @Override
    public ProfileModel save(ProfileModel profile) {
        return repository.save(profile);
    }



    @Override
    public ProfileModel getById(Long ProId) {
        Optional<ProfileModel> profile=repository.findById(ProId);

        if (!profile.isPresent()){

            throw new NotFoundException("Profile Not Found");
        }

        return profile.get();
    }

    @Override
    public List<ProfileModel> getAllProfile() {
        return null;
    }
}
