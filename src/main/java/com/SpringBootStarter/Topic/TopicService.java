package com.SpringBootStarter.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository; 

	/*private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("javascript", "JavaScript", "JavaScript Description")));*/

	public Iterable<Topic> getAllTopics() {
		return topicRepository.findAll();
	}// getAllTopics

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}// getTopic

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}//add topic

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}// updateTopic
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}//deleteTopic

}
