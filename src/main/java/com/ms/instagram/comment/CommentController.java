package com.ms.instagram.comment;

import com.ms.instagram.common.PagingDTO;
import com.ms.instagram.common.PagingData;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/comment/v1")
@AllArgsConstructor
public class CommentController {
    private final CommentService service;
    private final CommentMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CommentDTO commentDTO) {
        Comment comment = mapper.toComment(commentDTO);
        service.save(comment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.toCommentDTO(service.getById(id)));
    }

    @GetMapping("/{postId}")
    public ResponseEntity<PagingData<CommentDTO>> getPostById(@PathVariable Long postId, @Parameter PagingDTO pagingDTO) {
        Page<Comment> comments = service.getAllByPostId(postId, pagingDTO.getPage(), pagingDTO.getSize());
        int totalPage = comments.getTotalPages();
        List<CommentDTO> data = mapper.toCommentDTOs(comments.getContent());

        return ResponseEntity.ok(new PagingData<>(totalPage, pagingDTO.getPage(), data));
    }

}