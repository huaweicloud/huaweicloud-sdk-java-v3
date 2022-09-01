package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPropertyValuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private List<PropertyValue> properties = null;

    public ShowPropertyValuesResponse withProperties(List<PropertyValue> properties) {
        this.properties = properties;
        return this;
    }

    public ShowPropertyValuesResponse addPropertiesItem(PropertyValue propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public ShowPropertyValuesResponse withProperties(Consumer<List<PropertyValue>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 查询设备的属性值
     * @return properties
     */
    public List<PropertyValue> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyValue> properties) {
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
        ShowPropertyValuesResponse showPropertyValuesResponse = (ShowPropertyValuesResponse) o;
        return Objects.equals(this.properties, showPropertyValuesResponse.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPropertyValuesResponse {\n");
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
