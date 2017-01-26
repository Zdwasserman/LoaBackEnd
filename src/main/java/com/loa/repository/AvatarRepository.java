package com.loa.repository;

import com.loa.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;

/**
 * Created by zacharywasserman on 10/31/16.
 */

@Transactional
@RepositoryRestResource(collectionResourceRel ="avatar", path ="loa")
public interface AvatarRepository extends JpaRepository<Avatar, Integer>
{

    //@CrossOrigin("http://localhost:9000")
    Avatar findByUsername(@Param("username") String username);
}

