package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.ShowProjectWorkHoursRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowProjectWorkHoursRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ShowProjectWorkHoursRequestBody body = null;

    public ShowProjectWorkHoursRequest withProjectId(String projectId) {
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

    public ShowProjectWorkHoursRequest withBody(ShowProjectWorkHoursRequestBody body) {
        this.body = body;
        return this;
    }

    public ShowProjectWorkHoursRequest withBody(Consumer<ShowProjectWorkHoursRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ShowProjectWorkHoursRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ShowProjectWorkHoursRequestBody getBody() {
        return body;
    }

    public void setBody(ShowProjectWorkHoursRequestBody body) {
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
        ShowProjectWorkHoursRequest showProjectWorkHoursRequest = (ShowProjectWorkHoursRequest) o;
        return Objects.equals(this.projectId, showProjectWorkHoursRequest.projectId) &&
            Objects.equals(this.body, showProjectWorkHoursRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectWorkHoursRequest {\n");
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

