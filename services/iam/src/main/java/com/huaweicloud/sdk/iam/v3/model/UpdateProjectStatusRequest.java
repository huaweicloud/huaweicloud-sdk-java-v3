package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateProjectStatusRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateProjectStatusRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateProjectStatusRequestBody body;

    public UpdateProjectStatusRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public UpdateProjectStatusRequest withBody(UpdateProjectStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateProjectStatusRequest withBody(Consumer<UpdateProjectStatusRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateProjectStatusRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateProjectStatusRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateProjectStatusRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProjectStatusRequest updateProjectStatusRequest = (UpdateProjectStatusRequest) o;
        return Objects.equals(this.projectId, updateProjectStatusRequest.projectId) &&
            Objects.equals(this.body, updateProjectStatusRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProjectStatusRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

