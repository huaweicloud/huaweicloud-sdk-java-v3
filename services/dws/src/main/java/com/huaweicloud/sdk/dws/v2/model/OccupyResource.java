package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 用户占用资源列表。 **取值范围**： 不涉及。
 */
public class OccupyResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_value")

    private Integer resourceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_unit")

    private String valueUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_description")

    private String resourceDescription;

    public OccupyResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**： 资源项名称。 **取值范围**： 不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public OccupyResource withResourceValue(Integer resourceValue) {
        this.resourceValue = resourceValue;
        return this;
    }

    /**
     * **参数解释**： 资源属性数值。 **取值范围**： 不涉及。
     * @return resourceValue
     */
    public Integer getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(Integer resourceValue) {
        this.resourceValue = resourceValue;
    }

    public OccupyResource withValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
        return this;
    }

    /**
     * **参数解释**： 资源属性单位。 **取值范围**： 不涉及。
     * @return valueUnit
     */
    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public OccupyResource withResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
        return this;
    }

    /**
     * **参数解释**： 资源附加描述。 **取值范围**： 不涉及。
     * @return resourceDescription
     */
    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OccupyResource that = (OccupyResource) obj;
        return Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceValue, that.resourceValue) && Objects.equals(this.valueUnit, that.valueUnit)
            && Objects.equals(this.resourceDescription, that.resourceDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, resourceValue, valueUnit, resourceDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OccupyResource {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceValue: ").append(toIndentedString(resourceValue)).append("\n");
        sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
        sb.append("    resourceDescription: ").append(toIndentedString(resourceDescription)).append("\n");
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
