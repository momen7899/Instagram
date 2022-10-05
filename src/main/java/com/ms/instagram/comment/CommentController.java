package com.ms.instagram.comment;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/comment/")
@AllArgsConstructor
public class CommentController {
    private final CommentServicePl servicePl;
    private final CommentMapper mapper;


    @PostMapping("/sava")
    public ResponseEntity save(@RequestBody CommentDTO commentDTO) {
        Comment comment = mapper.toComment(commentDTO);
        servicePl.save(comment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
/*
    @PutMapping("/update")
    public ResponseEntity update(@RequestBody CommentDTO commentDTO){
        Comment comment =mapper.toComment(commentDTO);
        servicePl.update(comment);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/det/{id}")
    public ResponseEntity<CommentDTO> getById(@PathVariable Long id ){

        Comment comment = servicePl.getById(id);
        CommentDTO commentDTO=mapper.toCommentDTO(comment);
        return ResponseEntity.ok(commentDTO);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<CommentDTO>> getAll(){

        List<Comment> comments=    servicePl.getAll();
        List<CommentDTO> commentDTOS=    mapper.toCommentDTOs(comments);
        return ResponseEntity.ok(commentDTOS);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        servicePl.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/get-all-by-profile-id/{userId}")
    public ResponseEntity<List<CommentDTO>> getAllByUserId(@PathVariable Long userId){

        List<Comment> comments= servicePl.getAllByUserId(userId);
        List<CommentDTO> commentDTOS= mapper.toCommentDTOs(comments);
        return ResponseEntity.ok(commentDTOS);
    }

    @GetMapping("/v1/get-all-by-post-id/{placeId}")
    public ResponseEntity<List<CommentDTO>> getAllByPlaceId(@PathVariable Long placeId){

        List<Comment> comments= servicePl.getAllByPlaceId(placeId);
        List<CommentDTO> commentDTOS= mapper.toCommentDTOs(comments);
        return ResponseEntity.ok(commentDTOS);

}
*/