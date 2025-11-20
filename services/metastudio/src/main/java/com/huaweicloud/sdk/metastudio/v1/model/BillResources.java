package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 计费资源信息
 */
public class BillResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private BillResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_nums")

    private Integer resourceNums;

    public BillResources withResourceType(BillResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public BillResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(BillResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public BillResources withResourceNums(Integer resourceNums) {
        this.resourceNums = resourceNums;
        return this;
    }

    /**
     * 资源数量。
     * minimum: 0
     * maximum: 1000000
     * @return resourceNums
     */
    public Integer getResourceNums() {
        return resourceNums;
    }

    public void setResourceNums(Integer resourceNums) {
        this.resourceNums = resourceNums;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillResources that = (BillResources) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceNums, that.resourceNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceNums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillResources {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceNums: ").append(toIndentedString(resourceNums)).append("\n");
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
