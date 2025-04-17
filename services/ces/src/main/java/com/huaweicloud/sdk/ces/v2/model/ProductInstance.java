package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductInstance
 */
public class ProductInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_dimension_name")

    private String firstDimensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_dimension_value")

    private String firstDimensionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public ProductInstance withFirstDimensionName(String firstDimensionName) {
        this.firstDimensionName = firstDimensionName;
        return this;
    }

    /**
     * 资源首层维度，如：弹性云服务器，则维度为instance_id；”。
     * @return firstDimensionName
     */
    public String getFirstDimensionName() {
        return firstDimensionName;
    }

    public void setFirstDimensionName(String firstDimensionName) {
        this.firstDimensionName = firstDimensionName;
    }

    public ProductInstance withFirstDimensionValue(String firstDimensionValue) {
        this.firstDimensionValue = firstDimensionValue;
        return this;
    }

    /**
     * 资源首层维度值，为资源的实例ID，如：4270ff17-aba3-4138-89fa-820594c39755。
     * @return firstDimensionValue
     */
    public String getFirstDimensionValue() {
        return firstDimensionValue;
    }

    public void setFirstDimensionValue(String firstDimensionValue) {
        this.firstDimensionValue = firstDimensionValue;
    }

    public ProductInstance withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInstance that = (ProductInstance) obj;
        return Objects.equals(this.firstDimensionName, that.firstDimensionName)
            && Objects.equals(this.firstDimensionValue, that.firstDimensionValue)
            && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstDimensionName, firstDimensionValue, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInstance {\n");
        sb.append("    firstDimensionName: ").append(toIndentedString(firstDimensionName)).append("\n");
        sb.append("    firstDimensionValue: ").append(toIndentedString(firstDimensionValue)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
