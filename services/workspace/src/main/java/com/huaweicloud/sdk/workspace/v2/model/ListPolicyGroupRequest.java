package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPolicyGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_flag")

    private Integer scopeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_group_name_accurate")

    private Boolean isGroupNameAccurate;

    public ListPolicyGroupRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回策略组数量的限制。如果不指定，则返回所有符合条件的策略组。范围0~100。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPolicyGroupRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * minimum: 0
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPolicyGroupRequest withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * 根据策略组ID过滤结果。
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public ListPolicyGroupRequest withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * 根据策略组名字过滤结果。
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public ListPolicyGroupRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 根据优先级过滤结果。所带的值需要满足现有策略组已有最大优先级值
     * minimum: 0
     * maximum: 55
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ListPolicyGroupRequest withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 根据更新时间过滤结果。时间格式满足：yyyy-MM-dd HH:mm:ss
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListPolicyGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListPolicyGroupRequest withScopeFlag(Integer scopeFlag) {
        this.scopeFlag = scopeFlag;
        return this;
    }

    /**
     * 策略来源，取值范围0或者1
     * minimum: 0
     * maximum: 1
     * @return scopeFlag
     */
    public Integer getScopeFlag() {
        return scopeFlag;
    }

    public void setScopeFlag(Integer scopeFlag) {
        this.scopeFlag = scopeFlag;
    }

    public ListPolicyGroupRequest withIsGroupNameAccurate(Boolean isGroupNameAccurate) {
        this.isGroupNameAccurate = isGroupNameAccurate;
        return this;
    }

    /**
     * 策略组名字精确查询。
     * @return isGroupNameAccurate
     */
    public Boolean getIsGroupNameAccurate() {
        return isGroupNameAccurate;
    }

    public void setIsGroupNameAccurate(Boolean isGroupNameAccurate) {
        this.isGroupNameAccurate = isGroupNameAccurate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyGroupRequest that = (ListPolicyGroupRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.scopeFlag, that.scopeFlag)
            && Objects.equals(this.isGroupNameAccurate, that.isGroupNameAccurate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            policyGroupId,
            policyGroupName,
            priority,
            updateTime,
            description,
            scopeFlag,
            isGroupNameAccurate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyGroupRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    scopeFlag: ").append(toIndentedString(scopeFlag)).append("\n");
        sb.append("    isGroupNameAccurate: ").append(toIndentedString(isGroupNameAccurate)).append("\n");
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
