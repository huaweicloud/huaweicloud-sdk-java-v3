package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户配置权限修改请求体。
 */
public class AccountConfigModifyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_agency_status")

    private String obsAgencyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_agency_status")

    private String scmAgencyStatus;

    public AccountConfigModifyRequest withObsAgencyStatus(String obsAgencyStatus) {
        this.obsAgencyStatus = obsAgencyStatus;
        return this;
    }

    /**
     * OBS委托授权，使用OBS私有桶作为源站时需要开启该委托授权。当前仅支持传on：开启OBS委托授权。
     * @return obsAgencyStatus
     */
    public String getObsAgencyStatus() {
        return obsAgencyStatus;
    }

    public void setObsAgencyStatus(String obsAgencyStatus) {
        this.obsAgencyStatus = obsAgencyStatus;
    }

    public AccountConfigModifyRequest withScmAgencyStatus(String scmAgencyStatus) {
        this.scmAgencyStatus = scmAgencyStatus;
        return this;
    }

    /**
     * SCM委托授权，配置HTTPS证书时，证书来源选择SCM证书时需要开启该委托授权。当前仅支持传on：开启SCM委托授权。
     * @return scmAgencyStatus
     */
    public String getScmAgencyStatus() {
        return scmAgencyStatus;
    }

    public void setScmAgencyStatus(String scmAgencyStatus) {
        this.scmAgencyStatus = scmAgencyStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountConfigModifyRequest that = (AccountConfigModifyRequest) obj;
        return Objects.equals(this.obsAgencyStatus, that.obsAgencyStatus)
            && Objects.equals(this.scmAgencyStatus, that.scmAgencyStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsAgencyStatus, scmAgencyStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountConfigModifyRequest {\n");
        sb.append("    obsAgencyStatus: ").append(toIndentedString(obsAgencyStatus)).append("\n");
        sb.append("    scmAgencyStatus: ").append(toIndentedString(scmAgencyStatus)).append("\n");
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
