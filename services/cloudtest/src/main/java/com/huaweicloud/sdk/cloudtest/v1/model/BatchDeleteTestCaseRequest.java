package com.huaweicloud.sdk.cloudtest.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchDeleteTestCaseRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchDeleteTestCaseRequestBody body;

    public BatchDeleteTestCaseRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目唯一标识，固定长度32位字符
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public BatchDeleteTestCaseRequest withBody(BatchDeleteTestCaseRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteTestCaseRequest withBody(Consumer<BatchDeleteTestCaseRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchDeleteTestCaseRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchDeleteTestCaseRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteTestCaseRequestBody body) {
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
        BatchDeleteTestCaseRequest batchDeleteTestCaseRequest = (BatchDeleteTestCaseRequest) o;
        return Objects.equals(this.projectId, batchDeleteTestCaseRequest.projectId) &&
            Objects.equals(this.body, batchDeleteTestCaseRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteTestCaseRequest {\n");
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

