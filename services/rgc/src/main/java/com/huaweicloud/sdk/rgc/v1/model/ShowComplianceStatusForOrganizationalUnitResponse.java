package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowComplianceStatusForOrganizationalUnitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_status")

    private String complianceStatus;

    public ShowComplianceStatusForOrganizationalUnitResponse withComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
        return this;
    }

    /**
     * 合规状态。
     * @return complianceStatus
     */
    public String getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowComplianceStatusForOrganizationalUnitResponse that =
            (ShowComplianceStatusForOrganizationalUnitResponse) obj;
        return Objects.equals(this.complianceStatus, that.complianceStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComplianceStatusForOrganizationalUnitResponse {\n");
        sb.append("    complianceStatus: ").append(toIndentedString(complianceStatus)).append("\n");
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
