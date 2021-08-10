package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class CreateHealthmonitorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private CreateHealthmonitorReq healthmonitor;

    public CreateHealthmonitorRequestBody withHealthmonitor(CreateHealthmonitorReq healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public CreateHealthmonitorRequestBody withHealthmonitor(Consumer<CreateHealthmonitorReq> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new CreateHealthmonitorReq();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /** Get healthmonitor
     * 
     * @return healthmonitor */
    public CreateHealthmonitorReq getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(CreateHealthmonitorReq healthmonitor) {
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
        CreateHealthmonitorRequestBody createHealthmonitorRequestBody = (CreateHealthmonitorRequestBody) o;
        return Objects.equals(this.healthmonitor, createHealthmonitorRequestBody.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthmonitorRequestBody {\n");
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
