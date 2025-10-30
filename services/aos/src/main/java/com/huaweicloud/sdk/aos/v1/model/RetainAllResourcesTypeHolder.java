package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RetainAllResourcesTypeHolder
 */
public class RetainAllResourcesTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retain_all_resources")

    private Boolean retainAllResources;

    public RetainAllResourcesTypeHolder withRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }

    /**
     * 删除资源栈是否保留资源的标志位，如果不传默认为false，即默认不保留资源（删除资源栈后会删除资源栈中的资源）  DeleteStackEnhanced API中，如果该参数未在RequestBody中给予，则删除时不会保留资源栈中的资源
     * @return retainAllResources
     */
    public Boolean getRetainAllResources() {
        return retainAllResources;
    }

    public void setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetainAllResourcesTypeHolder that = (RetainAllResourcesTypeHolder) obj;
        return Objects.equals(this.retainAllResources, that.retainAllResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retainAllResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetainAllResourcesTypeHolder {\n");
        sb.append("    retainAllResources: ").append(toIndentedString(retainAllResources)).append("\n");
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
