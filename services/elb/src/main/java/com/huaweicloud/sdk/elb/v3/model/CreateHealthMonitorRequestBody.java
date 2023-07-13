package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateHealthMonitorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private CreateHealthMonitorOption healthmonitor;

    public CreateHealthMonitorRequestBody withHealthmonitor(CreateHealthMonitorOption healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public CreateHealthMonitorRequestBody withHealthmonitor(Consumer<CreateHealthMonitorOption> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new CreateHealthMonitorOption();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public CreateHealthMonitorOption getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(CreateHealthMonitorOption healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHealthMonitorRequestBody that = (CreateHealthMonitorRequestBody) obj;
        return Objects.equals(this.healthmonitor, that.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthMonitorRequestBody {\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
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
