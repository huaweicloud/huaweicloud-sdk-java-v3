package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class CloudResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_count")

    private Integer resourceCount;

    public CloudResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /** 功能描述：资源类型
     * 
     * @return resourceType */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public CloudResource withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    /** 功能说明：资源数量
     * 
     * @return resourceCount */
    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudResource cloudResource = (CloudResource) o;
        return Objects.equals(this.resourceType, cloudResource.resourceType)
            && Objects.equals(this.resourceCount, cloudResource.resourceCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudResource {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceCount: ").append(toIndentedString(resourceCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
