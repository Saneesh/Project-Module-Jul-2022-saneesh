package com.example.blogan.articles;

import com.example.blogan.comments.CommentEntity;
import com.example.blogan.common.BaseEntity;
import com.example.blogan.users.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity(name = "articles")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleEntity extends BaseEntity {

    @Column(nullable = false)
    String title;

    String slug;

    String subtitle;

    @Column(nullable = false)
    String body;

    @Column(name="created_at")
    @ColumnDefault("CURRENT_TIMESTAMP")
    Date createdAt;

    String tags;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    UserEntity user;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    List<CommentEntity> comments;
}
