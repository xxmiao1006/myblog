package com.Alice.mapper;

import com.Alice.model.Message;

import java.util.List;


public interface MessageMapper {

    void insertMessage(Message message);

    List<Message> listMessageByUid(Integer uid);


}
