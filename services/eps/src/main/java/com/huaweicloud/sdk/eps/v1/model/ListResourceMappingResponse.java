package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListResourceMappingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_mapping")

    private Map<String, String> resourceMapping = null;

    public ListResourceMappingResponse withResourceMapping(Map<String, String> resourceMapping) {
        this.resourceMapping = resourceMapping;
        return this;
    }

    public ListResourceMappingResponse putResourceMappingItem(String key, String resourceMappingItem) {
        if (this.resourceMapping == null) {
            this.resourceMapping = new HashMap<>();
        }
        this.resourceMapping.put(key, resourceMappingItem);
        return this;
    }

    public ListResourceMappingResponse withResourceMapping(Consumer<Map<String, String>> resourceMappingSetter) {
        if (this.resourceMapping == null) {
            this.resourceMapping = new HashMap<>();
        }
        resourceMappingSetter.accept(this.resourceMapping);
        return this;
    }

    /**
     * 资源类型映射
     * @return resourceMapping
     */
    public Map<String, String> getResourceMapping() {
        return resourceMapping;
    }

    public void setResourceMapping(Map<String, String> resourceMapping) {
        this.resourceMapping = resourceMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceMappingResponse that = (ListResourceMappingResponse) obj;
        return Objects.equals(this.resourceMapping, that.resourceMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceMappingResponse {\n");
        sb.append("    resourceMapping: ").append(toIndentedString(resourceMapping)).append("\n");
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
