package com.ptpmpt.dsd15.server;

import java.util.List;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ptpmpt.dsd15.controller.ChatController;
import com.ptpmpt.dsd15.model.Chat;

@RestController
public class ChatServerController {
	@Autowired
	private ChatController controller;
	@GetMapping("/")
	public List<Chat> get(){
		return controller.getallChat();
	}
	@PostMapping("/")
	public Chat AddChat(@RequestBody Chat chat) {
		return controller.CreateChat(chat);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Chat getDroneById(@PathVariable("id") ObjectId id) {
		return controller.getChat(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> modifyDroneById(@PathVariable("id") ObjectId id, @Valid @RequestBody Chat chat) {
		controller.updateChat(id, chat);
		return new ResponseEntity<>("Chat  is modified successsfully", HttpStatus.OK);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteDrone(@PathVariable ObjectId id) {
		controller.delete(id);
		return new ResponseEntity<>("Chat  is deleted successsfully", HttpStatus.OK);
	}
}
