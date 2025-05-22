package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源配置。
 */
public class ChatResourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_resource")

    private Integer countResource;

    public ChatResourceConfig withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ChatResourceConfig withCountResource(Integer countResource) {
        this.countResource = countResource;
        return this;
    }

    /**
     * 资源数量
     * minimum: 0
     * maximum: 10000
     * @return countResource
     */
    public Integer getCountResource() {
        return countResource;
    }

    public void setCountResource(Integer countResource) {
        this.countResource = countResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatResourceConfig that = (ChatResourceConfig) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.countResource, that.countResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, countResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatResourceConfig {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    countResource: ").append(toIndentedString(countResource)).append("\n");
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
