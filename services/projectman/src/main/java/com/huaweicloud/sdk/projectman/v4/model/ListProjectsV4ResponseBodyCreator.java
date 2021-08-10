package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 创建者信息 */
public class ListProjectsV4ResponseBodyCreator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_num_id")

    private Integer userNumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    public ListProjectsV4ResponseBodyCreator withUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
        return this;
    }

    /** 创建人numId
     * 
     * @return userNumId */
    public Integer getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
    }

    public ListProjectsV4ResponseBodyCreator withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 创建人id
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListProjectsV4ResponseBodyCreator withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 创建人姓名
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListProjectsV4ResponseBodyCreator withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 创建人租户id
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListProjectsV4ResponseBodyCreator withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 创建人租户名称
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ListProjectsV4ResponseBodyCreator withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /** 创建人租户昵称
     * 
     * @return nickName */
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
        ListProjectsV4ResponseBodyCreator listProjectsV4ResponseBodyCreator = (ListProjectsV4ResponseBodyCreator) o;
        return Objects.equals(this.userNumId, listProjectsV4ResponseBodyCreator.userNumId)
            && Objects.equals(this.userId, listProjectsV4ResponseBodyCreator.userId)
            && Objects.equals(this.userName, listProjectsV4ResponseBodyCreator.userName)
            && Objects.equals(this.domainId, listProjectsV4ResponseBodyCreator.domainId)
            && Objects.equals(this.domainName, listProjectsV4ResponseBodyCreator.domainName)
            && Objects.equals(this.nickName, listProjectsV4ResponseBodyCreator.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNumId, userId, userName, domainId, domainName, nickName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsV4ResponseBodyCreator {\n");
        sb.append("    userNumId: ").append(toIndentedString(userNumId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
