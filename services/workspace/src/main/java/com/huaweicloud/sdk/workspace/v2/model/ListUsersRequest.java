package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListUsersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_type")

    private String activeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    public ListUsersRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面用户名，长度范围为1-20，不能包含特殊字符，不能以数字开头。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListUsersRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回用户数量限制。如果不指定，则返回所有符合条件的用户。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListUsersRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询起始条数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListUsersRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述查询，模糊匹配。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListUsersRequest withActiveType(String activeType) {
        this.activeType = activeType;
        return this;
    }

    /**
     * 激活类型，默认为用户激活。 * USER_ACTIVATE： 用户激活 * ADMIN_ACTIVATE： 管理员激活
     * @return activeType
     */
    public String getActiveType() {
        return activeType;
    }

    public void setActiveType(String activeType) {
        this.activeType = activeType;
    }

    public ListUsersRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 桌面用户组名，精确匹配。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsersRequest that = (ListUsersRequest) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.description, that.description)
            && Objects.equals(this.activeType, that.activeType) && Objects.equals(this.groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, limit, offset, description, activeType, groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    activeType: ").append(toIndentedString(activeType)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
