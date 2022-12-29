package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StartAndStopDeploymentPodResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    public StartAndStopDeploymentPodResponse withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * pod的ID
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartAndStopDeploymentPodResponse startAndStopDeploymentPodResponse = (StartAndStopDeploymentPodResponse) o;
        return Objects.equals(this.podId, startAndStopDeploymentPodResponse.podId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(podId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartAndStopDeploymentPodResponse {\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
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
