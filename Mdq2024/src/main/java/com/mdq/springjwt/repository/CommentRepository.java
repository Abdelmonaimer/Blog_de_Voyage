package com.mdq.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdq.springjwt.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
