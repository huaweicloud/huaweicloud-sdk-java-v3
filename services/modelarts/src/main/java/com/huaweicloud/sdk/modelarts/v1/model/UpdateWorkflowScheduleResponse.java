package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateWorkflowScheduleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Map<String, Object> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private WorkflowSchedulePolicies policies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public UpdateWorkflowScheduleResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，仅支持time（时间）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateWorkflowScheduleResponse withContent(Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public UpdateWorkflowScheduleResponse putContentItem(String key, Object contentItem) {
        if (this.content == null) {
            this.content = new HashMap<>();
        }
        this.content.put(key, contentItem);
        return this;
    }

    public UpdateWorkflowScheduleResponse withContent(Consumer<Map<String, Object>> contentSetter) {
        if (this.content == null) {
            this.content = new HashMap<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 内容。
     * @return content
     */
    public Map<String, Object> getContent() {
        return content;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    public UpdateWorkflowScheduleResponse withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作，仅支持run。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdateWorkflowScheduleResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Workflow工作流ID。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public UpdateWorkflowScheduleResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateWorkflowScheduleResponse withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 定时调度信息，使能标记。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UpdateWorkflowScheduleResponse withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * ID标记。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public UpdateWorkflowScheduleResponse withPolicies(WorkflowSchedulePolicies policies) {
        this.policies = policies;
        return this;
    }

    public UpdateWorkflowScheduleResponse withPolicies(Consumer<WorkflowSchedulePolicies> policiesSetter) {
        if (this.policies == null) {
            this.policies = new WorkflowSchedulePolicies();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public WorkflowSchedulePolicies getPolicies() {
        return policies;
    }

    public void setPolicies(WorkflowSchedulePolicies policies) {
        this.policies = policies;
    }

    public UpdateWorkflowScheduleResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkflowScheduleResponse that = (UpdateWorkflowScheduleResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.content, that.content)
            && Objects.equals(this.action, that.action) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.policies, that.policies)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content, action, workflowId, userId, enable, uuid, policies, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkflowScheduleResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
