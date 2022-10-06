package com.ms.instagram.like;

import com.ms.instagram.common.BaseEntity;
import com.ms.instagram.post.Post;
import com.ms.instagram.user.User;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_like")
@Data
@Audited
public class Like extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
