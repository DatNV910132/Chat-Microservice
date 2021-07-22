package com.ptpmpt.dsd15.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptpmpt.dsd15.model.Chat;
import com.ptpmpt.dsd15.repositories.ChatRepository;

@Service
public class ChatController {
	@Autowired
	private ChatRepository repository;

	public List<Chat> getallChat() {
		return repository.findAll();
	}

	public Chat CreateChat(Chat chat) {
		repository.save(chat);
		return chat;
	}
	public Chat getChat(ObjectId id) {
		return repository.findBy_id(id);
	}

	public Chat updateChat(ObjectId id, Chat chat) {
		chat.set_id(id);
		repository.save(chat);
		return chat;
	}

	public void delete(ObjectId Chat_ID) {
		repository.delete(repository.findBy_id(Chat_ID));

	}
}
