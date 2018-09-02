package com.Alice.service;

import com.Alice.mapper.TopicMapper;
import com.Alice.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TopicService {


    @Autowired
    private TopicMapper topicMapper;

    public List<Topic> listTopic() {
        return topicMapper.listTopic();
    }

    public List<String> listImage() {
        return topicMapper.listImage();
    }
}

