package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowProjectInfoV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private GetProjectInfoV4ResultProject project;

    public ShowProjectInfoV4Response withProject(GetProjectInfoV4ResultProject project) {
        this.project = project;
        return this;
    }

    public ShowProjectInfoV4Response withProject(Consumer<GetProjectInfoV4ResultProject> projectSetter) {
        if (this.project == null) {
            this.project = new GetProjectInfoV4ResultProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /** Get project
     * 
     * @return project */
    public GetProjectInfoV4ResultProject getProject() {
        return project;
    }

    public void setProject(GetProjectInfoV4ResultProject project) {
        this.project = project;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectInfoV4Response showProjectInfoV4Response = (ShowProjectInfoV4Response) o;
        return Objects.equals(this.project, showProjectInfoV4Response.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectInfoV4Response {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
