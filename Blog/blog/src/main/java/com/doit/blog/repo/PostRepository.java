
package com.doit.blog.repo;

import com.doit.blog.models.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long>{
    
}
