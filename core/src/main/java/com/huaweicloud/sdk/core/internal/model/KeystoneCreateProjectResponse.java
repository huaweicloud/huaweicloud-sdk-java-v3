package com.huaweicloud.sdk.core.internal.model;

import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

public class KeystoneCreateProjectResponse extends SdkResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")
    private Project project = null;

    public KeystoneCreateProjectResponse withProject(Project project) {
        this.project = project;
        return this;
    }

    public KeystoneCreateProjectResponse withProject(Consumer<Project> projectSetter) {
        if (this.project == null) {
            this.project = new Project();
            projectSetter.accept(this.project);
        }

        return this;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}

