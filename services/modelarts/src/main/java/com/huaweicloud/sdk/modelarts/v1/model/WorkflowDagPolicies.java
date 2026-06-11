package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * dag policy struct
 */
public class WorkflowDagPolicies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_cache")

    private Boolean useCache;

    public WorkflowDagPolicies withUseCache(Boolean useCache) {
        this.useCache = useCache;
        return this;
    }

    /**
     * 是否使用缓存。
     * @return useCache
     */
    public Boolean getUseCache() {
        return useCache;
    }

    public void setUseCache(Boolean useCache) {
        this.useCache = useCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowDagPolicies that = (WorkflowDagPolicies) obj;
        return Objects.equals(this.useCache, that.useCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowDagPolicies {\n");
        sb.append("    useCache: ").append(toIndentedString(useCache)).append("\n");
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
