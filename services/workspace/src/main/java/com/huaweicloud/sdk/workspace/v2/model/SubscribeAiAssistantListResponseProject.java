package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅项目信息。
 */
public class SubscribeAiAssistantListResponseProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_func")

    private Boolean aiFunc;

    public SubscribeAiAssistantListResponseProject withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SubscribeAiAssistantListResponseProject withAiFunc(Boolean aiFunc) {
        this.aiFunc = aiFunc;
        return this;
    }

    /**
     * ai 功能是否启用。 * true： 启用 * false： 不启用
     * @return aiFunc
     */
    public Boolean getAiFunc() {
        return aiFunc;
    }

    public void setAiFunc(Boolean aiFunc) {
        this.aiFunc = aiFunc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeAiAssistantListResponseProject that = (SubscribeAiAssistantListResponseProject) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.aiFunc, that.aiFunc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, aiFunc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeAiAssistantListResponseProject {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    aiFunc: ").append(toIndentedString(aiFunc)).append("\n");
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
