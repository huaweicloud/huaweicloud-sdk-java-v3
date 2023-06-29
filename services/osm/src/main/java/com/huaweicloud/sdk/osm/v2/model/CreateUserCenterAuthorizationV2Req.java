package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateUserCenterAuthorizationV2Req
 */
public class CreateUserCenterAuthorizationV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authorized")

    private Integer isAuthorized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_content")

    private String authorizationContent;

    public CreateUserCenterAuthorizationV2Req withIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    /**
     * 是否同意 0不同意 1同意
     * minimum: 0
     * maximum: 1
     * @return isAuthorized
     */
    public Integer getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public CreateUserCenterAuthorizationV2Req withAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
        return this;
    }

    /**
     * 机密信息内容
     * @return authorizationContent
     */
    public String getAuthorizationContent() {
        return authorizationContent;
    }

    public void setAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserCenterAuthorizationV2Req that = (CreateUserCenterAuthorizationV2Req) obj;
        return Objects.equals(this.isAuthorized, that.isAuthorized)
            && Objects.equals(this.authorizationContent, that.authorizationContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAuthorized, authorizationContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserCenterAuthorizationV2Req {\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    authorizationContent: ").append(toIndentedString(authorizationContent)).append("\n");
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
