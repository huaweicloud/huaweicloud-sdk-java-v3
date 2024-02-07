package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOauth2UserInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-OrgID-Authorization")

    private String xOrgIDAuthorization;

    public ShowOauth2UserInfoRequest withXOrgIDAuthorization(String xOrgIDAuthorization) {
        this.xOrgIDAuthorization = xOrgIDAuthorization;
        return this;
    }

    /**
     * 用户访问凭证，即 user_access_token, 示例值：\"Bearer u-7f1bcd13fc57d46bac21793a18e560\"
     * @return xOrgIDAuthorization
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-OrgID-Authorization")
    public String getXOrgIDAuthorization() {
        return xOrgIDAuthorization;
    }

    public void setXOrgIDAuthorization(String xOrgIDAuthorization) {
        this.xOrgIDAuthorization = xOrgIDAuthorization;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOauth2UserInfoRequest that = (ShowOauth2UserInfoRequest) obj;
        return Objects.equals(this.xOrgIDAuthorization, that.xOrgIDAuthorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xOrgIDAuthorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOauth2UserInfoRequest {\n");
        sb.append("    xOrgIDAuthorization: ").append(toIndentedString(xOrgIDAuthorization)).append("\n");
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
