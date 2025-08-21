package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowComplianceStatusForAccountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_account_id")

    private String managedAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_id")

    private String controlId;

    public ShowComplianceStatusForAccountRequest withManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
        return this;
    }

    /**
     * 纳管账号ID。
     * @return managedAccountId
     */
    public String getManagedAccountId() {
        return managedAccountId;
    }

    public void setManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
    }

    public ShowComplianceStatusForAccountRequest withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * 控制策略ID。
     * @return controlId
     */
    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowComplianceStatusForAccountRequest that = (ShowComplianceStatusForAccountRequest) obj;
        return Objects.equals(this.managedAccountId, that.managedAccountId)
            && Objects.equals(this.controlId, that.controlId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedAccountId, controlId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComplianceStatusForAccountRequest {\n");
        sb.append("    managedAccountId: ").append(toIndentedString(managedAccountId)).append("\n");
        sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
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
