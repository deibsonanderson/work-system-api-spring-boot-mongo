package br.com.workflow.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workflow.dto.Activity;
import br.com.workflow.repository.ActivityRepository;
import br.com.workflow.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityRepository;

	@Override
	public List<Activity> findAll() {
		return activityRepository.findAll();
	}

	@Override
	public Activity findById(String id) {
		Optional<Activity> activity = activityRepository.findById(id);
		return (activity.isPresent()) ? activity.get() : null;
	}

	@Override
	public void remove(String id) {
		activityRepository.deleteById(id);
	}

	@Override
	public Activity update(Activity activity) {
		return activityRepository.save(activity);
	}

	@Override
	public Activity create(Activity activity) {
		return activityRepository.save(activity);
	}

}
