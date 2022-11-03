package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * update Health Check request
 */
public class UpdateHealthCheckRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check")

    private UpdateHealthCheckOption healthCheck;

    public UpdateHealthCheckRequestBody withHealthCheck(UpdateHealthCheckOption healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public UpdateHealthCheckRequestBody withHealthCheck(Consumer<UpdateHealthCheckOption> healthCheckSetter) {
        if (this.healthCheck == null) {
            this.healthCheck = new UpdateHealthCheckOption();
            healthCheckSetter.accept(this.healthCheck);
        }

        return this;
    }

    /**
     * Get healthCheck
     * @return healthCheck
     */
    public UpdateHealthCheckOption getHealthCheck() {
        return healthCheck;
    }

    public void setHealthCheck(UpdateHealthCheckOption healthCheck) {
        this.healthCheck = healthCheck;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHealthCheckRequestBody updateHealthCheckRequestBody = (UpdateHealthCheckRequestBody) o;
        return Objects.equals(this.healthCheck, updateHealthCheckRequestBody.healthCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthCheckRequestBody {\n");
        sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
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
