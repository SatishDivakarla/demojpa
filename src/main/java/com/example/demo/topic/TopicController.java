package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sdivakarla on 23/01/19.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id){
        //@RequestMapping("/topics/{foo}")
        //public Topic getTopicById(@PathVariable("foo") String id){

        return topicService.getTopicById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, String id){
        topicService.updateTopic(topic, id);
    }
}
