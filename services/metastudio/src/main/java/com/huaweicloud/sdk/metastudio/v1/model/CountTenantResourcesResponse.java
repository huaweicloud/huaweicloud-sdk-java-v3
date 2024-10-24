package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CountTenantResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_count")

    private List<ResourcesCount> resourcesCount = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CountTenantResourcesResponse withResourcesCount(List<ResourcesCount> resourcesCount) {
        this.resourcesCount = resourcesCount;
        return this;
    }

    public CountTenantResourcesResponse addResourcesCountItem(ResourcesCount resourcesCountItem) {
        if (this.resourcesCount == null) {
            this.resourcesCount = new ArrayList<>();
        }
        this.resourcesCount.add(resourcesCountItem);
        return this;
    }

    public CountTenantResourcesResponse withResourcesCount(Consumer<List<ResourcesCount>> resourcesCountSetter) {
        if (this.resourcesCount == null) {
            this.resourcesCount = new ArrayList<>();
        }
        resourcesCountSetter.accept(this.resourcesCount);
        return this;
    }

    /**
     * 资源总数列表
     * @return resourcesCount
     */
    public List<ResourcesCount> getResourcesCount() {
        return resourcesCount;
    }

    public void setResourcesCount(List<ResourcesCount> resourcesCount) {
        this.resourcesCount = resourcesCount;
    }

    public CountTenantResourcesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountTenantResourcesResponse that = (CountTenantResourcesResponse) obj;
        return Objects.equals(this.resourcesCount, that.resourcesCount)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourcesCount, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountTenantResourcesResponse {\n");
        sb.append("    resourcesCount: ").append(toIndentedString(resourcesCount)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
