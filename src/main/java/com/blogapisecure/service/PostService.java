package com.blogapisecure.service;

import com.blogapisecure.dto.PostDto;
import com.blogapisecure.dto.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPost(int pageNo, int PadeSize, String sortBy, String sortDir);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);
}
