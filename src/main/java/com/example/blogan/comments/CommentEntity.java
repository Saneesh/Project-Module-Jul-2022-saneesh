package com.example.blogan.comments;

import com.example.blogan.common.BaseEntity;
import com.example.blogan.users.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "comments")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentEntity extends BaseEntity {
    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String body;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    UserEntity user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "article_id")
    UserEntity article;
}
