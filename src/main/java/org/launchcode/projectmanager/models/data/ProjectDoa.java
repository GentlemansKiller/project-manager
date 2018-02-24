package org.launchcode.projectmanager.models.data;

import org.launchcode.projectmanager.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ProjectDoa extends CrudRepository<Project, Integer> {
}
