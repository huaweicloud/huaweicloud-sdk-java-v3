package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class PauseDisasterRecoveryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_id")

    private String disasterRecoveryId;

    public PauseDisasterRecoveryRequest withDisasterRecoveryId(String disasterRecoveryId) {
        this.disasterRecoveryId = disasterRecoveryId;
        return this;
    }

    /**
     * 容灾ID
     * @return disasterRecoveryId
     */
    public String getDisasterRecoveryId() {
        return disasterRecoveryId;
    }

    public void setDisasterRecoveryId(String disasterRecoveryId) {
        this.disasterRecoveryId = disasterRecoveryId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PauseDisasterRecoveryRequest pauseDisasterRecoveryRequest = (PauseDisasterRecoveryRequest) o;
        return Objects.equals(this.disasterRecoveryId, pauseDisasterRecoveryRequest.disasterRecoveryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PauseDisasterRecoveryRequest {\n");
        sb.append("    disasterRecoveryId: ").append(toIndentedString(disasterRecoveryId)).append("\n");
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
