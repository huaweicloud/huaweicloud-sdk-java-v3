package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.CreateIterationRequestV4;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateIterationV4Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iteration_id")
    
    private Integer iterationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateIterationRequestV4 body;

    public UpdateIterationV4Request withProjectId(String projectId) {
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

    

    public UpdateIterationV4Request withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    


    /**
     * Get iterationId
     * @return iterationId
     */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    

    public UpdateIterationV4Request withBody(CreateIterationRequestV4 body) {
        this.body = body;
        return this;
    }

    public UpdateIterationV4Request withBody(Consumer<CreateIterationRequestV4> bodySetter) {
        if(this.body == null ){
            this.body = new CreateIterationRequestV4();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateIterationRequestV4 getBody() {
        return body;
    }

    public void setBody(CreateIterationRequestV4 body) {
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
        UpdateIterationV4Request updateIterationV4Request = (UpdateIterationV4Request) o;
        return Objects.equals(this.projectId, updateIterationV4Request.projectId) &&
            Objects.equals(this.iterationId, updateIterationV4Request.iterationId) &&
            Objects.equals(this.body, updateIterationV4Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, iterationId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIterationV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
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

