package com.SpringBootStarter.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("javascript", "JavaScript", "JavaScript Description")));

	// ***************************************************************
	public List<Topic> getAllTopics() {
		return topics;
	}// getAllTopics

	// ***************************************************************
	public Topic getTopic(String id) {
		// for each topic, check if t.geId is equal the id is passed in
		// then return the topic
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}// getTopic

	// ****************************************************************
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	// ****************************************************************
	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}//if
		}//for
	}// updateTopic
	//******************************************************************
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}//deleteTopic

}
