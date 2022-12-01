package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PauseDisasterRecoveryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery")

    private DisasterRecoveryId disasterRecovery;

    public PauseDisasterRecoveryResponse withDisasterRecovery(DisasterRecoveryId disasterRecovery) {
        this.disasterRecovery = disasterRecovery;
        return this;
    }

    public PauseDisasterRecoveryResponse withDisasterRecovery(Consumer<DisasterRecoveryId> disasterRecoverySetter) {
        if (this.disasterRecovery == null) {
            this.disasterRecovery = new DisasterRecoveryId();
            disasterRecoverySetter.accept(this.disasterRecovery);
        }

        return this;
    }

    /**
     * Get disasterRecovery
     * @return disasterRecovery
     */
    public DisasterRecoveryId getDisasterRecovery() {
        return disasterRecovery;
    }

    public void setDisasterRecovery(DisasterRecoveryId disasterRecovery) {
        this.disasterRecovery = disasterRecovery;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PauseDisasterRecoveryResponse pauseDisasterRecoveryResponse = (PauseDisasterRecoveryResponse) o;
        return Objects.equals(this.disasterRecovery, pauseDisasterRecoveryResponse.disasterRecovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PauseDisasterRecoveryResponse {\n");
        sb.append("    disasterRecovery: ").append(toIndentedString(disasterRecovery)).append("\n");
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
