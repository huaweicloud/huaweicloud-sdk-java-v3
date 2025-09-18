package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NewExtensionInputs
 */
public class NewExtensionInputs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_prop")

    private ExtensionExtendProp extendProp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation")

    private ExtensionValidation validation;

    public NewExtensionInputs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewExtensionInputs withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NewExtensionInputs withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * **参数解释**： 标签。 **取值范围**： 不涉及。 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public NewExtensionInputs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 说明。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NewExtensionInputs withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * **参数解释**： 默认值。 **取值范围**： 不涉及。 
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public NewExtensionInputs withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * **参数解释**： 是否必填。 **取值范围**： - true：必填。 - false：非必填。 
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public NewExtensionInputs withExtendProp(ExtensionExtendProp extendProp) {
        this.extendProp = extendProp;
        return this;
    }

    public NewExtensionInputs withExtendProp(Consumer<ExtensionExtendProp> extendPropSetter) {
        if (this.extendProp == null) {
            this.extendProp = new ExtensionExtendProp();
            extendPropSetter.accept(this.extendProp);
        }

        return this;
    }

    /**
     * Get extendProp
     * @return extendProp
     */
    public ExtensionExtendProp getExtendProp() {
        return extendProp;
    }

    public void setExtendProp(ExtensionExtendProp extendProp) {
        this.extendProp = extendProp;
    }

    public NewExtensionInputs withValidation(ExtensionValidation validation) {
        this.validation = validation;
        return this;
    }

    public NewExtensionInputs withValidation(Consumer<ExtensionValidation> validationSetter) {
        if (this.validation == null) {
            this.validation = new ExtensionValidation();
            validationSetter.accept(this.validation);
        }

        return this;
    }

    /**
     * Get validation
     * @return validation
     */
    public ExtensionValidation getValidation() {
        return validation;
    }

    public void setValidation(ExtensionValidation validation) {
        this.validation = validation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewExtensionInputs that = (NewExtensionInputs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.label, that.label) && Objects.equals(this.description, that.description)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.required, that.required)
            && Objects.equals(this.extendProp, that.extendProp) && Objects.equals(this.validation, that.validation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, label, description, defaultValue, required, extendProp, validation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewExtensionInputs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    extendProp: ").append(toIndentedString(extendProp)).append("\n");
        sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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
