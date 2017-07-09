package io.tbt.springboot.samples.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sathish.santhanam on 7/4/17.
 */
@Service
public class TopicService {

    private List<Topic> allTopics = new ArrayList<>(Arrays.asList(
            new Topic("java", "Java Language", "Java Language Description"),
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("osgi", "OSGI Framework", "OSGI Framework Description")
    ));

    public List<Topic> getAllTopics() {
        return allTopics;
    }

    public Topic getTopic(final String topidId) {
        return allTopics.stream().filter(t -> t.getId().equals(topidId)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        allTopics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i=0; i < allTopics.size(); i++) {
            if (allTopics.get(i).getId().equals(id)) {
                allTopics.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        int index = -1;
        for (int i=0; i < allTopics.size(); i++) {
            if (allTopics.get(i).getId().equals(id)) {
                index = i;
            }
        }
        if (index > -1) {
            allTopics.remove(index);
        }
    }
}
