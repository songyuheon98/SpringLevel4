package com.sparta.springlevel4.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 클라이언트에게 반환할 전체 메모와 댓글 정보를 담은 DTO
 */
@Getter
@Setter
public class MemoCommentResponseAllDto {
    MemoCommentDto postList;
    public MemoCommentResponseAllDto(MemoCommentDto postList){
        this.postList = postList;
    }

}
