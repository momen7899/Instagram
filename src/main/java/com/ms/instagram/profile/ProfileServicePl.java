package com.ms.instagram.profile;

import org.springframework.context.annotation.Profile;

import java.util.List;

public interface ProfileServicePl {
    ProfileModel save(ProfileModel profile);

    ProfileModel getById(Long ProId);
    List<ProfileModel> getAllProfile();
}
