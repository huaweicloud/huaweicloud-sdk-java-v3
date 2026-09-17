package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class PutGlobalPrivacyNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agree_status")

    private Integer agreeStatus;

    public PutGlobalPrivacyNewRequest withAgreeStatus(Integer agreeStatus) {
        this.agreeStatus = agreeStatus;
        return this;
    }

    /**
     * 同意状态（1：同意）
     * @return agreeStatus
     */
    public Integer getAgreeStatus() {
        return agreeStatus;
    }

    public void setAgreeStatus(Integer agreeStatus) {
        this.agreeStatus = agreeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutGlobalPrivacyNewRequest that = (PutGlobalPrivacyNewRequest) obj;
        return Objects.equals(this.agreeStatus, that.agreeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutGlobalPrivacyNewRequest {\n");
        sb.append("    agreeStatus: ").append(toIndentedString(agreeStatus)).append("\n");
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
