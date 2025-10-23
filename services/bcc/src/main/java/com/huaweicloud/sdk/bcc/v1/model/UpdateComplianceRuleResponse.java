package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateComplianceRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_id")

    private String complianceId;

    public UpdateComplianceRuleResponse withComplianceId(String complianceId) {
        this.complianceId = complianceId;
        return this;
    }

    /**
     * 合规id
     * @return complianceId
     */
    public String getComplianceId() {
        return complianceId;
    }

    public void setComplianceId(String complianceId) {
        this.complianceId = complianceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateComplianceRuleResponse that = (UpdateComplianceRuleResponse) obj;
        return Objects.equals(this.complianceId, that.complianceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complianceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateComplianceRuleResponse {\n");
        sb.append("    complianceId: ").append(toIndentedString(complianceId)).append("\n");
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
