package com.ms.instagram.post;

import com.ms.instagram.comment.Comment;
import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.like.Like;
import com.ms.instagram.user.User;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Audited
@Table(name = Post.POST_TB_NAME)
public class Post extends BaseEntity {

    public static final String POST_TB_NAME = "post_tbl";


    private String file;
    private String caption;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "post", cascade = CascadeType.ALL)
    private List<Like> likes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

}
