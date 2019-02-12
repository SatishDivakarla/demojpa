package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sdivakarla on 24/01/19.
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("cs101", "Computer science fundamentals"),
            new Topic("alg101", "Algorithms Fundamentals"),
            new Topic("mat101", " Mathematics Fundamentals")));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics :: add);
        return topics;
    }

    public Topic getTopicById(String id){
        //return topics.stream().filter(topic -> id.equals(topic.getId())).findAny().get();
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
//        for(int i=0; i <topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, t);
//            }
//        }
    }

    public void deleteTopic(Topic topic, String id) {
        topicRepository.delete(topic);
//        for(int i=0; i <topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, t);
//            }
//        }
    }

}
