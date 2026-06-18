package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 算法的元数据，描述算法基本信息。
 */
public class AlgorithmMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_project")

    private String aiProject;

    public AlgorithmMetadata withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 算法uuid，创建算法时无需填写。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AlgorithmMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 算法名称。限制为1-64位只含数字、字母、下划线和中划线的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对算法的描述，默认为“NULL”，字符串的长度限制为[0, 256]。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlgorithmMetadata withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 指定算法所处的工作空间，默认值为“0”。“0” 为默认的工作空间。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public AlgorithmMetadata withAiProject(String aiProject) {
        this.aiProject = aiProject;
        return this;
    }

    /**
     * 指定算法所属的ai项目，默认值为\"default-ai-project\"。ai项目已下线，无需关注。
     * @return aiProject
     */
    public String getAiProject() {
        return aiProject;
    }

    public void setAiProject(String aiProject) {
        this.aiProject = aiProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmMetadata that = (AlgorithmMetadata) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.aiProject, that.aiProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, workspaceId, aiProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmMetadata {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    aiProject: ").append(toIndentedString(aiProject)).append("\n");
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
