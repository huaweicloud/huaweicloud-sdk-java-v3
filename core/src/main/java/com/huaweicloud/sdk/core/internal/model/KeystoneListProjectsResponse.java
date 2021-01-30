package com.huaweicloud.sdk.core.internal.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class KeystoneListProjectsResponse extends SdkResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects")
    private List<Project> projects = null;

    public KeystoneListProjectsResponse withProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    public KeystoneListProjectsResponse addProjectsItem(Project projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public KeystoneListProjectsResponse withProjects(Consumer<List<Project>> projectsSetter) {
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目信息列表。
     *
     * @return projects
     */
    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

}

