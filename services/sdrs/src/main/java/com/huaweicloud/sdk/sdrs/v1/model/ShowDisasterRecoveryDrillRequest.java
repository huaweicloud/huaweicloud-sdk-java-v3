package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDisasterRecoveryDrillRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drill_id")

    private String disasterRecoveryDrillId;

    public ShowDisasterRecoveryDrillRequest withDisasterRecoveryDrillId(String disasterRecoveryDrillId) {
        this.disasterRecoveryDrillId = disasterRecoveryDrillId;
        return this;
    }

    /**
     * 容灾演练的ID。
     * @return disasterRecoveryDrillId
     */
    public String getDisasterRecoveryDrillId() {
        return disasterRecoveryDrillId;
    }

    public void setDisasterRecoveryDrillId(String disasterRecoveryDrillId) {
        this.disasterRecoveryDrillId = disasterRecoveryDrillId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDisasterRecoveryDrillRequest that = (ShowDisasterRecoveryDrillRequest) obj;
        return Objects.equals(this.disasterRecoveryDrillId, that.disasterRecoveryDrillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryDrillId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDisasterRecoveryDrillRequest {\n");
        sb.append("    disasterRecoveryDrillId: ").append(toIndentedString(disasterRecoveryDrillId)).append("\n");
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
