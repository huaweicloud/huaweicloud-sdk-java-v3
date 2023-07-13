package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作负载队列资源项
 */
public class WorkloadResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_value")

    private Integer resourceValue;

    public WorkloadResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public WorkloadResource withResourceValue(Integer resourceValue) {
        this.resourceValue = resourceValue;
        return this;
    }

    /**
     * 资源属性值。
     * @return resourceValue
     */
    public Integer getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(Integer resourceValue) {
        this.resourceValue = resourceValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadResource that = (WorkloadResource) obj;
        return Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceValue, that.resourceValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, resourceValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadResource {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceValue: ").append(toIndentedString(resourceValue)).append("\n");
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
