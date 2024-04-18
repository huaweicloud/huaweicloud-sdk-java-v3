package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetCallerIdentityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_urn")

    private String principalUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_id")

    private String principalId;

    public GetCallerIdentityResponse withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 华为云账号ID。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public GetCallerIdentityResponse withPrincipalUrn(String principalUrn) {
        this.principalUrn = principalUrn;
        return this;
    }

    /**
     * 主体URN。
     * @return principalUrn
     */
    public String getPrincipalUrn() {
        return principalUrn;
    }

    public void setPrincipalUrn(String principalUrn) {
        this.principalUrn = principalUrn;
    }

    public GetCallerIdentityResponse withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * 主体ID。
     * @return principalId
     */
    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetCallerIdentityResponse that = (GetCallerIdentityResponse) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.principalUrn, that.principalUrn)
            && Objects.equals(this.principalId, that.principalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, principalUrn, principalId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCallerIdentityResponse {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    principalUrn: ").append(toIndentedString(principalUrn)).append("\n");
        sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
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
