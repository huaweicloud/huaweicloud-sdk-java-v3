package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 项目信息
 */
public class IssueProjectResponseV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_num_id")
    
    private Integer projectNumId;

    public IssueProjectResponseV4 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public IssueProjectResponseV4 withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    

    public IssueProjectResponseV4 withProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
        return this;
    }

    


    /**
     * 项目数字id
     * @return projectNumId
     */
    public Integer getProjectNumId() {
        return projectNumId;
    }

    public void setProjectNumId(Integer projectNumId) {
        this.projectNumId = projectNumId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueProjectResponseV4 issueProjectResponseV4 = (IssueProjectResponseV4) o;
        return Objects.equals(this.projectId, issueProjectResponseV4.projectId) &&
            Objects.equals(this.projectName, issueProjectResponseV4.projectName) &&
            Objects.equals(this.projectNumId, issueProjectResponseV4.projectNumId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, projectNumId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueProjectResponseV4 {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectNumId: ").append(toIndentedString(projectNumId)).append("\n");
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

