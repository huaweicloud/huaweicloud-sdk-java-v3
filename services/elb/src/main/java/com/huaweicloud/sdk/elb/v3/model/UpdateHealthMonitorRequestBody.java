package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class UpdateHealthMonitorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private UpdateHealthMonitorOption healthmonitor;

    public UpdateHealthMonitorRequestBody withHealthmonitor(UpdateHealthMonitorOption healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public UpdateHealthMonitorRequestBody withHealthmonitor(Consumer<UpdateHealthMonitorOption> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new UpdateHealthMonitorOption();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /** Get healthmonitor
     * 
     * @return healthmonitor */
    public UpdateHealthMonitorOption getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(UpdateHealthMonitorOption healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHealthMonitorRequestBody updateHealthMonitorRequestBody = (UpdateHealthMonitorRequestBody) o;
        return Objects.equals(this.healthmonitor, updateHealthMonitorRequestBody.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthMonitorRequestBody {\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
