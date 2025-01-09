package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询桌面用户组中的桌面用户响应的用户信息。
 */
public class UserInGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_phone")

    private String userPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_desktops")

    private Integer totalDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UserInGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserInGroup withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInGroup withUserEmail(String userEmail) {
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

    public UserInGroup withUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * 用户手机号。
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public UserInGroup withTotalDesktops(Integer totalDesktops) {
        this.totalDesktops = totalDesktops;
        return this;
    }

    /**
     * 用户桌面数。
     * @return totalDesktops
     */
    public Integer getTotalDesktops() {
        return totalDesktops;
    }

    public void setTotalDesktops(Integer totalDesktops) {
        this.totalDesktops = totalDesktops;
    }

    public UserInGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述。
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
        UserInGroup that = (UserInGroup) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userEmail, that.userEmail) && Objects.equals(this.userPhone, that.userPhone)
            && Objects.equals(this.totalDesktops, that.totalDesktops)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userEmail, userPhone, totalDesktops, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInGroup {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    totalDesktops: ").append(toIndentedString(totalDesktops)).append("\n");
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
