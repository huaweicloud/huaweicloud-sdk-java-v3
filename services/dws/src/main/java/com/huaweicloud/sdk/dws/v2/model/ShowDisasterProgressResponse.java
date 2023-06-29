package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDisasterProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_progress")

    private ClusterDisasterRecovery disasterRecoveryProgress;

    public ShowDisasterProgressResponse withDisasterRecoveryProgress(ClusterDisasterRecovery disasterRecoveryProgress) {
        this.disasterRecoveryProgress = disasterRecoveryProgress;
        return this;
    }

    public ShowDisasterProgressResponse withDisasterRecoveryProgress(
        Consumer<ClusterDisasterRecovery> disasterRecoveryProgressSetter) {
        if (this.disasterRecoveryProgress == null) {
            this.disasterRecoveryProgress = new ClusterDisasterRecovery();
            disasterRecoveryProgressSetter.accept(this.disasterRecoveryProgress);
        }

        return this;
    }

    /**
     * Get disasterRecoveryProgress
     * @return disasterRecoveryProgress
     */
    public ClusterDisasterRecovery getDisasterRecoveryProgress() {
        return disasterRecoveryProgress;
    }

    public void setDisasterRecoveryProgress(ClusterDisasterRecovery disasterRecoveryProgress) {
        this.disasterRecoveryProgress = disasterRecoveryProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDisasterProgressResponse that = (ShowDisasterProgressResponse) obj;
        return Objects.equals(this.disasterRecoveryProgress, that.disasterRecoveryProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDisasterProgressResponse {\n");
        sb.append("    disasterRecoveryProgress: ").append(toIndentedString(disasterRecoveryProgress)).append("\n");
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
