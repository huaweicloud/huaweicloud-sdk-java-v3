package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 变更操作人
 */
public class VersionHistoryOperator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    @JacksonXmlProperty(localName = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    @JacksonXmlProperty(localName = "domain_name")

    private String domainName;

    public VersionHistoryOperator withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户uuid
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VersionHistoryOperator withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public VersionHistoryOperator withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public VersionHistoryOperator withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户uuid
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public VersionHistoryOperator withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionHistoryOperator versionHistoryOperator = (VersionHistoryOperator) o;
        return Objects.equals(this.userId, versionHistoryOperator.userId)
            && Objects.equals(this.userName, versionHistoryOperator.userName)
            && Objects.equals(this.nickName, versionHistoryOperator.nickName)
            && Objects.equals(this.domainId, versionHistoryOperator.domainId)
            && Objects.equals(this.domainName, versionHistoryOperator.domainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, nickName, domainId, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionHistoryOperator {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
