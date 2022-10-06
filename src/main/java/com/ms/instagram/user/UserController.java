package com.ms.instagram.user;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile/")
@AllArgsConstructor
public class UserController {
    private final UserService servicePl;
    private final UserMapper mapper;

    @PostMapping("save/")
    public ResponseEntity save(@RequestBody UserDTO userDTO){
        User profile = mapper.toProfile(userDTO);
        servicePl.save(profile);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
