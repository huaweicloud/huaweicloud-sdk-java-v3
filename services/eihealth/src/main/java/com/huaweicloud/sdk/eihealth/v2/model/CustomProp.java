package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户开启的自定义属性
 */
public class CustomProp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_definition")

    private PropDefinition propDefinition;

    public CustomProp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义属性的ID（API侧）
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomProp withPropDefinition(PropDefinition propDefinition) {
        this.propDefinition = propDefinition;
        return this;
    }

    public CustomProp withPropDefinition(Consumer<PropDefinition> propDefinitionSetter) {
        if (this.propDefinition == null) {
            this.propDefinition = new PropDefinition();
            propDefinitionSetter.accept(this.propDefinition);
        }

        return this;
    }

    /**
     * Get propDefinition
     * @return propDefinition
     */
    public PropDefinition getPropDefinition() {
        return propDefinition;
    }

    public void setPropDefinition(PropDefinition propDefinition) {
        this.propDefinition = propDefinition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomProp customProp = (CustomProp) o;
        return Objects.equals(this.id, customProp.id) && Objects.equals(this.propDefinition, customProp.propDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, propDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomProp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    propDefinition: ").append(toIndentedString(propDefinition)).append("\n");
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
