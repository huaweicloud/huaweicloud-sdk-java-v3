package com.huaweicloud.sdk.rds.v3.model;

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
public class ListEngineFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_flavors")

    private List<EngineFlavorData> optionalFlavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListEngineFlavorsResponse withOptionalFlavors(List<EngineFlavorData> optionalFlavors) {
        this.optionalFlavors = optionalFlavors;
        return this;
    }

    public ListEngineFlavorsResponse addOptionalFlavorsItem(EngineFlavorData optionalFlavorsItem) {
        if (this.optionalFlavors == null) {
            this.optionalFlavors = new ArrayList<>();
        }
        this.optionalFlavors.add(optionalFlavorsItem);
        return this;
    }

    public ListEngineFlavorsResponse withOptionalFlavors(Consumer<List<EngineFlavorData>> optionalFlavorsSetter) {
        if (this.optionalFlavors == null) {
            this.optionalFlavors = new ArrayList<>();
        }
        optionalFlavorsSetter.accept(this.optionalFlavors);
        return this;
    }

    /**
     * 可用的规格列表信息
     * @return optionalFlavors
     */
    public List<EngineFlavorData> getOptionalFlavors() {
        return optionalFlavors;
    }

    public void setOptionalFlavors(List<EngineFlavorData> optionalFlavors) {
        this.optionalFlavors = optionalFlavors;
    }

    public ListEngineFlavorsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 可用的规格总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEngineFlavorsResponse listEngineFlavorsResponse = (ListEngineFlavorsResponse) o;
        return Objects.equals(this.optionalFlavors, listEngineFlavorsResponse.optionalFlavors)
            && Objects.equals(this.totalCount, listEngineFlavorsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionalFlavors, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEngineFlavorsResponse {\n");
        sb.append("    optionalFlavors: ").append(toIndentedString(optionalFlavors)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
