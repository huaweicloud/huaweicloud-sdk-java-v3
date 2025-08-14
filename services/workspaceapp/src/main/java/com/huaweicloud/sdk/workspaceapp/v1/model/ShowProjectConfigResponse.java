package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_config")

    private ProjectConfig projectConfig;

    public ShowProjectConfigResponse withProjectConfig(ProjectConfig projectConfig) {
        this.projectConfig = projectConfig;
        return this;
    }

    public ShowProjectConfigResponse withProjectConfig(Consumer<ProjectConfig> projectConfigSetter) {
        if (this.projectConfig == null) {
            this.projectConfig = new ProjectConfig();
            projectConfigSetter.accept(this.projectConfig);
        }

        return this;
    }

    /**
     * Get projectConfig
     * @return projectConfig
     */
    public ProjectConfig getProjectConfig() {
        return projectConfig;
    }

    public void setProjectConfig(ProjectConfig projectConfig) {
        this.projectConfig = projectConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectConfigResponse that = (ShowProjectConfigResponse) obj;
        return Objects.equals(this.projectConfig, that.projectConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectConfigResponse {\n");
        sb.append("    projectConfig: ").append(toIndentedString(projectConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
