package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCreateAccountStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_account_status_id")

    private String createAccountStatusId;

    public ShowCreateAccountStatusRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 如果正在使用临时安全凭据，则此header是必需的，该值是临时安全凭据的安全令牌（会话令牌）。
     * @return xSecurityToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")
    public String getXSecurityToken() {
        return xSecurityToken;
    }

    public void setXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
    }

    public ShowCreateAccountStatusRequest withCreateAccountStatusId(String createAccountStatusId) {
        this.createAccountStatusId = createAccountStatusId;
        return this;
    }

    /**
     * 指定唯一标识CreateAccount请求的ID值。
     * @return createAccountStatusId
     */
    public String getCreateAccountStatusId() {
        return createAccountStatusId;
    }

    public void setCreateAccountStatusId(String createAccountStatusId) {
        this.createAccountStatusId = createAccountStatusId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCreateAccountStatusRequest that = (ShowCreateAccountStatusRequest) obj;
        return Objects.equals(this.xSecurityToken, that.xSecurityToken)
            && Objects.equals(this.createAccountStatusId, that.createAccountStatusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecurityToken, createAccountStatusId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCreateAccountStatusRequest {\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
        sb.append("    createAccountStatusId: ").append(toIndentedString(createAccountStatusId)).append("\n");
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
