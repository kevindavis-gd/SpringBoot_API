package com.SpringBootStarter.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	// ***********************************************
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}// getAllTopics

	// ************************************************
	@RequestMapping("/topics/{id}")
	// use the variable path named id and store it into the id variable
	public Topic getTopic(@PathVariable("id") String id) {

		return topicService.getTopic(id);
	}// getTopic

	// ***********************************************
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		

	}//addTopic

}
