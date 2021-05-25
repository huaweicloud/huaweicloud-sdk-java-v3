package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.CreateCustomfieldV1Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateCustomfieldsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateCustomfieldV1Req body;

    public CreateCustomfieldsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public CreateCustomfieldsRequest withBody(CreateCustomfieldV1Req body) {
        this.body = body;
        return this;
    }

    public CreateCustomfieldsRequest withBody(Consumer<CreateCustomfieldV1Req> bodySetter) {
        if(this.body == null ){
            this.body = new CreateCustomfieldV1Req();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateCustomfieldV1Req getBody() {
        return body;
    }

    public void setBody(CreateCustomfieldV1Req body) {
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
        CreateCustomfieldsRequest createCustomfieldsRequest = (CreateCustomfieldsRequest) o;
        return Objects.equals(this.projectId, createCustomfieldsRequest.projectId) &&
            Objects.equals(this.body, createCustomfieldsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomfieldsRequest {\n");
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

