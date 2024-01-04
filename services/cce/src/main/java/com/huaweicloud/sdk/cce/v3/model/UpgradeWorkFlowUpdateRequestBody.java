package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpgradeWorkFlowUpdateRequestBody
 */
public class UpgradeWorkFlowUpdateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private UpgradeWorkFlowUpdateRequestBodyStatus status;

    public UpgradeWorkFlowUpdateRequestBody withStatus(UpgradeWorkFlowUpdateRequestBodyStatus status) {
        this.status = status;
        return this;
    }

    public UpgradeWorkFlowUpdateRequestBody withStatus(Consumer<UpgradeWorkFlowUpdateRequestBodyStatus> statusSetter) {
        if (this.status == null) {
            this.status = new UpgradeWorkFlowUpdateRequestBodyStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public UpgradeWorkFlowUpdateRequestBodyStatus getStatus() {
        return status;
    }

    public void setStatus(UpgradeWorkFlowUpdateRequestBodyStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeWorkFlowUpdateRequestBody that = (UpgradeWorkFlowUpdateRequestBody) obj;
        return Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeWorkFlowUpdateRequestBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
