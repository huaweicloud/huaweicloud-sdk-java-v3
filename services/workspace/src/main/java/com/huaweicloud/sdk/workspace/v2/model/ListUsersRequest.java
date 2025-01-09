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
    @JsonProperty(value = "user_email")

    private String userEmail;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_subscription")

    private Boolean shareSpaceSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_desktops")

    private Boolean shareSpaceDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_query_total_desktops")

    private Boolean isQueryTotalDesktops;

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

    public ListUsersRequest withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * 用户邮箱。
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

    public ListUsersRequest withShareSpaceSubscription(Boolean shareSpaceSubscription) {
        this.shareSpaceSubscription = shareSpaceSubscription;
        return this;
    }

    /**
     * 用户是否已订阅协同，true/false
     * @return shareSpaceSubscription
     */
    public Boolean getShareSpaceSubscription() {
        return shareSpaceSubscription;
    }

    public void setShareSpaceSubscription(Boolean shareSpaceSubscription) {
        this.shareSpaceSubscription = shareSpaceSubscription;
    }

    public ListUsersRequest withShareSpaceDesktops(Boolean shareSpaceDesktops) {
        this.shareSpaceDesktops = shareSpaceDesktops;
        return this;
    }

    /**
     * 用户是否已绑定协同桌面,true/false
     * @return shareSpaceDesktops
     */
    public Boolean getShareSpaceDesktops() {
        return shareSpaceDesktops;
    }

    public void setShareSpaceDesktops(Boolean shareSpaceDesktops) {
        this.shareSpaceDesktops = shareSpaceDesktops;
    }

    public ListUsersRequest withIsQueryTotalDesktops(Boolean isQueryTotalDesktops) {
        this.isQueryTotalDesktops = isQueryTotalDesktops;
        return this;
    }

    /**
     * 是否查询用户绑定的桌面数,true/false,默认true
     * @return isQueryTotalDesktops
     */
    public Boolean getIsQueryTotalDesktops() {
        return isQueryTotalDesktops;
    }

    public void setIsQueryTotalDesktops(Boolean isQueryTotalDesktops) {
        this.isQueryTotalDesktops = isQueryTotalDesktops;
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
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.userEmail, that.userEmail)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.description, that.description) && Objects.equals(this.activeType, that.activeType)
            && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.shareSpaceSubscription, that.shareSpaceSubscription)
            && Objects.equals(this.shareSpaceDesktops, that.shareSpaceDesktops)
            && Objects.equals(this.isQueryTotalDesktops, that.isQueryTotalDesktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            userEmail,
            limit,
            offset,
            description,
            activeType,
            groupName,
            shareSpaceSubscription,
            shareSpaceDesktops,
            isQueryTotalDesktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    activeType: ").append(toIndentedString(activeType)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    shareSpaceSubscription: ").append(toIndentedString(shareSpaceSubscription)).append("\n");
        sb.append("    shareSpaceDesktops: ").append(toIndentedString(shareSpaceDesktops)).append("\n");
        sb.append("    isQueryTotalDesktops: ").append(toIndentedString(isQueryTotalDesktops)).append("\n");
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
