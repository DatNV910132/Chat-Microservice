package com.ptpmpt.dsd15.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ptpmpt.dsd15.model.Chat;

public interface ChatRepository extends MongoRepository<Chat, String> {
	Chat findBy_id(ObjectId _id);
}
