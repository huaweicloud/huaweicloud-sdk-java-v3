package com.huaweicloud.sdk.core.internal.model;


import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeystoneCreateProjectRequestBody {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")
    private KeystoneCreateProjectOption project = null;

    public KeystoneCreateProjectRequestBody withProject(KeystoneCreateProjectOption project) {
        this.project = project;
        return this;
    }

    public KeystoneCreateProjectRequestBody withProject(Consumer<KeystoneCreateProjectOption> projectSetter) {
        if (this.project == null) {
            this.project = new KeystoneCreateProjectOption();
            projectSetter.accept(this.project);
        }

        return this;
    }

    public KeystoneCreateProjectOption getProject() {
        return project;
    }

    public void setProject(KeystoneCreateProjectOption project) {
        this.project = project;
    }

}

