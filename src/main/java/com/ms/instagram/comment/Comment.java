package com.ms.instagram.comment;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.post.Post;
import com.ms.instagram.user.User;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_comment")
@Data
@Audited
public class Comment extends BaseEntity {


    @NotNull
    private String text;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
