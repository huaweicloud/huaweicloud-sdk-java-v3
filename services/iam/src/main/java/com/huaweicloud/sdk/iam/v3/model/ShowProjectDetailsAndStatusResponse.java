package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ProjectDetailsAndStatusResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowProjectDetailsAndStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private ProjectDetailsAndStatusResult project = null;

    public ShowProjectDetailsAndStatusResponse withProject(ProjectDetailsAndStatusResult project) {
        this.project = project;
        return this;
    }

    public ShowProjectDetailsAndStatusResponse withProject(Consumer<ProjectDetailsAndStatusResult> projectSetter) {
        if(this.project == null ){
            this.project = new ProjectDetailsAndStatusResult();
            projectSetter.accept(this.project);
        }
        
        return this;
    }


    /**
     * Get project
     * @return project
     */
    public ProjectDetailsAndStatusResult getProject() {
        return project;
    }

    public void setProject(ProjectDetailsAndStatusResult project) {
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
        ShowProjectDetailsAndStatusResponse showProjectDetailsAndStatusResponse = (ShowProjectDetailsAndStatusResponse) o;
        return Objects.equals(this.project, showProjectDetailsAndStatusResponse.project);
    }
    @Override
    public int hashCode() {
        return Objects.hash(project);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectDetailsAndStatusResponse {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

