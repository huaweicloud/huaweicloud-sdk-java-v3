package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePolicyReqBody
 */
public class UpdatePolicyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private PolicyDefinition definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation_mode")

    private ValidationMode validationMode;

    public UpdatePolicyReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略的更新描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePolicyReqBody withDefinition(PolicyDefinition definition) {
        this.definition = definition;
        return this;
    }

    public UpdatePolicyReqBody withDefinition(Consumer<PolicyDefinition> definitionSetter) {
        if (this.definition == null) {
            this.definition = new PolicyDefinition();
            definitionSetter.accept(this.definition);
        }

        return this;
    }

    /**
     * Get definition
     * @return definition
     */
    public PolicyDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(PolicyDefinition definition) {
        this.definition = definition;
    }

    public UpdatePolicyReqBody withValidationMode(ValidationMode validationMode) {
        this.validationMode = validationMode;
        return this;
    }

    /**
     * Get validationMode
     * @return validationMode
     */
    public ValidationMode getValidationMode() {
        return validationMode;
    }

    public void setValidationMode(ValidationMode validationMode) {
        this.validationMode = validationMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePolicyReqBody that = (UpdatePolicyReqBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.definition, that.definition)
            && Objects.equals(this.validationMode, that.validationMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, definition, validationMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyReqBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    validationMode: ").append(toIndentedString(validationMode)).append("\n");
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
