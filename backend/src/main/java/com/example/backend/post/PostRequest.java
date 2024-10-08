package com.example.backend.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
    private String title;
    private String content;
    private Long userId;
    private Long categoryId;
}
