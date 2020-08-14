package com.ebs.jpa.domain.posts;

import com.ebs.jpa.web.dto.HelloResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {


}