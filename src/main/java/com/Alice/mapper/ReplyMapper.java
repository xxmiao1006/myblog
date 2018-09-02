package com.Alice.mapper;

import com.Alice.model.Comment;
import com.Alice.model.Reply;

import java.util.List;


public interface ReplyMapper {

    void insertReply(Reply reply);

    List<Reply> listReply(int pid);

    void insertComment(Comment comment);

    List<Comment> listComment(Integer rid);

    String getContentByRid(int rid);

}
