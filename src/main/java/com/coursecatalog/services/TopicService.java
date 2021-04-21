package com.coursecatalog.services;

import com.coursecatalog.entities.Topic;
import com.coursecatalog.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("sql", "MySQL", "MySQL Description"),
			new Topic("spring", "SpringBoot", "SpringBoot Description")
	));*/

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
				.forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		/*for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(topic -> topic.getId().equals(id));
		topicRepository.deleteById(id);
	}
}