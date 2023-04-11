package com.example.taskmanager.service;

import com.example.taskmanager.model.Project;
import com.example.taskmanager.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    
    @Autowired
    private ProjectRepository projectRepository;
    
    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
    
    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
    
    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
    
    @Override
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }
    
    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
