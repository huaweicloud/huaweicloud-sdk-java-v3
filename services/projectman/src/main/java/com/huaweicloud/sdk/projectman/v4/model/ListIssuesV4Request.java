package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.ListIssueRequestV4;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListIssuesV4Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ListIssueRequestV4 body;

    public ListIssuesV4Request withProjectId(String projectId) {
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

    

    public ListIssuesV4Request withBody(ListIssueRequestV4 body) {
        this.body = body;
        return this;
    }

    public ListIssuesV4Request withBody(Consumer<ListIssueRequestV4> bodySetter) {
        if(this.body == null ){
            this.body = new ListIssueRequestV4();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ListIssueRequestV4 getBody() {
        return body;
    }

    public void setBody(ListIssueRequestV4 body) {
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
        ListIssuesV4Request listIssuesV4Request = (ListIssuesV4Request) o;
        return Objects.equals(this.projectId, listIssuesV4Request.projectId) &&
            Objects.equals(this.body, listIssuesV4Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuesV4Request {\n");
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

