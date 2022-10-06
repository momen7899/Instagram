package com.ms.instagram.user;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user/v1")
@AllArgsConstructor
public class UserController {
    private final UserService service;
    private final UserMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody UserDTO userDTO) {
        User profile = mapper.toUser(userDTO);
        service.save(profile);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO) {
        User profile = mapper.toUser(userDTO);

        return ResponseEntity.ok(mapper.toUserDTO(service.update(profile)));
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.toUserDTO(service.getById(id)));
    }


}
