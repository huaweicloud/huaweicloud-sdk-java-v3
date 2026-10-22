package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：HeadGroup的配置。
 */
public class HeadGroupSpecV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private ResourceSpecV3 resource;

    public HeadGroupSpecV3 withResource(ResourceSpecV3 resource) {
        this.resource = resource;
        return this;
    }

    public HeadGroupSpecV3 withResource(Consumer<ResourceSpecV3> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ResourceSpecV3();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public ResourceSpecV3 getResource() {
        return resource;
    }

    public void setResource(ResourceSpecV3 resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HeadGroupSpecV3 that = (HeadGroupSpecV3) obj;
        return Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HeadGroupSpecV3 {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
