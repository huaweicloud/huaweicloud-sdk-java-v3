package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyTriggerResp
 */
public class PolicyTriggerResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private PolicyTriggerPropertiesResp properties;

    public PolicyTriggerResp withProperties(PolicyTriggerPropertiesResp properties) {
        this.properties = properties;
        return this;
    }

    public PolicyTriggerResp withProperties(Consumer<PolicyTriggerPropertiesResp> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new PolicyTriggerPropertiesResp();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public PolicyTriggerPropertiesResp getProperties() {
        return properties;
    }

    public void setProperties(PolicyTriggerPropertiesResp properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyTriggerResp that = (PolicyTriggerResp) obj;
        return Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTriggerResp {\n");
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
