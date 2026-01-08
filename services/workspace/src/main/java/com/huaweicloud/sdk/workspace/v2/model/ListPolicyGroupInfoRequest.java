package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPolicyGroupInfoRequest {

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
    @JsonProperty(value = "policy_group_names")

    private List<String> policyGroupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ListPolicyGroupInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询。范围0-100。
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

    public ListPolicyGroupInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，范围0-10000。
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPolicyGroupInfoRequest withPolicyGroupId(String policyGroupId) {
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

    public ListPolicyGroupInfoRequest withPolicyGroupName(String policyGroupName) {
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

    public ListPolicyGroupInfoRequest withPolicyGroupNames(List<String> policyGroupNames) {
        this.policyGroupNames = policyGroupNames;
        return this;
    }

    public ListPolicyGroupInfoRequest addPolicyGroupNamesItem(String policyGroupNamesItem) {
        if (this.policyGroupNames == null) {
            this.policyGroupNames = new ArrayList<>();
        }
        this.policyGroupNames.add(policyGroupNamesItem);
        return this;
    }

    public ListPolicyGroupInfoRequest withPolicyGroupNames(Consumer<List<String>> policyGroupNamesSetter) {
        if (this.policyGroupNames == null) {
            this.policyGroupNames = new ArrayList<>();
        }
        policyGroupNamesSetter.accept(this.policyGroupNames);
        return this;
    }

    /**
     * 根据批量策略组名字过滤结果。
     * @return policyGroupNames
     */
    public List<String> getPolicyGroupNames() {
        return policyGroupNames;
    }

    public void setPolicyGroupNames(List<String> policyGroupNames) {
        this.policyGroupNames = policyGroupNames;
    }

    public ListPolicyGroupInfoRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 根据优先级过滤结果。所带的值需要满足现有策略组已有最大优先级值。
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

    public ListPolicyGroupInfoRequest withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 根据更新时间过滤结果。时间格式满足：yyyy-MM-dd HH:mm:ss。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListPolicyGroupInfoRequest withDescription(String description) {
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
        ListPolicyGroupInfoRequest that = (ListPolicyGroupInfoRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.policyGroupNames, that.policyGroupNames)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(limit, offset, policyGroupId, policyGroupName, policyGroupNames, priority, updateTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyGroupInfoRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    policyGroupNames: ").append(toIndentedString(policyGroupNames)).append("\n");
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
