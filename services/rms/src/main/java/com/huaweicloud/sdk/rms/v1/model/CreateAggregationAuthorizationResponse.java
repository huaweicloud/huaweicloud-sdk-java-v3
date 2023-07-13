package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAggregationAuthorizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_authorization_urn")

    private String aggregationAuthorizationUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_account_id")

    private String authorizedAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public CreateAggregationAuthorizationResponse withAggregationAuthorizationUrn(String aggregationAuthorizationUrn) {
        this.aggregationAuthorizationUrn = aggregationAuthorizationUrn;
        return this;
    }

    /**
     * 资源聚合器授权标识符。
     * @return aggregationAuthorizationUrn
     */
    public String getAggregationAuthorizationUrn() {
        return aggregationAuthorizationUrn;
    }

    public void setAggregationAuthorizationUrn(String aggregationAuthorizationUrn) {
        this.aggregationAuthorizationUrn = aggregationAuthorizationUrn;
    }

    public CreateAggregationAuthorizationResponse withAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }

    /**
     * 授权的资源聚合器的帐号ID。
     * @return authorizedAccountId
     */
    public String getAuthorizedAccountId() {
        return authorizedAccountId;
    }

    public void setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
    }

    public CreateAggregationAuthorizationResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 资源聚合器授权的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAggregationAuthorizationResponse that = (CreateAggregationAuthorizationResponse) obj;
        return Objects.equals(this.aggregationAuthorizationUrn, that.aggregationAuthorizationUrn)
            && Objects.equals(this.authorizedAccountId, that.authorizedAccountId)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregationAuthorizationUrn, authorizedAccountId, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAggregationAuthorizationResponse {\n");
        sb.append("    aggregationAuthorizationUrn: ")
            .append(toIndentedString(aggregationAuthorizationUrn))
            .append("\n");
        sb.append("    authorizedAccountId: ").append(toIndentedString(authorizedAccountId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
