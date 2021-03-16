package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateTestCaseResultRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateTestCaseResultRequestBody body;

    public UpdateTestCaseResultRequest withProjectId(String projectId) {
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

    

    public UpdateTestCaseResultRequest withBody(UpdateTestCaseResultRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTestCaseResultRequest withBody(Consumer<UpdateTestCaseResultRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateTestCaseResultRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateTestCaseResultRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTestCaseResultRequestBody body) {
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
        UpdateTestCaseResultRequest updateTestCaseResultRequest = (UpdateTestCaseResultRequest) o;
        return Objects.equals(this.projectId, updateTestCaseResultRequest.projectId) &&
            Objects.equals(this.body, updateTestCaseResultRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseResultRequest {\n");
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

