package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetCallerIdentityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    public GetCallerIdentityRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 通过临时访问密钥调用接口时，需要提供“X-Security-Token”Http头，取值为临时访问密钥的security_token字段。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetCallerIdentityRequest that = (GetCallerIdentityRequest) obj;
        return Objects.equals(this.xSecurityToken, that.xSecurityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecurityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCallerIdentityRequest {\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
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
