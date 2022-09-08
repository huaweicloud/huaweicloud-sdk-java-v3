package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyTriggerReq
 */
public class PolicyTriggerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private PolicyTriggerPropertiesReq properties;

    public PolicyTriggerReq withProperties(PolicyTriggerPropertiesReq properties) {
        this.properties = properties;
        return this;
    }

    public PolicyTriggerReq withProperties(Consumer<PolicyTriggerPropertiesReq> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new PolicyTriggerPropertiesReq();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public PolicyTriggerPropertiesReq getProperties() {
        return properties;
    }

    public void setProperties(PolicyTriggerPropertiesReq properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyTriggerReq policyTriggerReq = (PolicyTriggerReq) o;
        return Objects.equals(this.properties, policyTriggerReq.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTriggerReq {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
