package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateProjectStatusRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private UpdateProjectOption project = null;

    public UpdateProjectStatusRequestBody withProject(UpdateProjectOption project) {
        this.project = project;
        return this;
    }

    public UpdateProjectStatusRequestBody withProject(Consumer<UpdateProjectOption> projectSetter) {
        if(this.project == null ){
            this.project = new UpdateProjectOption();
            projectSetter.accept(this.project);
        }
        
        return this;
    }


    /**
     * Get project
     * @return project
     */
    public UpdateProjectOption getProject() {
        return project;
    }

    public void setProject(UpdateProjectOption project) {
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
        UpdateProjectStatusRequestBody updateProjectStatusRequestBody = (UpdateProjectStatusRequestBody) o;
        return Objects.equals(this.project, updateProjectStatusRequestBody.project);
    }
    @Override
    public int hashCode() {
        return Objects.hash(project);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProjectStatusRequestBody {\n");
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

