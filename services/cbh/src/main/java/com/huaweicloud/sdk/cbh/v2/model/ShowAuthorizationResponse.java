package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAuthorizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private Object authorization;

    public ShowAuthorizationResponse withAuthorization(Object authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 委托授权信息。
     * @return authorization
     */
    public Object getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Object authorization) {
        this.authorization = authorization;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuthorizationResponse that = (ShowAuthorizationResponse) obj;
        return Objects.equals(this.authorization, that.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuthorizationResponse {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
