package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源所有者信息。 
 */
public class Creator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public Creator withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**：租户名称。 **取值范围**：支持中文字符、英文字母、数字及特殊字符，长度为1~64个字符。 
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Creator withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**：租户ID。 **取值范围**：支持英文字母、数字及中划线，长度为1~64个字符。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Creator withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**：用户名称。 **取值范围**：支持英文字母、数字、下划线的组合，长度为1~64个字符。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Creator withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**：用户ID。 **取值范围**：支持英文字母、数字及中划线，长度为1~64个字符。 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Creator that = (Creator) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, domainId, userName, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Creator {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
