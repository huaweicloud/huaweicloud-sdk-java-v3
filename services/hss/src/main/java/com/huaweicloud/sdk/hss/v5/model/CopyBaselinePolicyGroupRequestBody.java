package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被复制的基线策略组
 */
public class CopyBaselinePolicyGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public CopyBaselinePolicyGroupRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 新策略组描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CopyBaselinePolicyGroupRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 新策略组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CopyBaselinePolicyGroupRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 被复制策略组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CopyBaselinePolicyGroupRequestBody that = (CopyBaselinePolicyGroupRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, groupName, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyBaselinePolicyGroupRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
