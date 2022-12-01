package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SwitchoverDisasterRecoveryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_id")

    private String disasterRecoveryId;

    public SwitchoverDisasterRecoveryRequest withDisasterRecoveryId(String disasterRecoveryId) {
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
        SwitchoverDisasterRecoveryRequest switchoverDisasterRecoveryRequest = (SwitchoverDisasterRecoveryRequest) o;
        return Objects.equals(this.disasterRecoveryId, switchoverDisasterRecoveryRequest.disasterRecoveryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchoverDisasterRecoveryRequest {\n");
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
