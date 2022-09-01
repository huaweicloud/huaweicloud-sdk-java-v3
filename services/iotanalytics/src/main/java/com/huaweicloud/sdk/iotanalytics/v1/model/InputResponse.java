package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InputResponse
 */
public class InputResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_reference")

    @JacksonXmlProperty(localName = "property_reference")

    private PropertyReferenceResponse propertyReference;

    public InputResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputResponse withPropertyReference(PropertyReferenceResponse propertyReference) {
        this.propertyReference = propertyReference;
        return this;
    }

    public InputResponse withPropertyReference(Consumer<PropertyReferenceResponse> propertyReferenceSetter) {
        if (this.propertyReference == null) {
            this.propertyReference = new PropertyReferenceResponse();
            propertyReferenceSetter.accept(this.propertyReference);
        }

        return this;
    }

    /**
     * Get propertyReference
     * @return propertyReference
     */
    public PropertyReferenceResponse getPropertyReference() {
        return propertyReference;
    }

    public void setPropertyReference(PropertyReferenceResponse propertyReference) {
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
        InputResponse inputResponse = (InputResponse) o;
        return Objects.equals(this.name, inputResponse.name)
            && Objects.equals(this.propertyReference, inputResponse.propertyReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, propertyReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputResponse {\n");
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
