package com.mkyong.json.jackson;

import java.util.ArrayList;
import java.util.List;

/**
 * User
 */
public class User {

	private int age = 29;
	private String name = "mkyong";

	private List<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " + "messages=" + messages + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
