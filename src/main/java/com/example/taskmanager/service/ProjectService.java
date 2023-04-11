package com.example.taskmanager.service;

import com.example.taskmanager.model.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);
    Project getProjectById(Long id);
    List<Project> getAllProjects();
    Project updateProject(Project project);
    void deleteProject(Long id);
}

