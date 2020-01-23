package com.hibernateMappingOneToOne.Image;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String taskId;
	private String taskName;
	public Task() {	}
	public Task(String taskName) {
			this.taskName = taskName;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + "]";
	}
	
}
