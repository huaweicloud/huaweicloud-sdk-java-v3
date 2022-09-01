package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateHealthmonitorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    @JacksonXmlProperty(localName = "healthmonitor")

    private HealthmonitorResp healthmonitor;

    public UpdateHealthmonitorResponse withHealthmonitor(HealthmonitorResp healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public UpdateHealthmonitorResponse withHealthmonitor(Consumer<HealthmonitorResp> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new HealthmonitorResp();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public HealthmonitorResp getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(HealthmonitorResp healthmonitor) {
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
        UpdateHealthmonitorResponse updateHealthmonitorResponse = (UpdateHealthmonitorResponse) o;
        return Objects.equals(this.healthmonitor, updateHealthmonitorResponse.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthmonitorResponse {\n");
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
