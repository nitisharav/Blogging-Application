package com.blog.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	//Page<Post> findbyUser(User user ,Pageable p);
	//@Query("select p from Post p where p.title like :key"
	//List<Post> searchByTitle(@Param("key") String title);
	List<Post> findByTitleContaining(String title);
}
