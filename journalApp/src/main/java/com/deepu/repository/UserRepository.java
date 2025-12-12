package com.deepu.repository;

import com.deepu.entity.JournalEntry;
import com.deepu.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
        User findByUserName(String username);

        void deleteByUserName(String username);
}
