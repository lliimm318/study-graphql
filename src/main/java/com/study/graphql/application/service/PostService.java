package com.study.graphql.application.service;

import com.study.graphql.application.dto.PostRequest;
import com.study.graphql.application.dto.PostResponse;

import java.util.List;

public interface PostService {

    int createPost(PostRequest request);

    PostResponse getPost(Integer postId);

    List<PostResponse> getPosts();

    int updatePost(Integer post, PostRequest request);

}
