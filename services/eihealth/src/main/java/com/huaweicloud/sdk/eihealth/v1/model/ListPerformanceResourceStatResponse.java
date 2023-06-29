package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListPerformanceResourceStatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance_resources")

    private List<PerformanceResourcesRsp> performanceResources = null;

    public ListPerformanceResourceStatResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 性能加速资源总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPerformanceResourceStatResponse withPerformanceResources(
        List<PerformanceResourcesRsp> performanceResources) {
        this.performanceResources = performanceResources;
        return this;
    }

    public ListPerformanceResourceStatResponse addPerformanceResourcesItem(
        PerformanceResourcesRsp performanceResourcesItem) {
        if (this.performanceResources == null) {
            this.performanceResources = new ArrayList<>();
        }
        this.performanceResources.add(performanceResourcesItem);
        return this;
    }

    public ListPerformanceResourceStatResponse withPerformanceResources(
        Consumer<List<PerformanceResourcesRsp>> performanceResourcesSetter) {
        if (this.performanceResources == null) {
            this.performanceResources = new ArrayList<>();
        }
        performanceResourcesSetter.accept(this.performanceResources);
        return this;
    }

    /**
     * 性能加速资源信息
     * @return performanceResources
     */
    public List<PerformanceResourcesRsp> getPerformanceResources() {
        return performanceResources;
    }

    public void setPerformanceResources(List<PerformanceResourcesRsp> performanceResources) {
        this.performanceResources = performanceResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPerformanceResourceStatResponse that = (ListPerformanceResourceStatResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.performanceResources, that.performanceResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, performanceResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPerformanceResourceStatResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    performanceResources: ").append(toIndentedString(performanceResources)).append("\n");
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
