package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源聚合器授权请求体。
 */
public class AggregationAuthorizationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_account_id")

    private String authorizedAccountId;

    public AggregationAuthorizationRequest withAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }

    /**
     * 要授权的资源聚合器的帐号ID。
     * @return authorizedAccountId
     */
    public String getAuthorizedAccountId() {
        return authorizedAccountId;
    }

    public void setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregationAuthorizationRequest aggregationAuthorizationRequest = (AggregationAuthorizationRequest) o;
        return Objects.equals(this.authorizedAccountId, aggregationAuthorizationRequest.authorizedAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizedAccountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregationAuthorizationRequest {\n");
        sb.append("    authorizedAccountId: ").append(toIndentedString(authorizedAccountId)).append("\n");
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
