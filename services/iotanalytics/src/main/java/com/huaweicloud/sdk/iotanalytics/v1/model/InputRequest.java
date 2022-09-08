package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InputRequest
 */
public class InputRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_reference")

    private PropertyReferenceReq propertyReference;

    public InputRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名，正则： \"^[A-Za-z][A-Za-z_]{0,31}$\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputRequest withPropertyReference(PropertyReferenceReq propertyReference) {
        this.propertyReference = propertyReference;
        return this;
    }

    public InputRequest withPropertyReference(Consumer<PropertyReferenceReq> propertyReferenceSetter) {
        if (this.propertyReference == null) {
            this.propertyReference = new PropertyReferenceReq();
            propertyReferenceSetter.accept(this.propertyReference);
        }

        return this;
    }

    /**
     * Get propertyReference
     * @return propertyReference
     */
    public PropertyReferenceReq getPropertyReference() {
        return propertyReference;
    }

    public void setPropertyReference(PropertyReferenceReq propertyReference) {
        this.propertyReference = propertyReference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputRequest inputRequest = (InputRequest) o;
        return Objects.equals(this.name, inputRequest.name)
            && Objects.equals(this.propertyReference, inputRequest.propertyReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, propertyReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputRequest {\n");
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
