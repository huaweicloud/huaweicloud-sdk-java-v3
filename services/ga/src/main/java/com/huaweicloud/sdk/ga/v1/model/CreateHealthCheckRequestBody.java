package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * create Health Check request
 */
public class CreateHealthCheckRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check")

    private CreateHealthCheckOption healthCheck;

    public CreateHealthCheckRequestBody withHealthCheck(CreateHealthCheckOption healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public CreateHealthCheckRequestBody withHealthCheck(Consumer<CreateHealthCheckOption> healthCheckSetter) {
        if (this.healthCheck == null) {
            this.healthCheck = new CreateHealthCheckOption();
            healthCheckSetter.accept(this.healthCheck);
        }

        return this;
    }

    /**
     * Get healthCheck
     * @return healthCheck
     */
    public CreateHealthCheckOption getHealthCheck() {
        return healthCheck;
    }

    public void setHealthCheck(CreateHealthCheckOption healthCheck) {
        this.healthCheck = healthCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHealthCheckRequestBody that = (CreateHealthCheckRequestBody) obj;
        return Objects.equals(this.healthCheck, that.healthCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthCheckRequestBody {\n");
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
