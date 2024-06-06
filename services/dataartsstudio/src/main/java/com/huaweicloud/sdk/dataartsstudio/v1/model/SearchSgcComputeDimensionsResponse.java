package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class SearchSgcComputeDimensionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computes")

    private List<ComputeDimension> computes = null;

    public SearchSgcComputeDimensionsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public SearchSgcComputeDimensionsResponse withComputes(List<ComputeDimension> computes) {
        this.computes = computes;
        return this;
    }

    public SearchSgcComputeDimensionsResponse addComputesItem(ComputeDimension computesItem) {
        if (this.computes == null) {
            this.computes = new ArrayList<>();
        }
        this.computes.add(computesItem);
        return this;
    }

    public SearchSgcComputeDimensionsResponse withComputes(Consumer<List<ComputeDimension>> computesSetter) {
        if (this.computes == null) {
            this.computes = new ArrayList<>();
        }
        computesSetter.accept(this.computes);
        return this;
    }

    /**
     * 计算成本实例列表
     * @return computes
     */
    public List<ComputeDimension> getComputes() {
        return computes;
    }

    public void setComputes(List<ComputeDimension> computes) {
        this.computes = computes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchSgcComputeDimensionsResponse that = (SearchSgcComputeDimensionsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.computes, that.computes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, computes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSgcComputeDimensionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    computes: ").append(toIndentedString(computes)).append("\n");
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
