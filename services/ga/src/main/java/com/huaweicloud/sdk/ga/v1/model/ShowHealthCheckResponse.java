package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHealthCheckResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check")

    private HealthCheckDetail healthCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowHealthCheckResponse withHealthCheck(HealthCheckDetail healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public ShowHealthCheckResponse withHealthCheck(Consumer<HealthCheckDetail> healthCheckSetter) {
        if (this.healthCheck == null) {
            this.healthCheck = new HealthCheckDetail();
            healthCheckSetter.accept(this.healthCheck);
        }

        return this;
    }

    /**
     * Get healthCheck
     * @return healthCheck
     */
    public HealthCheckDetail getHealthCheck() {
        return healthCheck;
    }

    public void setHealthCheck(HealthCheckDetail healthCheck) {
        this.healthCheck = healthCheck;
    }

    public ShowHealthCheckResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHealthCheckResponse showHealthCheckResponse = (ShowHealthCheckResponse) o;
        return Objects.equals(this.healthCheck, showHealthCheckResponse.healthCheck)
            && Objects.equals(this.requestId, showHealthCheckResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthCheck, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthCheckResponse {\n");
        sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
