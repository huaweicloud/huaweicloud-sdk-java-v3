package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InputModel
 */
public class InputModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_reference")

    private PropertyReferenceModel propertyReference;

    public InputModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称，正则：\"^[A-Za-z][A-Za-z_]{0,31}$\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputModel withPropertyReference(PropertyReferenceModel propertyReference) {
        this.propertyReference = propertyReference;
        return this;
    }

    public InputModel withPropertyReference(Consumer<PropertyReferenceModel> propertyReferenceSetter) {
        if (this.propertyReference == null) {
            this.propertyReference = new PropertyReferenceModel();
            propertyReferenceSetter.accept(this.propertyReference);
        }

        return this;
    }

    /**
     * Get propertyReference
     * @return propertyReference
     */
    public PropertyReferenceModel getPropertyReference() {
        return propertyReference;
    }

    public void setPropertyReference(PropertyReferenceModel propertyReference) {
        this.propertyReference = propertyReference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputModel that = (InputModel) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.propertyReference, that.propertyReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, propertyReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputModel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    propertyReference: ").append(toIndentedString(propertyReference)).append("\n");
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
