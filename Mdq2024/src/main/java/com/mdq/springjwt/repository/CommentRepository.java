package com.mdq.springjwt.repository;

import com.mdq.springjwt.models.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdq.springjwt.models.Comment;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{


    List<Comment> findByStory(Story story);
}
