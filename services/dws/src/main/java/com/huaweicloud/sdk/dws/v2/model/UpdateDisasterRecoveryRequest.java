package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDisasterRecoveryRequest
 */
public class UpdateDisasterRecoveryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery")

    private UpdateDisasterRecoveryReq disasterRecovery;

    public UpdateDisasterRecoveryRequest withDisasterRecovery(UpdateDisasterRecoveryReq disasterRecovery) {
        this.disasterRecovery = disasterRecovery;
        return this;
    }

    public UpdateDisasterRecoveryRequest withDisasterRecovery(
        Consumer<UpdateDisasterRecoveryReq> disasterRecoverySetter) {
        if (this.disasterRecovery == null) {
            this.disasterRecovery = new UpdateDisasterRecoveryReq();
            disasterRecoverySetter.accept(this.disasterRecovery);
        }

        return this;
    }

    /**
     * Get disasterRecovery
     * @return disasterRecovery
     */
    public UpdateDisasterRecoveryReq getDisasterRecovery() {
        return disasterRecovery;
    }

    public void setDisasterRecovery(UpdateDisasterRecoveryReq disasterRecovery) {
        this.disasterRecovery = disasterRecovery;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDisasterRecoveryRequest that = (UpdateDisasterRecoveryRequest) obj;
        return Objects.equals(this.disasterRecovery, that.disasterRecovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDisasterRecoveryRequest {\n");
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
