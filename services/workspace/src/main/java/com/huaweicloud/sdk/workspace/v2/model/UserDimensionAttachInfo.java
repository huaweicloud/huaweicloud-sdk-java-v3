package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户维度关联关系。
 */
public class UserDimensionAttachInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_num")

    private Integer desktopNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    public UserDimensionAttachInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserDimensionAttachInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 桌面id。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDimensionAttachInfo withDesktopNum(Integer desktopNum) {
        this.desktopNum = desktopNum;
        return this;
    }

    /**
     * 计划分配桌面数。
     * @return desktopNum
     */
    public Integer getDesktopNum() {
        return desktopNum;
    }

    public void setDesktopNum(Integer desktopNum) {
        this.desktopNum = desktopNum;
    }

    public UserDimensionAttachInfo withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 计划分配桌面名称，如果有多个用逗号隔开。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserDimensionAttachInfo that = (UserDimensionAttachInfo) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.desktopNum, that.desktopNum) && Objects.equals(this.desktopName, that.desktopName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userId, desktopNum, desktopName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDimensionAttachInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    desktopNum: ").append(toIndentedString(desktopNum)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
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
