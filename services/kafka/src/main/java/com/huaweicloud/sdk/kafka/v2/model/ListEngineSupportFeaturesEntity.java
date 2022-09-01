package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例支持的功能特性。
 */
public class ListEngineSupportFeaturesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private ListEngineSupportFeaturesPropertiesEntity properties;

    public ListEngineSupportFeaturesEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListEngineSupportFeaturesEntity withProperties(ListEngineSupportFeaturesPropertiesEntity properties) {
        this.properties = properties;
        return this;
    }

    public ListEngineSupportFeaturesEntity withProperties(
        Consumer<ListEngineSupportFeaturesPropertiesEntity> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ListEngineSupportFeaturesPropertiesEntity();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ListEngineSupportFeaturesPropertiesEntity getProperties() {
        return properties;
    }

    public void setProperties(ListEngineSupportFeaturesPropertiesEntity properties) {
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
        ListEngineSupportFeaturesEntity listEngineSupportFeaturesEntity = (ListEngineSupportFeaturesEntity) o;
        return Objects.equals(this.name, listEngineSupportFeaturesEntity.name)
            && Objects.equals(this.properties, listEngineSupportFeaturesEntity.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEngineSupportFeaturesEntity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
