package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ModuleOwner
 */
public class ModuleOwner {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_num_id")

    @JacksonXmlProperty(localName = "user_num_id")

    private Integer userNumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    @JacksonXmlProperty(localName = "nick_name")

    private String nickName;

    public ModuleOwner withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户32位字符串id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ModuleOwner withUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
        return this;
    }

    /**
     * 用户数字id
     * @return userNumId
     */
    public Integer getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
    }

    public ModuleOwner withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ModuleOwner withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModuleOwner moduleOwner = (ModuleOwner) o;
        return Objects.equals(this.userId, moduleOwner.userId) && Objects.equals(this.userNumId, moduleOwner.userNumId)
            && Objects.equals(this.userName, moduleOwner.userName)
            && Objects.equals(this.nickName, moduleOwner.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userNumId, userName, nickName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModuleOwner {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userNumId: ").append(toIndentedString(userNumId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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
