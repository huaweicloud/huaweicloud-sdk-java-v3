package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询订阅用户组信息
 */
public class SubscribeUserGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_func")

    private Boolean aiFunc;

    public SubscribeUserGroupInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 用户组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public SubscribeUserGroupInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 用户组名称。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SubscribeUserGroupInfo withAiFunc(Boolean aiFunc) {
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
        SubscribeUserGroupInfo that = (SubscribeUserGroupInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.aiFunc, that.aiFunc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, aiFunc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeUserGroupInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
