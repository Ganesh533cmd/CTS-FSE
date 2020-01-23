package com.hibernet1.task.todo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class todo {

	private int todoid;
	private String id;
	private String name;
	private LocalDateTime crtDateTime;
}
