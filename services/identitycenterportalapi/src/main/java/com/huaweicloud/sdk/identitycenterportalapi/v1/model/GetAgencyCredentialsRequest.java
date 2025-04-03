package com.huaweicloud.sdk.identitycenterportalapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetAgencyCredentialsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access-token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_account_id")

    private String targetAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_urn")

    private String agencyUrn;

    public GetAgencyCredentialsRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * 创建令牌接口调用签发的访问令牌
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public GetAgencyCredentialsRequest withTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
        return this;
    }

    /**
     * 目标账户的全局唯一标识符（ID）
     * @return targetAccountId
     */
    public String getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public GetAgencyCredentialsRequest withAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
        return this;
    }

    /**
     * 委托或信任委托的统一资源名称（URN）
     * @return agencyUrn
     */
    public String getAgencyUrn() {
        return agencyUrn;
    }

    public void setAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAgencyCredentialsRequest that = (GetAgencyCredentialsRequest) obj;
        return Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.targetAccountId, that.targetAccountId)
            && Objects.equals(this.agencyUrn, that.agencyUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, targetAccountId, agencyUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAgencyCredentialsRequest {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
        sb.append("    agencyUrn: ").append(toIndentedString(agencyUrn)).append("\n");
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
