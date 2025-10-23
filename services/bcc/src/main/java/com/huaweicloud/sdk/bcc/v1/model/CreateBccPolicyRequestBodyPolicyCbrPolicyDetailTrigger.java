package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调度器属性。
 */
public class CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties properties;

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger withProperties(
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties properties) {
        this.properties = properties;
        return this;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger withProperties(
        Consumer<CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties getProperties() {
        return properties;
    }

    public void setProperties(CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTriggerProperties properties) {
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
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger that =
            (CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger) obj;
        return Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger {\n");
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
