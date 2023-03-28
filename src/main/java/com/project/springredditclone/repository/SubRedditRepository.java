package com.project.springredditclone.repository;

import com.project.springredditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubRedditRepository extends JpaRepository<Subreddit, Long> {
}
