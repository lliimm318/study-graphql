package com.study.graphql.application.service;

import com.study.graphql.application.dto.PostRequest;
import com.study.graphql.application.dto.PostResponse;
import com.study.graphql.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public int createPost(PostRequest request) {
        return 0;
    }

    @Override
    public PostResponse getPost(Integer postId) {
        return null;
    }

    @Override
    public List<PostResponse> getPosts() {
        return null;
    }

    @Override
    public int updatePost(Integer post, PostRequest request) {
        return 0;
    }

}
