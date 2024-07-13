package com.example.foundation.post_like;


import com.example.foundation.post.Post;
import com.example.foundation.post.PostRepository;
import com.example.foundation.user.User;
import com.example.foundation.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostLikeService {
    @Autowired
    private PostLikeRepository postLikeRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    public int getLikeCountByPostId(Long postId) {
        return postLikeRepository.findByPostId(postId).size();
    }
//    public List<PostLike> findByUserId(Long userId) {
//        return postLikeRepository.findByUserId(userId);
//    }
    public PostLike likePost(Long userId, Long postId) {
        //임시 설정
        User user = userRepository.findById(1L).orElseThrow(() -> new IllegalArgumentException("Invalid user ID"));
        Post post = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("Invalid post ID"));
        PostLike postLike = new PostLike(user, post);
        return postLikeRepository.save(postLike);
    }

    public boolean isLiked(Long userId, Long postId) {
        return postLikeRepository.findByUserIdAndPostId(userId, postId).isPresent();
    }
}