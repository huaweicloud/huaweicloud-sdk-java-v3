package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyGroupForBaseList
 */
public class PolicyGroupForBaseList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public PolicyGroupForBaseList withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * 策略组ID。
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public PolicyGroupForBaseList withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * 策略组名称。
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public PolicyGroupForBaseList withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。
     * minimum: 1
     * maximum: 65535
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PolicyGroupForBaseList withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新日期。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public PolicyGroupForBaseList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyGroupForBaseList that = (PolicyGroupForBaseList) obj;
        return Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroupId, policyGroupName, priority, updateTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyGroupForBaseList {\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
