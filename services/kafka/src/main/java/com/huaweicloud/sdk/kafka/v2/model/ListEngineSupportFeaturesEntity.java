package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 实例支持的功能特性。 **取值范围**： 不涉及。
 */
public class ListEngineSupportFeaturesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ListEngineSupportFeaturesPropertiesEntity properties;

    public ListEngineSupportFeaturesEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 功能名称。 **取值范围**： 不涉及。
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEngineSupportFeaturesEntity that = (ListEngineSupportFeaturesEntity) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.properties, that.properties);
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
