package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class ListComputingResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resources")

    private List<ComputingResource> computingResources = null;

    public ListComputingResourcesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 计算资源总个数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListComputingResourcesResponse withComputingResources(List<ComputingResource> computingResources) {
        this.computingResources = computingResources;
        return this;
    }

    public ListComputingResourcesResponse addComputingResourcesItem(ComputingResource computingResourcesItem) {
        if (this.computingResources == null) {
            this.computingResources = new ArrayList<>();
        }
        this.computingResources.add(computingResourcesItem);
        return this;
    }

    public ListComputingResourcesResponse withComputingResources(
        Consumer<List<ComputingResource>> computingResourcesSetter) {
        if (this.computingResources == null) {
            this.computingResources = new ArrayList<>();
        }
        computingResourcesSetter.accept(this.computingResources);
        return this;
    }

    /**
     * 计算资源列表。
     * @return computingResources
     */
    public List<ComputingResource> getComputingResources() {
        return computingResources;
    }

    public void setComputingResources(List<ComputingResource> computingResources) {
        this.computingResources = computingResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListComputingResourcesResponse that = (ListComputingResourcesResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.computingResources, that.computingResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, computingResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComputingResourcesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    computingResources: ").append(toIndentedString(computingResources)).append("\n");
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
