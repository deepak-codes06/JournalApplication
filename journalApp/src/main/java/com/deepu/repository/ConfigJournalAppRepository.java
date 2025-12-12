package com.deepu.repository;

import com.deepu.entity.ConfigJournalAppEntity;
import com.deepu.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
