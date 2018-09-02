package com.Alice.service;

import com.Alice.mapper.MessageMapper;
import com.Alice.model.Message;
import com.Alice.util.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class MessageService {

    @Autowired
    private MessageMapper messageMapper;

    //获得消息列表
    public Map<String, List<Message>> listMessageByUid(Integer sessionUid) {
        List<Message> messageList = messageMapper.listMessageByUid(sessionUid);
        Map<String, List<Message>> map = new HashMap<>();
        for(Message message : messageList){
            String time = MyUtil.formatDate(message.getMsgTime()).substring(0,11);
            if(map.get(time)==null){
                map.put(time,new LinkedList<Message>());
                map.get(time).add(message);
            }else{
                map.get(time).add(message);
            }
        }
        return map;
    }
}
